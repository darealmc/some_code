pipeline {
  agent any
  stages {
    stage('echo') {
      steps {
        echo 'hello'
      }
    }

  }
  triggers {
    cron('H/15 * * * *')
  }
}