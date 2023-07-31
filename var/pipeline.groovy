def call(String name, String number) {
    pipeline {
        agent any

        stages {
            stage('Hello') {
                steps {
                    echo 'Hello World'
                    script {
                        com.myfun.info(name, number)
                    }
                }
            }
        }
    }
}
