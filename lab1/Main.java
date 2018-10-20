package com.company;

public class Main {
    public static void main(String[] args) {
        Monitor Sony = new Monitor();
        Sony.setParametress("17","Silver","1920x1080" );
        Sony.show();

        Monitor Asus = new Monitor();
        Asus.setParametress("14","Red","1270x920" );
        Asus.show();

        System.out.println(Sony.equals(Asus));
    }

}
