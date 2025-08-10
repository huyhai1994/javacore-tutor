package spring.learning.session1;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PhoneBookTest {


    @Test
    @DisplayName("test getName()")
    void getName() {
        PhoneBook phonebook = new PhoneBook("abc", "555-4444", "abc@gmail.com");
        assertEquals("abc", phonebook.getName());
    }
}