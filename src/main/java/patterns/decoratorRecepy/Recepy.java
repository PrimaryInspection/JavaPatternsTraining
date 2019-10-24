package patterns.decoratorRecepy;

public class Recepy implements RecepyInterface {

    private String name;
    private String duration;

    public Recepy(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Recepy{" +
                "name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    @Override
    public void showRecepy() {
        System.out.println(this);
    }
}
