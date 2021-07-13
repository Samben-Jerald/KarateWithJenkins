pipeline {
agent any
    stages {
        stage('Maven Build') {
          git 'https://github.com/samben01/KarateWithJenkins'
          def mavenHome = tool name: 'Maven', type: 'maven'
          sh "${mavenHome}/bin/mvn test"
            
            }

        }
    }

