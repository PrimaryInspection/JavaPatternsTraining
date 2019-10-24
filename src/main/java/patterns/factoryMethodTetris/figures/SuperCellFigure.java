package patterns.factoryMethodTetris.figures;

import patterns.factoryMethodTetris.Figure;

import java.util.Random;

public class SuperCellFigure implements Figure {

    @SuppressWarnings("all")
    public static int randomizer(int min, int max) {
        int localMin = min;
        int localMax = max;

        Random rnd = new Random(System.currentTimeMillis());
        int number = localMin + rnd.nextInt(localMax - localMin + 1);

        return number;
    }
    @Override
    public void show() {
        System.out.println("Я занимаю " +randomizer(5,9) + " клеток.");
    }
}
