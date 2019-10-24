package patterns.factoryMethodTetris.figures;

import patterns.factoryMethodTetris.Figure;

public class ThreeCellFigure implements Figure {


    @Override
    public void show() {
        System.out.println("Я занимаю 3 клетки.");

    }
}
