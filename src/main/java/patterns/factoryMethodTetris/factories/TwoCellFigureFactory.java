package patterns.factoryMethodTetris.factories;

import patterns.factoryMethodTetris.Figure;
import patterns.factoryMethodTetris.FigureFactory;
import patterns.factoryMethodTetris.figures.TwoCellFigure;

public class TwoCellFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new TwoCellFigure();
    }
}
