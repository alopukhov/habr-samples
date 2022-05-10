class SampleSpockSpeck extends spock.lang.Specification {
    def "ping google in Spock"() {
        expect:
        println "Pinging google from spock now"
        InetAddress.getByName("google.com").isReachable(60000)
    }
}