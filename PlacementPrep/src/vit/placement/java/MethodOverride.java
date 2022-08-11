package vit.placement.java;

public class MethodOverride {


    public static void main(String[] args) {

        Jasif j = new Jasif();
        j.number(6);

        Pasha p = new Pasha();
        p.number(6);

        Jasif a = new Pasha();
        a.number(6);
    }

}


class Jasif {
    public void number(int num) {
        System.out.println("Jasif");
    }
}


class Pasha extends Jasif {

    @Override
    public void number(int num) {
        System.out.println("Pasha");
    }
}
