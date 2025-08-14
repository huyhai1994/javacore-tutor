package spring.learning.session3;

public class C {
    private int p;


    public C() {
        System.out.println("C's no-arg constructor invoked");
        this(0); // wrong order -> Java requires that the this (arg-list) statement appear first in the constructor before any other executable statements.
    }

    public C(int p) {
        p = p;
    }

    public void setP(int p) {
        p = p;
    }
}
