package spring.learning.session7.exception;


public class ExceptionSimulator {

    public static void validateAge(int age) throws CustomException {
        if (age < 0) {
            throw new CustomException("Age cannot be negative");
        }
        if (age > 120) {
            throw new CustomException("Age cannot be greater than 120");
        }
        System.out.println("Age " + age + " is valid");
    }

}