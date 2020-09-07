package ru.mirea.LESSON_2.LAB.Human;

public class Hand {

    private boolean isRight;
    private int strong;

    public Hand(boolean isRight, int strong) {
        this.isRight = isRight;
        this.strong = strong;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public String use() {
        return isRight ? "берет правой рукой" : "берет левой рукой";
    }
}
