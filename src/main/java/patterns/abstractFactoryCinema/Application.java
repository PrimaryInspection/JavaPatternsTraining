package patterns.abstractFactoryCinema;

import patterns.abstractFactoryCinema.abstractFactory.EnglishFactory;
import patterns.abstractFactoryCinema.abstractFactory.FilmstripFactory;
import patterns.abstractFactoryCinema.abstractFactory.UkrainianFactory;
import patterns.abstractFactoryCinema.domain.Filmstrip;

import java.util.Scanner;


/**
 * 18.10.2019
 *
 * На случай если я забуду. Задание выполнено корректно. Можно было бы добавить
 * функцию "Желаете изменить звуковую дорожку/субтитры', но не вижу смысла ибо функционал полностью
 * демонстрирует работоспособность паттерна. Я бы просто на ответ 'да, хочу украинские субтитры' возвращал
 * украинскую фабрику(где звук и субтитры идут вместе),
 * аналогично и со всеми остальными вариантами.
 * */
public class Application {

    private static Filmstrip configure() {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose the film: ");
        System.out.println("Available : 'War' , 'Life' ");
        String title = input.nextLine();

        System.out.println("Choose Audiotrack: \n 1:English \n 2:Ukrainian");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        Filmstrip app = null;
        FilmstripFactory factory;

            switch (choice) {
                case 1:
                    factory = new EnglishFactory();
                    app = new Filmstrip(title, factory);
                    break;
                case 2:
                    factory = new UkrainianFactory();
                    app = new Filmstrip(title, factory);
                    break;
                case 0:
                    System.err.println("end of inputting!!!");
                    break;
            }

    return app;
    }


    public static void main(String[] args) {

    Filmstrip demo = configure();
    demo.showFilm();
    }
}
