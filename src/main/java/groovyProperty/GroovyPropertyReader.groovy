package groovyProperty

class GroovyPropertyReader {
    @SuppressWarnings("GroovyAssignabilityCheck")
    public static void main(String[] args) {

        def prod = new Config().getEnv('info')

        println "full_name: " + prod.full_name
        println "email: " + prod.mail
    }
}
