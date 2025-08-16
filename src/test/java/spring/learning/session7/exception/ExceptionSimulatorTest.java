package spring.learning.session7.exception;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionSimulatorTest {
    @Test
    @DisplayName("Test that method throw  CustomException when input is -1")
    void testValidateAgeWithMinusInput() {
        assertThrows(CustomException.class, () -> ExceptionSimulator.validateAge(-1));
    }

    @Test
    @DisplayName("Test that method throw  CustomException when input is big")
    void testValidateAgeWithBigInput() {
        assertThrows(CustomException.class, () -> ExceptionSimulator.validateAge(1000));
    }

}