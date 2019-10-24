package patterns.decoratorRecepy;

public class Application {
    public static void main(String[] args) {
        RecepyInterface recepy= new ContinueRecepyDurationDecorator(new Recepy("Rez","9-9-9"));
        recepy.showRecepy();
    }

}
