pipeline {
    agent any
    tools {
        maven 'mvnLocal'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'Now Archiving'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
        stage('Deploy to stage') {
            steps {
                build job: 'deploy-to-staging'
            }
        }
    }
}