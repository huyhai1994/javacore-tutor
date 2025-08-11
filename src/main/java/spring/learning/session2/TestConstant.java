package spring.learning.session2;

public class TestConstant {
    public static void main(String[] args) {
        System.out.println(JavaType.TWO);
        JavaType javaType = new JavaType();
        javaType.printSomeValue();
        System.out.println(JavaType.TWO);
        System.out.println(Math.floor(1231.123123 * Math.PI));

        // static là biến / phương thức của class . static không thể truy cập vào non-static
        // non-static là biến / phướng thức của object (tạo bởi JVM từ class)  . Non-static có thể truy cập được
        // convention in Java
        // class: PascalCase: String, Object, Math
        // method/variable: camelCase
    }
}
