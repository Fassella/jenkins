FROM jenkins/jenkins:lts
COPY configuration.yml /var/jenkins_home/casc_configs/configuration.yml
