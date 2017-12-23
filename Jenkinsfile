pipeline {
    agent any

    stages {
		stage('Checkout'){
			steps{
				echo 'Stage Checkout...'
		   }
       }
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
					bat 'mvn -version'
					bat 'mvn clean'
					bat 'mvn install'
					bat 'mvn package'
					
					bat 'java -jar target/JenkinsDemo-0.0.1-SNAPSHOT-fat.jar'
            }
        }
    }
}
