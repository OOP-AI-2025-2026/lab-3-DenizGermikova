package org.example.task1;

public class Main1 {
    public static void main(String[] args) {
        try {
            Box box = new Box(2, 3, 4);

            System.out.println("Surface Area = " + box.getSurfaceArea());
            System.out.println("Lateral Surface Area = " + box.getLateralSurfaceArea());
            System.out.println("Volume = " + box.getVolume());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
