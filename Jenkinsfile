pipeline {
    agent any

    stages {
        stage('Delivery') {
            steps {
                dir ('ver01-CICD') {
		    echo 'Deploying package...'
		    echo '== Clean port 8089'
                    echo '== Deploy package'
					mvn install
					mvn clean
					mvn deploy
					dir
					
		}
		input message: 'Shutdown Webtrade (Force to stop now)?'
            }
        }
    }
}
