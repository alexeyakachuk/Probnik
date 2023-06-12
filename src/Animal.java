public class Animal {
    private String name;

    public Animal(){}

    public Animal (String name) {
        this.name = name;
    }
    public String toString() {
        return "Имя животного : " + name;
    }
    public String sayName () {return name;}

    public String getName() {
        return name;
    }
}
