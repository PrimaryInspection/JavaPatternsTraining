package patterns.factoryMethodTetris;

import patterns.factoryMethodTetris.factories.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        Application application = new Application();
        application.tetris();
    }

    @SuppressWarnings("all")
    public static int randomizer(int min, int max) {
        int localMin = min;
        int localMax = max;

        Random rnd = new Random(System.currentTimeMillis());
        int number = localMin + rnd.nextInt(localMax - localMin + 1);

        return number;
    }

    public FigureFactory getRandomFigureFactory() throws InterruptedException {


        List<FigureFactory> figureFactories = new ArrayList<FigureFactory>();
        figureFactories.add(new OneCellFigureFactory());
        figureFactories.add(new TwoCellFigureFactory());
        figureFactories.add(new ThreeCellFigureFactory());
        figureFactories.add(new FourCellFigureFactory());
        figureFactories.add(new SuperCellFigureFactory());

        return figureFactories.get(randomizer(0, 4));
    }

    public void tetris() throws InterruptedException {

        while (true) {
            FigureFactory figureFactory = getRandomFigureFactory();
            Figure figure = figureFactory.createFigure();
            figure.show();
            Thread.sleep(1000);
        }
    }
}

            /*int number = min + rnd.nextInt(max - min + 1);
            switch (number){
                case 1:
                    FigureFactory figureFactory = new SuperCellFigureFactory();
                    Figure superCellFigure = figureFactory.createFigure();
                    superCellFigure.show();
                    Thread.sleep(1000);
                case 2:
                    FigureFactory figureFactory1 = new OneCellFigureFactory();
                    Figure oneCellFigure = figureFactory1.createFigure();
                    oneCellFigure.show();
                    Thread.sleep(1000);
                case 3:
                    FigureFactory figureFactory2 = new TwoCellFigureFactory();
                    Figure twoCellFigure = figureFactory2.createFigure();
                    twoCellFigure.show();
                    Thread.sleep(1000);
                case 4:
                    FigureFactory figureFactory3 = new ThreeCellFigureFactory();
                    Figure threeCellFigure = figureFactory3.createFigure();
                    threeCellFigure.show();
                    Thread.sleep(1000);
                case 5:
                    FigureFactory figureFactory4 = new FourCellFigureFactory();
                    Figure fourCellFigure = figureFactory4.createFigure();
                    fourCellFigure.show();
                    Thread.sleep(1000);
            }
        }*/
