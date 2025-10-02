public class Animal {
    String family;
    String name;
    int age;
    boolean isAnimal;

    public Animal(){}

    public Animal(String family, String name, int age, boolean isAnimal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isAnimal = isAnimal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
