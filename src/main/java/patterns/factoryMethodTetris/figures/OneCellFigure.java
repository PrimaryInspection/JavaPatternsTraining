package patterns.factoryMethodTetris.figures;

import patterns.factoryMethodTetris.Figure;

public class OneCellFigure implements Figure{



    @Override
    public void show() {
        System.out.println("Я занимаю 1 клетку.");

    }
}
