package patterns.decoratorRecepy;

public class ContinueRecepyDurationDecorator implements RecepyInterface {

    RecepyInterface recepyInterface;
    String duration = "11-11-11";


    public ContinueRecepyDurationDecorator(RecepyInterface recepyInterface) {
        this.recepyInterface = recepyInterface;
    }

    @Override
    public void showRecepy() {
        recepyInterface.showRecepy();
        System.out.println("\nПродлено до: " + duration);
    }
}
