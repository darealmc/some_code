pipeline {
  agent any
  trigger('SomeTrigger') {
    cron('H/5 * * * *')
  }
  stages {
    stage('Echo') {
      steps {
        sh 'echo "Hello from the code!!"'
      }
    }

  }
}
