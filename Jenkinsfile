pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvnLocal package clean'
            }
            post {
                success {
                    echo 'Now Archiving'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
    }
}