public class Dog extends Animal {
    @Override
    public String sayName() {
        return "Меня зовут собака " + getName();
    }

    public Dog(String name) {
        super(name);

    }
}
