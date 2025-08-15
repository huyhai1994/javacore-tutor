package spring.learning.session4;

import org.junit.jupiter.api.Test;

class FamilyDoctorTest {
    @Test
    void testInheritMethod() {
        FamilyDoctor familyDoctor = new FamilyDoctor();
        familyDoctor.treatPatient();
    }
}