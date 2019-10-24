package patterns.strategyFantasy;

public class Entity {
    public boolean isMagick;
    public Activity activity;
    public String name;

    public Entity(String name, boolean isMagick) {
        this.name = name;
        this.isMagick = isMagick;
    }

    public void setActivity(Activity activity) {
        if(isMagick == true){
            this.activity=new Flying();
            System.out.println("Magick was used!");
        }else {
            this.activity = activity;
        }
    }

    public void executeActivity(){
        activity.movement(name);
    }


}
