package com.raydonmuregi.demo;


import javafx.geometry.Point2D;
import javafx.geometry.Point3D;
import javafx.scene.effect.Light;

import java.util.Date;

public class Main {
    public static void main (String[] args) {
        Point2D point1 = new Point2D(1,1);
        Point2D point2 = point1;


        System.out.println(point2);
    }
}
