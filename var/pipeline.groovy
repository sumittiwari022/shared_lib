import com.myfun
def call(String name, String number)
{
    object = new Function()

    pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                script{
                    obj.info(name, number)
                }
            }
        }
    }
}
}