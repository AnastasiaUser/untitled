package berry;

public class Blueberry extends Berry{
    private double sweetness;
    String levelOfVitamins;
    final static String n = "blueberry";

    Blueberry() {
        super(n);
        sweetness=1.0;
        levelOfVitamins = "LOV";
    }
    Blueberry(String name, boolean isRipe, double sweet) {
        super(name, isRipe);
        sweetness = sweet;
        levelOfVitamins = "LOV";
    }

    public void setRipe(boolean ripe){
        super.setRipe(ripe);
        if (isRipe());
    }

    @Override
    public String toString() {
        return "Blueberry{" +
                "sweetness=" + sweetness +
                ", levelOfVitamins='" + levelOfVitamins + '\'' +
                '}';
    }
}
