package tugas;

public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        this.strength -= 12;
        if(strength <= 0) {
            System.out.println("Barrier is broke");
        }
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength;
    }
}
