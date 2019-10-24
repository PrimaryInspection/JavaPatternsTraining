package patterns.factoryMethodTetris.factories;

import patterns.factoryMethodTetris.Figure;
import patterns.factoryMethodTetris.FigureFactory;
import patterns.factoryMethodTetris.figures.OneCellFigure;

public class OneCellFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new OneCellFigure();
    }
}
