public class Inheritance {
    public static void main(String args[]){
        // Fish shark = new Fish();
        // shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

//Base Class
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

//Derived Class / subclass
class Mammal extends Animal {
    int legs;
}

//Derived Class / subclass
class Dog extends Mammal {
    String breed;
}

//Derived Class / subclass
// class Fish extends Animal {
//     int fins;

//     void swim(){
//         System.out.println("Swims in water");
//     }
// }