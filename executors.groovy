#!groovy
import jenkins.model.Jenkins

def systemMessage = "Insert your Jenkins system message here."

Jenkins jenkins = Jenkins.getInstance()

jenkins.setSystemMessage(systemMessage)

jenkins.save()