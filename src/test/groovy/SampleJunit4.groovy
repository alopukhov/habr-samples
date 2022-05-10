class SampleJunit4 {
    @org.junit.Test
    void pingGoogleInJunit4() {
        def address = InetAddress.getByName("google.com")
        println "Pinging google from junit4 test now..."
        assert address.isReachable(60000)
    }
}