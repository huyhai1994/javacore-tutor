package spring.learning.session7.stream_api;

public class Mountain {
    private String name;
    private int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Mountain() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return
                "{ name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
