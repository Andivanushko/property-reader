package groovyProperty

class Config {

    final String CONFIG_FILE = 'src/main/resources/config.groovy'
    final String ENVIRONMENTS = 'info'

    def read() {
        new File(CONFIG_FILE).text
    }

    def getEnv(String envName) {
        def config = new ConfigSlurper(envName)
        config.registerConditionalBlock(ENVIRONMENTS, envName)
        config.parse(read())
    }
}
