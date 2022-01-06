package src.P10.homework;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        switch (input){
            case "red":
                Color.RED.show();
                break;
            case "blue":
                Color.BLUE.show();
                break;
            case "black":
                Color.BLACK.show();
                break;
            case "yellow":
                Color.YELLOW.show();
                break;
            case "green":
                Color.GREEN.show();
                break;
            default:
                break;

        }


    }
}

interface Op{
    void show();
}
enum Color implements Op{
    RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0),GREEN(0,255,0);
    private final int redValue;
    private final int greenValue;
    private final int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue;
    }
}
