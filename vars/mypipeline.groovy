import com.myfun.Utility
def call(String name, String number) {
    object = new Utility()
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
