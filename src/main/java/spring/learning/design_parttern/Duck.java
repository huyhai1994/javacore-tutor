package spring.learning.design_parttern;

abstract class Duck {
    public void quack() {
        System.out.println("Quack!");
    }

    public void swim() {
        System.out.println("Swimming...");
    }

    public abstract void display();
}

class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I look like a Mallard!");
        System.out.println("I look like a Mallard2!");
    }
}

class RedheadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I look like a Redhead Duck!");
    }
}

class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I look like a Rubber Duck!");
    }
}

