import junit.framework.TestCase.assertEquals
import org.junit.Test

class HelloWorldTest {

    @Test
    fun helloWorldTest() {
        assertEquals("Hello, World!", hello())
    }

}
