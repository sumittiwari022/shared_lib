import com.myfun
def info(String name, String number) {
    object = new Utility
    pipeline {
        agent any
        stages {
            stage('Hello') {
                steps {
                    echo 'Hello World'
                    script {
                        object.fun(name, number)
                    }
                }
            }
        }
    }
}
