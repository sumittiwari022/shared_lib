import com.myfun.pack
def call(String name, String number) {
    object = new pack()
    pipeline {
        agent any
        stages {
            stage('Hello') {
                steps {
                    echo 'Hello World'
                    script {
                        object.name_number(name, number)
                    }
                }
            }
        }
    }
}
