// StringUtilsTest.java
import org.example.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("cba", utils.reverse("abc"));
        assertEquals("madam", utils.reverse("madam")); // palindrome remains same
        assertEquals("", utils.reverse("")); // empty string
        assertNull(utils.reverse(null)); // null case
    }

    @Test
    void testIsPalindrome() {
        assertTrue(utils.isPalindrome("madam"));
        assertTrue(utils.isPalindrome("RaceCar")); // case-insensitive
        assertFalse(utils.isPalindrome("hello"));
        assertFalse(utils.isPalindrome(null)); // null case
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
        assertEquals("JAVA", utils.toUpperCase("Java"));
        assertEquals("", utils.toUpperCase("")); // empty string
        assertNull(utils.toUpperCase(null)); // null case
    }
}
