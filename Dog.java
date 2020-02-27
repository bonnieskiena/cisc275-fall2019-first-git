import java.util.*;

class Animal{
    String name;
    int legs;
    public Animal (String name, int legs){
	this.name = name;
	this.legs = legs;
    }
    public int getLegs(){
	return legs;
    }
}

public class Dog extends Animal{
    public Dog(String name, int legs){
	super(name,legs);
    }
    public String toString (){
        return name +" "+legs+"\n";
    }
}

class AnimalCompare implements Comparator<Animal>{
    public int compare(Animal a1, Animal a2){
	return a1.getLegs() - a2.getLegs();
    }
}
