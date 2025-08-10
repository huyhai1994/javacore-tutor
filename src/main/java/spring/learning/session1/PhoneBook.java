package spring.learning.session1;

public class PhoneBook {
    // OOP: object-oriented programing
    // Unit test
    String name;
    String phone;
    String email;

    // constructor : jvm, => object
    public PhoneBook(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + ", phone='" + phone + '\'' + ", email='" + email + '\'' + '}';
    }
}
