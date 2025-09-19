import java.util.Arrays;

public class Zoo {
    String name;
    String city;
    int nbrCages;
    Animal[] animals;


    public Zoo(){}
    public Zoo(String name,String city,int nbrCages){
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[nbrCages];
    }

    public void displayZoo(){
        System.out.println("Zoo name:"+name);
        System.out.println("Zoo city:"+city);
        System.out.println("Zoo nbr cages:"+nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
