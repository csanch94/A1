pipeline {
  agent any

  tools {
    maven 'M3'   // must match the name in Manage Jenkins → Tools
  }

  stages {
    stage('Build & Test') {
      steps {
        sh 'mvn -B -ntp -Dmaven.test.failure.ignore verify'
      }
    }
  }

  post {
    always {
      junit '**/target/surefire-reports/TEST-*.xml'
    }
  }
}