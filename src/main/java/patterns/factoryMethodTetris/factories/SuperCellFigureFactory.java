package patterns.factoryMethodTetris.factories;

import patterns.factoryMethodTetris.Figure;
import patterns.factoryMethodTetris.FigureFactory;
import patterns.factoryMethodTetris.figures.SuperCellFigure;

public class SuperCellFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new SuperCellFigure();
    }
}
