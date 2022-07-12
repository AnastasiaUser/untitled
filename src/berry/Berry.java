package berry;

abstract class Berry {
    private int weight;
    private final String name;
    private String colour;
    private boolean isRipe;


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public boolean isRipe() {
        return isRipe();
    }
    public void setRipe(boolean ripe){
        isRipe = ripe;
    }

        Berry(String name){
            isRipe = false;
            colour = "undefined";
            this.name = name;
            weight = 0;
        }

        Berry(String name, boolean isRipe){
            this.name = name;
            this.isRipe = isRipe;
            colour = "undefined";
            weight = 0;
        }

    @Override
    public String toString() {
        return "Berry{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", isRipe=" + isRipe +
                '}';
    }
}
