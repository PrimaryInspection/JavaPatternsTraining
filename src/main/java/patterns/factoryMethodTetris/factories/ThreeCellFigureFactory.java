package patterns.factoryMethodTetris.factories;

import patterns.factoryMethodTetris.Figure;
import patterns.factoryMethodTetris.FigureFactory;
import patterns.factoryMethodTetris.figures.ThreeCellFigure;

public class ThreeCellFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new ThreeCellFigure();
    }
}
