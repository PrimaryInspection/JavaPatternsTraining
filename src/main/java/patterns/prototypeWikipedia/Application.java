package patterns.prototypeWikipedia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** 18.10.2019
 *
 * Если говорить о списке статьей, то просто нужно засунуть наш Article в ArrayList и получать конкретную статью просто
 * по id(добавится пункт меню "Выберите статью"  , а дальше работать таким образом, каким работает программа сейчас.
 * */
public class Application {


    public void redactor(){
        Article original = new Article("news","VERSION 1");
        ArticleFactory factory = new ArticleFactory(original);

        Scanner in = new Scanner(System.in);
        Scanner inputTitle = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);

        System.out.println("Оригинальная статья");
        System.out.println(original + "\n");

        boolean notExit = true;
        while (notExit){
            System.out.println("Операции со статьей:");
            System.out.println("1.Отредактировать статью\n2.Показать исходную статью\n3.Показать последнюю версию\n0.Выйти\n");
            int input = in.nextInt();
            switch (input){
                case 1:
                    System.out.println("Введите новый заголовок");
                    String newTitle = inputTitle.nextLine();
                    System.out.println("Введите новый текст");
                    String newText = inputText.nextLine();
                    factory.setPrototype(new Article(newTitle , newText));
                    Article copyArticle = factory.makeCopy();
                    System.out.println("Отредактированная статья: "+copyArticle);
                    System.out.println("====================================");
                    break;
                case 2:
                    System.out.println("Исходная статья: "+original);
                    System.out.println("====================================");
                    break;
                case 3:
                    System.out.println("Последняя версия: " + factory.getArticle());
                    System.out.println("====================================");
                    break;
                case 0: notExit = false;
                    break;
            }
        }

    }


    public static void main(String[] args) {
       Application application = new Application();
       application.redactor();
    }
}
