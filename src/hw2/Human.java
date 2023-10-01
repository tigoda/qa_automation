package hw2;

public class Human {

    private String name;
    private Activity activity;

    public String getName() {
        return name;
    }

    public Activity getActivity() {
        return activity;
    }

    public Human(String name, Activity activity) {
        this.name = name;
        this.activity = activity;
    }

}
