public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Шарик");


        Cat cat = new Cat("Муся");

        Animal animal = new Animal("Вася");


        Animal[] animals = new Animal[3];

        animals[0] = dog;

        animals[1] = cat;

        animals[2] = animal;

        for (int i = 0; i < animals.length; i++)
        {
            System.out.println(animals[i].sayName());

        }




    }
}