class FailingTest {
    @org.junit.jupiter.api.Test
    void thisWillFail() { assert 2 * 2 == 5 }

    @org.junit.jupiter.api.Test
    void thisWillPass() { assert 2 * 2 == 4 }
}
