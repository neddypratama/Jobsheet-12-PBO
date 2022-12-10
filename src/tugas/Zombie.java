package tugas;

public abstract class Zombie implements Destroyable{
    protected int health;
    protected int level;

    public abstract void heal();
    @Override
    public void destroyed() {
        this.health -= 10;
    }
    public String getZombieInfo() {
        return "Walking Zombie Data = \n" +
        "Health = " + health + "\n" +
        "Level = " + level;
    }
}
