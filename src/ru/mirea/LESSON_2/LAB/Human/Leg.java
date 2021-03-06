package ru.mirea.LESSON_2.LAB.Human;

public class Leg {

    private boolean isRight;
    private int speed;

    public Leg(boolean isRight, int speed) {
        this.isRight = isRight;
        this.speed = speed;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String use() {
        return isRight ? "идет правой ногой" : "идет левой ногой";
    }
}
