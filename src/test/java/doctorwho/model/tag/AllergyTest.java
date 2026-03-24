package doctorwho.model.tag;

import static doctorwho.logic.commands.CommandTestUtil.VALID_ALLERGY_ASPIRIN;
import static doctorwho.testutil.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AllergyTest {

    /**
     * Tests that constructing an Allergy with a valid name produces the correct string representation.
     */
    @Test
    public void constructor_validName_success() {
        Allergy allergy = new Allergy(VALID_ALLERGY_ASPIRIN);
        assertEquals("[Aspirin]", allergy.toString());
    }

    /**
     * Tests that constructing an Allergy with a null name throws a NullPointerException.
     */
    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Allergy(null));
    }

    /**
     * Tests that constructing an Allergy with an invalid name throws an IllegalArgumentException.
     */
    @Test
    public void constructor_invalidName_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Allergy(""));
    }
}
