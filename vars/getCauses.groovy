def call() {
    return currentBuild.rawBuild.getCauses()
}
