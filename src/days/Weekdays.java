/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

public class Weekdays {
    public enum Day {
        ONE("Monday"),
        TWO("Tuesday"),
        THREE("Wednesday"),
        FOUR("Thursday"),
        FIVE("Friday"),
        SIX("Saturday"),
        SEVEN("Sunday");

        private final String name;

        Day(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        printAllDays();
        assignDayVariables();
    }

    public static void printAllDays() {
        for (Day day : Day.values()) {
            System.out.println(day.getName());
        }
    }

    public static void assignDayVariables() {
        Day one = Day.ONE;
        Day two = Day.TWO;
        Day three = Day.THREE;
        Day four = Day.FOUR;
        Day five = Day.FIVE;
        Day six = Day.SIX;
        Day seven = Day.SEVEN;

        System.out.println("Variables assigned for each day:");
        System.out.println("One: " + one.getName());
        System.out.println("Two: " + two.getName());
        System.out.println("Three: " + three.getName());
        System.out.println("Four: " + four.getName());
        System.out.println("Five: " + five.getName());
        System.out.println("Six: " + six.getName());
        System.out.println("Seven: " + seven.getName());
    }
}


