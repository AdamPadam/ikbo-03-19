package ru.mirea.LESSON_2.PRACTIK.Ball;

public class TestBall {

    public static void main(String[] args) {
        Ball ball = new Ball(3.3, 3.3);
        System.out.println(ball);
        ball.setXY(1.1, 2.2);
        System.out.println(ball);
        ball.move(2.1, -3.2);
        System.out.println(ball);
    }
}
