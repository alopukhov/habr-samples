import org.junit.platform.suite.api.*

@Suite
@SuiteDisplayName("Sample Suite for Habr")
@SelectClasses([SampleJunit4, SampleJunit5, SampleTestNG, SampleSpockSpeck])
class SuiteTest {
}
