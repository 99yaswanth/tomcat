//Descriptive pipeline
pipeline{
    agent any
    stages{
        stage("tomcat installation"){
            steps{
                println "install tomcat"
                sh """
                ssh -i /tmp/nvirginia.pem root@44.199.232.231
                 yum install tomcat -y
                 yum install tomcat-webapps tomcat-admin-webapps tomcat-docs-webapp tomcat-javadoc -y
                 systemctl start tomcat

                chkconfig tomcat on
                """

            }
        }
    }
}