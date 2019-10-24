package patterns.strategyFantasy;

public class Application {

    /**21.10.2019
     *
     * Так же вместо реализаций способов движения можно создать реализации конкретных рас, которые будут иметь определенные
     * свойства, а так же реализовывать свой тип движения (интерфейс {@link Activity}) и вместо названия расы, в конструктор
     * передать сам инстанс класса определенной рассы, так будет правильнее, наверное. Поведение расы будет зашито в саму расу
     * ну и добавить возможность менять его с помощью магии. Но это долго и не так важно, и так сойдет)
     * */
    public static void main(String[] args) {
        Entity entity = new Entity("Orc",false);
        entity.setActivity(new Walking());
        entity.executeActivity();
    }
}