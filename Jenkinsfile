node {
  stage ('Build') {
    git url: 'https://github.com/samben01/KarateWithJenkins'
    withMaven {
      sh "mvn clean verify"
    } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports
  }
}
