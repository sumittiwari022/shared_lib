import com.myfun.Function

def call(String name, String number) {
    object = new Function()

    pipeline {
        agent any

        stages {
            stage('Hello') {
                steps {
                    echo 'Hello World'
                    script {
                        object.info(name, number)
                    }
                }
            }
        }
    }
}
