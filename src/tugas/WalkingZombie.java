package tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            this.health += (0.1 * health);
        } else if (level == 2) {
            this.health += (0.3 * health);
        } else if(level == 3) {
            this.health += (0.4 * health);
        }
    }

    @Override
    public void destroyed() {
        this.health -= (0.2 * health);
        if(health <= 0) {
            System.out.println("Zombie is dead");
        }
    }
}
