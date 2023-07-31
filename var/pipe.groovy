import com.fun
def pipe(String name, String number)
{
    obj = new fun()
    pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                script{
                    obj.test(name, number)
                }
            }
        }
    }
}
}