pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World from Groovy!'
            }
        }

        stage('Run Python Script') {
            steps {
                // This runs your Python file
                sh 'python3 script.py'
            }
        }
    }
}
