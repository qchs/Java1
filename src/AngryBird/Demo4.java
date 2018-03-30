package AngryBird;

/**
 * Created by Lenovo on 2018/3/22.
 */
public class Demo4 {
    public static void main(String[] args) {
        RedBird redBird= new RedBird("r");
        BlueBird blueBird = new BlueBird("b");
        YellowBird yellowBird   = new YellowBird("y");

        SlingShot slingShot = new SlingShot();
        redBird.fly();
        blueBird.fly();
        yellowBird.fly();

        slingShot.shot(redBird);
        slingShot.shot(blueBird);
    }

}
