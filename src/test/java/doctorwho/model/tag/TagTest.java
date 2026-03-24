package doctorwho.model.tag;

import static doctorwho.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class TagTest {

    /**
     * Tests that checking validity of a null tag name throws a NullPointerException.
     */
    @Test
    public void isValidTagName() {
        // null tag name
        assertThrows(NullPointerException.class, () -> Tag.isValidTagName(null));
    }
}
