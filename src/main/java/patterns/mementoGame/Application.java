package patterns.mementoGame;

public class Application {
    public static void main(String[] args) {
        Game game = new Game();
        game.setLevelAndScore("LVL_1", 2660);
        System.out.println(game);

         game.setLevelAndScore("LVL_2", 3500);
         System.out.println(game);

        File file = new File();
        file.setSave(game.save());
        System.out.println("Сохраняемся..");

        game.setLevelAndScore("LVL_3", 5622);
        System.out.println(game);

        game.setLevelAndScore("LVL_4", 9632);
        System.out.println(game);

        System.out.println("Что-то не пошло, загружаем второй уровень: ");
        game.load(file.getSave());
        System.out.println(game);

    }
}
