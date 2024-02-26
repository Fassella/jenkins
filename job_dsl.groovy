// Job 1
job('job-exemple-1') {
    description('Ceci est le premier job exemple.')
    scm {
        git('https://github.com/Fassella/jenkins.git')
    }
    triggers {
        scm('H */4 * * *')
    }
    steps {
        shell('echo Hello from Job 1')
    }
}

// Job 2
job('job-exemple-2') {
    description('Ceci est le second job exemple.')
    scm {
        git('https://github.com/Fassella/jenkins.git')
    }
    triggers {
        scm('H */8 * * *')
    }
    steps {
        shell('echo Hello from Job 2')
    }
}
