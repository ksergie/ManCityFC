pipeline {
    stages {
        stage ('Clean & Test') {
            steps {
                sh 'mvn -B -e -q clean verify'
                publishHTML([
                allowMissing: false,
                alwaysLinkToLastBuild: false,
                keepAll: false,
                reportDir: 'target/site/serenity',
                reportFiles: 'index.html',
                reportName: 'Serenity Report',
                reportTitles: ''])
            }
        }
    }
}
