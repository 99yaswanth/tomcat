//Descriptive pipeline
pipeline{
    agent any
    stages{
        stage("tomcat installation"){
            steps{
                println "install tomcat"
                sh """
                ssh -i /tmp/nvirginia.pem ec2-user@44.199.232.231
                 sudo yum install tomcat -y
                 sudo yum install tomcat-webapps tomcat-admin-webapps tomcat-docs-webapp tomcat-javadoc -y
                 sudo systemctl start tomcat

                chkconfig tomcat on
                """

            }
        }
    }
}