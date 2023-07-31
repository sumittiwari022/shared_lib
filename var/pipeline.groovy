def call(body) {
    // Delegates the call to the pipeline block defined in the Jenkinsfile
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    pipeline {
        agent any
        stages {
            stage('Hello') {
                steps {
                    echo 'Hello World'
                    script {
                        com.myfun.info(config.name, config.number)
                    }
                }
            }
        }
    }
}
