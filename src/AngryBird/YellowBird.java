package AngryBird;

/**
 * Created by Lenovo on 2018/3/22.
 */
public class YellowBird extends Bird {
    public YellowBird(String name) {
        super(name, "yellow");
    }

    @Override
    public void fly() {
        System.out.println("加速飞");
    }
}
