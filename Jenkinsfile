pipeline {
    agent any

    stages {
        stage('Delivery') {
            steps {
                dir ('ver01-CICD') {
		    echo 'Deploying package...'
		    echo '== Clean port 8089'
                    echo '== Deploy package'
					bat 'java -jar target/JenkinsDemo-0.0.1-SNAPSHOT-fat.jar' 
		}
		input message: 'Shutdown Webtrade (Force to stop now)?'
            }
        }
    }
}
