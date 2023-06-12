public class Cat extends Animal{

    public String sayName() {
        return "Меня зовут Лошка " + getName();
    }
    public Cat(String name){
        super(name);
    }
}
