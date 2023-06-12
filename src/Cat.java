public class Cat extends Animal{

    public String sayName() {
        return "Меня зовут кошка " + getName();
    }
    public Cat(String name){
        super(name);
    }
}
