node{
	try {
		stage('Git Repository Checkout') {
			git 'https://github.com/zeeshan2019/CICD-Devops.git'
		}
		stage('Clean Stage') {
			sh 'mvn clean'
		}
		stage('Build Stage') {
			sh 'mvn compile'
		}
		stage('Test Stage') {
			sh 'mvn test'
		}
		stage('Stage Install') {
			sh 'mvn install'
		}
	        stage('Sonar Qube scanner') {
        	        sh 'mvn sonar:sonar'
	        }
		stage('Docker Image Build') {
			sh 'docker build -t zeeshan2019/webapp_img:1.0 .'
		}
		stage('Docker Image Push') {
			withCredentials([string(credentialsId: 'dockerPwd', variable: 'dockerHub')]) {
	 	        	sh "docker login -u zeeshan2019 -p ${dockerHub}"
            		}
       	 	sh 'docker push zeeshan2019/webapp_img:1.0'
        	}
        	stage('Auto configuration of Tomcat') {
               		ansiblePlaybook 'install-configure-tomcat.yml'
        	}
	        stage('Deployment on Tomcat') {
        	       sh 'scp -o StrictHostKeyChecking=no target/*.war /usr/local/tomcat/webapps'
        	}
	}catch(err) {
			//Email notification for bad builds
			emailext attachLog: true, body: 'This is to inform that  $BUILD_NUMBER has failed. "${err}". Kindly refer to logs attached.', replyTo: 'noreply@jenkinsbootcamp.com', subject: 'Build no: $BUILD_NUMBER has failed', to: 'zee2020.sj@gmail.com'
		    }
}
