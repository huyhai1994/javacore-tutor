package spring.learning.session4;

import org.junit.jupiter.api.Test;

class DoctorTest {

    /**
     * This class illustrates a classic Java polymorphism issue: When you declare a variable
     * with type {@code Doctor} but instantiate it as a {@code FamilyDoctor}, you can only access
     * methods that are defined in the {@code Doctor} class or interface, even though the actual
     * object is a {@code FamilyDoctor}.<br>
     * The {@code giveAdvice()} method is defined in the {@code FamilyDoctor} class but not in
     * the parent {@code Doctor} class. The compiler only allows you to call methods that are
     * guaranteed to exist based on the reference type ({@code Doctor}), not the runtime
     * type ({@code FamilyDoctor}).<br>
     * To access the {@code giveAdvice()} method, you would need to either:
     * Cast the object to {@code FamilyDoctor}:
     * {@code ((FamilyDoctor)doctor).giveAdvice();}</li>
     * Change the variable declaration to use {@code FamilyDoctor} type:
     * {@code FamilyDoctor doctor = new FamilyDoctor();}</li> <br>
     * Add the {@code giveAdvice()} method to the {@code Doctor} class/interface
     * if it should be available to all doctor types.</li>
     */

    @Test
    void illustratesClassicJavaPolymorphismIssue() {
        Doctor doctor = new FamilyDoctor();
        doctor.treatPatient();
    }

    @Test
    void fixClassicJavaPolymorphismIssueMethod1() {
        Doctor doctor = new FamilyDoctor();
        ((FamilyDoctor) doctor).giveAdvice();
    }

    @Test
    void fixClassicJavaPolymorphismIssueMethod2() {
        FamilyDoctor doctor = new FamilyDoctor();
        doctor.giveAdvice();
    }
}