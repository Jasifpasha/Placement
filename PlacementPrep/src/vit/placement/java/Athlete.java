package vit.placement.java;

import java.util.Objects;

public class Athlete {

    public String name;
    public double speed;
    public int age;

    @Override
    public boolean equals(Object o) {
        Athlete a = (Athlete) o;
        boolean isEqual = this.name.equals(a.name);
        return isEqual;
    }

    public static void main(String[] args) {


        Athlete a1 = new Athlete();
        a1.name = new String("akheel");
        a1.speed = 10;
        a1.age = 25;


        Athlete a2 = new Athlete();
        a2.name = new String("akheel");
        a2.speed = 10;
        a2.age = 25;

        System.out.println(a1 == a2);
        System.out.println(a1.name == a2.name);

        System.out.println(a1.equals(a2));
        System.out.println(a1.name.equals(a2.name));




    }

}
