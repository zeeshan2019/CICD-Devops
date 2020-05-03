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
	stage('Docker Image Build') {
		sh 'docker build -t zeeshan2019/webapp_img:1.0 .'
	}
	stage('Docker Image Push') {
		withCredentials([string(credentialsId: 'dockerPwd', variable: 'dockerHub')]) {
            sh "docker login -u zeeshan2019 -p ${dockerHub}"
        }
        sh 'docker push zeeshan2019/webapp_img:1.0'
    }
	stage('Docker Pull Image') {
		sh 'docker pull zeeshan2019/webapp_img:1.0'
	}
	stage('Run Docker Container') {
		sh 'docker run --name cicdWebAppCont -p 8080:8080 -d zeeshan2019/webapp_img:1.0'
	}
}
