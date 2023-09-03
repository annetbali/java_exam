//java program that creates an array list of animals and prints the animals in a collection;
import java.util.ArrayList;
//Animal class
public class Animals {
    public static void main(String[] args){
        ArrayList<String>animals =new ArrayList<String>();
        //Adding animals to the collection
        animals.add("Cow");
        animals.add("Goat");
        animals.add("Dog");

        System.out.println("Collection of animals: "+ animals);
    }
}