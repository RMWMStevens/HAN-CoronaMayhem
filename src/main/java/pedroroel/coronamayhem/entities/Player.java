package pedroroel.coronamayhem.entities;

import nl.han.ica.oopg.objects.Sprite;
import pedroroel.coronamayhem.CoronaMayhem;

public class Player extends Person {
    final int size = 25;

    public Player(CoronaMayhem world) {
        super(world, new Sprite("src/main/java/pedroroel/coronamayhem/assets/images/doctor_mask.png"));
        setCurrentFrameIndex(1);
        setFriction(0.01f);
        setGravity(0.1f);
    }

    @Override
    public void update() {
        if (getX() <= 0) {
            setxSpeed(0);
            setX(0);
        }
        if (getY() <= 0) {
            setySpeed(0);
            setY(0);
        }
        if (getX() >= world.width - size) {
            setxSpeed(0);
            setX(world.width - size);
        }
        if (getY() >= world.height - size) {
            setySpeed(0);
            setY(world.height - size);
        }
    }

    @Override
    public void keyPressed(int keyCode, char key) {
        if (key == 'w') { // up
            setDirectionSpeed(0, 3 * speed);
        }
        if (key == 'a') { // left
            setDirectionSpeed(270, (float) (1.5 * speed));
            setCurrentFrameIndex(0);
        }
        if (key == 'd') { // right
            setDirectionSpeed(90, (float) (1.5 * speed));
            setCurrentFrameIndex(1);
        }

//        if (keyCode == world.LEFT) {
//            setDirectionSpeed(270, speed);
//            setCurrentFrameIndex(0);
//        }
//        if (keyCode == world.UP) {
//            setDirectionSpeed(0, speed);
//        }
//        if (keyCode == world.RIGHT) {
//            setDirectionSpeed(90, speed);
//            setCurrentFrameIndex(1);
//        }
//        if (keyCode == world.DOWN) {
//            setDirectionSpeed(180, speed);
//        }
//        if (key == ' ') {
//            System.out.println("Spatie!");
//        }
    }
}
