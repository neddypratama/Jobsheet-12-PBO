package tugas;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            this.health += (0.3 * health);
        } else if (level == 2) {
            this.health += (0.4 * health);
        } else if(level == 3) {
            this.health += (0.5 * health);
        }
    }

    @Override
    public void destroyed() {
        this.health -= (0.1 * health);
        if(health <= 0) {
            System.out.println("Zombie is dead");
        }
    }
}
