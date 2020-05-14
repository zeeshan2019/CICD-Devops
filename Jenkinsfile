node{
	stage('Git Repository Checkout') {
		git 'https://github.com/zeeshan2019/CICD-Devops'
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
        stage('Sonar Qube scan') {
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
	stage('Email notification for bad builds') {
		//WIP
	}
        stage('Auto configuration of Tomcat') {
               sh 'ansible-playbook install-configure-tomcat.yml'
        }
        stage('Deployment on Tomcat') {
               sh 'scp -o StrictHostKeyChecking=no target/*.war /usr/local/tomcat/webapps'
        }
}
