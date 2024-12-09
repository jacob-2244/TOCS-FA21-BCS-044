pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/jacob-2244/TOCS-FA21-BCS-044.git'
            }
        }

        stage('Build') {
            steps {
                sh 'javac index.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java index'
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}

