//Descriptive pipeline
pipeline{
    agent any
    stages{
        stage("tomcat installation"){
            steps{
                println "install tomcat"
                sh """
                sudo yum install tomcat -y
                sudo yum install tomcat-webapps tomcat-admin-webapps tomcat-docs-webapp tomcat-javadoc -y
                sudo systemctl start tomcat

                chkconfig tomcat on
                """

            }
        }
    }
}