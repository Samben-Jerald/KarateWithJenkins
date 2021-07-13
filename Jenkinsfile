pipeline{
    agent any
    tools{
        maven:"Maven"
    }
    stages{
        stage("Git checkout"){
        steps{
            git 'https://github.com/samben01/KarateWithJenkins'
        }
        }
        stage("maven build"){
            mavenGoals="clean test"         
        }
    }
}
