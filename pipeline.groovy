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
                sh 'hello_world.py'
            }
        }
    }
}
