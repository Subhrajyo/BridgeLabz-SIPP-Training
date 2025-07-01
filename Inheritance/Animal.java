public class Animal {
   String name;
   int age;
   Animal(int age ,String name){
       this.age=age;
       this.name=name;
   }
    void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    void makeSound(){
       System.out.println("give some sound");
   }
}
 class Dog extends Animal{
    Dog(int age,String name){
        super(age,name);
    }
     @Override
     void makeSound(){
         System.out.println("Bark");
    }
}
class Cat extends Animal{
    Cat(int age,String name){
        super(age,name);
    }

    @Override
    void makeSound(){
        System.out.println("Meow");
    }
}
class Bird extends Animal{
    Bird(int age,String name){
        super(age,name);
    }
    @Override
    void makeSound(){
        System.out.println("chichi");
    }
}
 class Main{
    public static void main(String[] args) {
        Dog dog=new Dog(3,"Spike");
        dog.showInfo();
        dog.makeSound();
       Cat cat=new Cat(2,"tom");
        cat.showInfo();
        cat.makeSound();
        Bird bird=new Bird(1,"lila");
        bird.showInfo();
        bird.makeSound();
    }
}
