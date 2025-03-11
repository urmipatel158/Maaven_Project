pipeline {
    agent any

    tools {
        // Define the tools required for the build
        maven 'Maven 3.6.3' // This should match the Maven version installed on Jenkins
        jdk 'JDK 11' // This should match the JDK version installed on Jenkins
    }

    environment {
        // Define any environment variables
        GIT_REPO = 'https://github.com/urmipatel158/Maaven_Project.git'
        GIT_BRANCH = 'main'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the Git repository
                git branch: "${GIT_BRANCH}", url: "${GIT_REPO}"
            }
        }
        
        stage('Build') {
            steps {
                // Build the Maven project
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run the tests
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Package the application
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                // Add your deployment steps here
                // For example, you could deploy to a server or upload to a repository
                echo 'Deploying application...'
            }
        }
    }

    post {
        always {
            // Archive the artifacts and publish test results
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            junit 'target/surefire-reports/**/*.xml'
        }
    }
}
