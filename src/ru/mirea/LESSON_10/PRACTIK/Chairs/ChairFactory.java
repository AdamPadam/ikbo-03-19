package ru.mirea.LESSON_10.PRACTIK.Chairs;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(200);
    }

    @Override
    public MagicChair createMagicChair() {
        return null;
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return null;
    }
}
