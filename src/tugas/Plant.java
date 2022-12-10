package tugas;

public class Plant {
    public void doDestroy(Destroyable d) {
        if(d instanceof JumpingZombie) {
            JumpingZombie jz = (JumpingZombie) d;
            for(int i = 0; i <= 2; i++) {
                jz.destroyed();
            }
            jz.heal();
        } else if(d instanceof WalkingZombie) {
            WalkingZombie wz = (WalkingZombie) d;
            for(int i = 0; i <= 2; i++) {
                wz.destroyed();
            }
            wz.heal();
        } else if(d instanceof Barrier) {
            Barrier b = (Barrier) d;
            b.destroyed();
        }
    }
}
