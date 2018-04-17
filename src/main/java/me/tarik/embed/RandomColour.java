package me.tarik.embed;
import java.awt.*;

import java.util.Random;


public class RandomColour {

        public static int getRed() {

            Random rand = new Random();

            int red = rand.nextInt(255);

            return red;

        }

        public static int getGreen() {

            Random rand = new Random();

            int green = rand.nextInt(255);

            return green;
        }

        public static int getBlue() {

            Random rand = new Random();

            int blue = rand.nextInt(255);

            return blue;
        }

        public Color colour = new Color(getRed(), getGreen(), getBlue());

    public Color getColour() {
        return colour;
    }
}


