import com.myfun.pack
def name_num(String name, String number) {
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
