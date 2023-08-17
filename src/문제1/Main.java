package 문제1;

public class Main {
    public static void main(String[] args) {
        Dog dogA = new Dog();
        Dog dogB = new Dog("해피");


        System.out.println(dogA.name);
        System.out.println(dogB.name);
    }
}

class Animal {
    String name;

    Animal() {
        this.name = "강아지";
    }

    Animal(String name) {
        this.name = name;
    }

}

class Dog extends  Animal{
    Dog(){
    }
    Dog(String name){
        super(name);
    }
}
