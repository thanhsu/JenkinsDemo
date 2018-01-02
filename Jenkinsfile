pipeline {
    agent any

    stages {
		stage('Test'){
			steps{
				echo 'Stage Test...'
       }
	   }
        stage('Delivery') {
            steps {
				echo 'Deploying package...'
				echo 'Must Close Port 8089 Before '
                    echo '== Deploy package'
					bat 'dir'
					
					
					bat 'java -jar target/JenkinsDemo-0.0.1-SNAPSHOT-fat.jar'
            }
        }
    }
}
