package patterns.factoryMethodTetris.figures;

import patterns.factoryMethodTetris.Figure;

public class TwoCellFigure implements Figure {



    @Override
    public void show() {
        System.out.println("Я занимаю 2 клетки.");

    }
}
