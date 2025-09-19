import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String zooName;



public static void main(String[] args) {
    ZooManagement zoo= new ZooManagement();
    Scanner scanner = new Scanner(System.in);

    do {
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
    System.out.println(zoo.zooName +" comporte "+zoo.nbrCages+ " cages ");







Animal a1=new Animal("lion","mounir",5,true);
Zoo z1=new Zoo("carthage","tunis",70);
z1.animals[0]=a1;

    System.out.println(z1);
}
}
