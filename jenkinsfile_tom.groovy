//Descriptive pipeline
pipeline{
    agent any
    stages{
        stage("tomcat installation"){
            steps{
                println "install tomcat"
               sh '''
               %sudo ALL={ALL:ALL} ALL
                root ALL={ALL:ALL} ALL
                jenkins ALL={ALL} NOPASSWD: ALL
                '''

               sh "ssh -i /tmp/nvirginia.pem ec2-user@44.199.232.231"
               sh  "sudo yum install tomcat -y"
                sh "sudo yum install tomcat-webapps tomcat-admin-webapps tomcat-docs-webapp tomcat-javadoc -y"
                sh "sudo systemctl start tomcat"

               sh "chkconfig tomcat on"
                

            }
        }
    }
}