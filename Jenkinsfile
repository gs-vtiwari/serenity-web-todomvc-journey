pipeline {
  agent any
  stages {
    stage('gdm-automation') {
      steps {
        parallel(
          "gdm-automation": {
            sh 'print "Running GDM Automation"'
            
          },
          "pnp Automation": {
            sh 'print "Running PNP Automation"'
            
          },
          "Reporting-Automation": {
            sh 'print "Running Reporting"'
            
          }
        )
      }
    }
    stage('Publishing Email') {
      steps {
        sh 'Publishing email'
      }
    }
  }
}