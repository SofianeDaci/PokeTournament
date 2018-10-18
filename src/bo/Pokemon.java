package bo;

public class Pokemon {

    private int health;
    private int power;
    private String name;
    private String winShout;
    private String looseShout;
    private String shout;

    public Pokemon(int health, int power, String name)
    {
        assert health >= 1;
        assert health <= 200;

        this.health = health;
        this.power = power;
        this.name = name;
        this.shout = "Pika pika";
        this.winShout = " YAAAAAA!";
        this.looseShout = "buuuuuuuuh";
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getWinShout() {
        return winShout;
    }

    public String getLooseShout() {
        return looseShout;
    }

    public String getShout() {
        return shout;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}