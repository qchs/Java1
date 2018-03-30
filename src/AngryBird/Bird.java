package AngryBird;

/**
 * Created by Lenovo on 2018/3/22.
 */
public abstract class Bird {
    String name;
    String colour;
    int a;

    public Bird(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public abstract void fly();

}
