package patterns.observerPostOffice;

/**21.10.2019
 *
 * Тут нет класса Издательство, возможно из-за не совсем корректного задания, в данной программе, грубо говоря за Издательство
 * выступаем мы, вручную добавляю газеты в 'publishingOffice' {@link PublishingOffice} . Можно было прикрутить то самое
 * Издательство, но мне кажется это лишнее, паттерн не об этом.
 *
 * */

public class Application {
    public static void main(String[] args) {
        PublishingOffice publishingOffice = new PublishingOffice();
        publishingOffice.addNewspaper("about news");
        publishingOffice.addNewspaper("about sport");
        publishingOffice.addNewspaper("about garden");

        Observer firstObserver = new Subscriber("Ben");
        Observer secondObserver = new Subscriber("Rick");
        Observer thirdObserver = new Subscriber("John");

        publishingOffice.addObserver(firstObserver);
        publishingOffice.addObserver(secondObserver);
        publishingOffice.addObserver(thirdObserver);

        publishingOffice.removeNewspaper("about news");

        publishingOffice.notifyObserver();
    }
}
