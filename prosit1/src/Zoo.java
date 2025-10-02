import java.util.Arrays;

public class Zoo {
    String name;
    String city;
    final int nbrCages=25;
    Animal[] animals;


    public Zoo(){}

    public Zoo(String name,String city,int nbrCages){
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
    }



    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    boolean addAnimal(Animal animal){
        for(int i=0;i<animals.length;i++){
            if(animals[i] != null &&  animals[i].equals(animal)){
                return false;
            }
        }

        for(int j=0;j<animals.length;j++){
            if(animals[j] == null){
                animals[j] = animal;
                return true;
            }
        }
        return false;

    }

    void afficherZoo(){
        System.out.println("Zoo "+ name );
        for(int i=0;i<animals.length;i++){
            if(animals[i]!=null){
                System.out.println(animals[i]);
            }
        }
    }

    int searchAnimal(Animal animal){
        for(int i=0;i<animals.length;i++){
            if(animals[i].equals(animal)){
                return i;
            }
        }
        return -1;
    }

    boolean removeAnimal(Animal animal){
        for(int i=0;i<animals.length;i++){
            if(animals[i].equals(animal)){
                animals[i] = null;
                return true;
            }
        }
        return false;
    }


    boolean isZooFull() {
        for (Animal a : animals) {
            if (a == null) {
                return false;
            }
        }
        return true;
    }



    public int getNumberOfAnimals() {
        int count = 0;
        for (Animal a : animals) {
            if (a != null) {
                count++;
            }
        }
        return count;
    }





    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.getNumberOfAnimals() >= z2.getNumberOfAnimals()) {
            return z1;
        } else {
            return z2;
        }
    }

}
