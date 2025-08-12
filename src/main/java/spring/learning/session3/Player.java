package spring.learning.session3;

public class Player {
    static int playerCount;
    private String name;

    public Player(String name) {
        this.name = name;
        playerCount++;
    }

    public Player() {
        this.name = "some guy";
        playerCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
