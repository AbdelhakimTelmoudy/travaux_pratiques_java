package com.devit.tp_heritage;

public class Main {
    public static void main(String[] args) {
        Cercle cercle = new Cercle("Cercle 1", 5);
        Rectangle rectangle = new Rectangle("Rectangle 1", 4, 6);

        cercle.afficherDetails();
        System.out.println("------------------------");
        rectangle.afficherDetails();
    }
}