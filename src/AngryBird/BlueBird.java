package AngryBird;

/**
 * Created by Lenovo on 2018/3/22.
 */
public class BlueBird extends  Bird {

    public BlueBird(String name) {
        super(name, "blue");
    }

    @Override
    public void fly() {
        System.out.println("分三个方向飞");
    }
}
