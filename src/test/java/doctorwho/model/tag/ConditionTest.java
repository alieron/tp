package doctorwho.model.tag;

import static doctorwho.testutil.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConditionTest {

    /**
     * Tests that constructing a Condition with a valid name produces the correct string representation.
     */
    @Test
    public void constructor_validName_success() {
        Condition condition = new Condition("Asthma");
        assertEquals("[Asthma]", condition.toString());
    }

    /**
     * Tests that constructing a Condition with a null name throws a NullPointerException.
     */
    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Condition(null));
    }

    /**
     * Tests that constructing a Condition with an invalid name throws an IllegalArgumentException.
     */
    @Test
    public void constructor_invalidName_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Condition(""));
    }
}
