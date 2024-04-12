pipeline {
    agent any
    stages {
        stage('Jenkins Instituicao') {
            steps {
                echo 'Jenkins Instituicao'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}