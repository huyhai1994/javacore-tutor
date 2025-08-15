package spring.learning.session4;

public class Test extends A {

    public void m() {
        System.out.println(super.k);
    }

    public static void main(String[] args) {
        Test a = new Test();
        a.m();
    }
}
