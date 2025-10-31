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
                sh 'python3 hello_world.py'
            }
        }
    }
}
