package patterns.factoryMethodTetris.factories;

import patterns.factoryMethodTetris.Figure;
import patterns.factoryMethodTetris.FigureFactory;
import patterns.factoryMethodTetris.figures.FourCellFigure;

public class FourCellFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new FourCellFigure();
    }
}
