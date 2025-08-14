package spring.learning.session3;

public class Duck {
    int size;

    public Duck(int newSize) {
        System.out.println("Quack");
        if (newSize == 0) {
            size = 27;
        } else {
            size = newSize;
        }
    }
}
