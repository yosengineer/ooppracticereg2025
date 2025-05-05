// single line comment
/*
    multi-line comment
 */

package lab08;

import java.awt.Color;

/**
 * This is a class definition where a car is defined
 */
class Racecar {
    private String name;
    private Color color;
    private static final double TOP_SPEED = 200;

    public Racecar(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    /**
     *
     * @param car1
     * @param car2
     * @return Racecar
     */
    public static Racecar race(Racecar car1, Racecar car2) {
        Racecar winner = null;

        double speed1 = Math.random() * TOP_SPEED;
        double speed2 = Math.random() * TOP_SPEED;

        if (speed1 > speed2) {
            winner = car1;
        } else if (speed1 < speed2) {
            winner = car2;
        }

        return winner;
    }

    public static void main(String[] args) {
        Racecar car1 = new Racecar("Vitz", Color.RED);
        Racecar car2 = new Racecar("BYD", Color.BLUE);

        Racecar winner = Racecar.race(car1, car2);
        if (winner == null) {
            System.out.println("It's a tie!");
        } else {
            System.out.printf("The winner is: %s, colored: %s.\n",
                    winner.getName(), winner.getColor());
        }
    }
}
