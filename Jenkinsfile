node("windows"){
    stage("Git Checkout"){
        git 'https://github.com/samben01/KarateWithJenkins'
        }
        stage("maven build"){
            
            mvnBuild{
                windowsBuild=true
                mavenGoals="clean test"
            }

        }


}
