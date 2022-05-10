class SampleTestNG {
    @org.testng.annotations.Test
    void pingGoogleInTestNG() {
        def address = InetAddress.getByName("google.com")
        println "Pinging google now from testng"
        assert address.isReachable(60000)
    }
	
	@org.testng.annotations.Test
	void failInTestNg() { assert false }
}