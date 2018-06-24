pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                def mvnVersion = 'mvnLocal'
                withEnv(["PATH+MAVEN=${tool mvnVersion}/bin"]) {
                    sh 'mvn package clean'
                }
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