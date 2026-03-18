package seedu.address.model.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.patient.Patient;

public class SampleDataUtilTest {

    @Test
    public void getSamplePersons_returnsCorrectCount() {
        Patient[] patients = SampleDataUtil.getSamplePersons();
        assertEquals(6, patients.length, "getSamplePersons should return exactly 6 patients");
    }

    @Test
    public void getSampleAddressBook_containsAllSamplePersons() {
        ReadOnlyAddressBook ab = SampleDataUtil.getSampleAddressBook();
        assertEquals(6, ab.getPersonList().size(), "Address book should contain exactly 6 sample patients");
    }
}