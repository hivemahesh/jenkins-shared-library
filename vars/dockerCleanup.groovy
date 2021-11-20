def call(String project, String hubUser) {
   sh "docker rmi ${hubUser}/${project}:latest"
   sh "docker rmi ${hubUser}/${project}:${currentBuild.Number}"
}
