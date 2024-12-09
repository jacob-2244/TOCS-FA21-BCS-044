pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code for the current branch
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Compile the Java program
                sh 'javac Square.java'
            }
        }
        stage('Run') {
            steps {
                // Run the Java program to calculate the square of a number
                sh 'java Square'
            }
        }
    }
    post {
        always {
            // Clean up workspace
            cleanWs()
        }
    }
}
