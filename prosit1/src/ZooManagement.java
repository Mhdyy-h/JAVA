import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String zooName;



public static void main(String[] args) {


    /*do {
        System.out.println("entrez le nom du zoo");
        zoo.zooName = scanner.nextLine();
        if(zoo.zooName.equals("")){
            System.out.println("le nom du zoo est invalide");
        }
    }while(zoo.zooName.equals(""));

    do {
        System.out.println("entrez le nombre de cages");
        zoo.nbrCages = scanner.nextInt();
        if(zoo.nbrCages<=0){
            System.out.println("le nombre de cages doit etre >=0");
        }
    }while(zoo.nbrCages<=0);
    System.out.println(zoo.zooName +" comporte "+zoo.nbrCages+ " cages ");*/



    ZooManagement zoo= new ZooManagement();
    Scanner scanner = new Scanner(System.in);



    Animal a1=new Animal("lion","mounir",5,true);
    Animal a2=new Animal("lion","samir",6,true);
    Animal a3=new Animal("fox","chnayyder",10,true);

    Animal a4=new Animal("kalb","douua",6,true);
    Animal a5=new Animal("gatous","pisseron",10,true);

    Zoo z1=new Zoo("carthage","tunis",70);
    Zoo z2=new Zoo("Kef","palestine",25);

    z1.addAnimal(a1);
    z1.addAnimal(a2);
    z1.addAnimal(a3);

    z1.addAnimal(a4);
    z1.addAnimal(a5);



    z1.afficherZoo();

    z2.afficherZoo();

    /*int i = z1.searchAnimal(a2);
    System.out.println("l annimal que tu cherches est d indice :"+i);

    z1.removeAnimal(a3);
    z1.afficherZoo();*/

    Zoo plusGrand = Zoo.comparerZoo(z1,z2);
    System.out.println("Zoo avec le plus d'animaux : " + plusGrand.name);
}
}
