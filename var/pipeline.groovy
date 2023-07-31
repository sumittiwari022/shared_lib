import com.myfun
def call(String name, String number) {
    obj = new Function
    pipeline {
        agent any

        stages {
            stage('Hello') {
                steps {
                    echo 'Hello World'
                    script {
                        obj.info(name, number)
                    }
                }
            }
        }
    }
}
