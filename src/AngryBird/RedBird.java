package AngryBird;

/**
 * Created by Lenovo on 2018/3/22.
 */
public class RedBird extends Bird {
    public RedBird(String name) {
        super(name, "red");
    }

    @Override
    public void fly() {
        System.out.println("正常飞啊飞");
    }
}
