import com.myfun.packages
def name_num(String name, String number) {
    object = new packages()
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
