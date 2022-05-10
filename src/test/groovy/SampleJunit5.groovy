class SampleJunit5 {
    @org.junit.jupiter.api.Test
    void pingGoogleInJunit5() {
        def address = InetAddress.getByName("google.com")
        println "Pinging google from junit5 test now..."
        assert address.isReachable(60000)
    }
}