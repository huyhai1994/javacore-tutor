package spring.learning.session4;

public abstract class SuperTest {
    SuperTest() {
        System.out.println("This is super class, no object is created");
    }

    abstract void printSomeThing();
}

class SuperSub extends SuperTest {
    SuperSub() {
        super();
        System.out.println("This is sub class, object is created");
    }

    @Override
    void printSomeThing() {
        System.out.println("This is super sub print go brrrr!");
    }

    void superSubPrint() {
        System.out.println("This is super sub class!");
    }

    public static void main(String args[]) {
        SuperTest test = new SuperSub();
        test.printSomeThing();
        ((SuperSub) test).superSubPrint();
    }
}