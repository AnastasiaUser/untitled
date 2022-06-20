import javax.xml.namespace.QName;

public class Dog {

    String name;
    String colour;
    String breed;
    int weight;

    Dog(String name, String colour, String breed, int weight){
        this.name = name;
        this.colour = colour;
        this.breed = breed;
        this.weight = weight;
    }

    void bark(){
        System.out.println("How aw aw");
    }
}
