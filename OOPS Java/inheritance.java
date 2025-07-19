 class Animal {
  public void sound() {
    System.out.println("Animal makes a sound");
  }
 }
 class Dog extends Animal {
 @Override
  public void sound() {
    System.out.println("Dog barks");
  }
 }
 class Cat extends Dog {
 
  public void sounde() {
    System.out.println("Cat meows");
  }
 }



public class inheritance {
  public static void main(String[] args) {
    Cat c = new Cat();
    c.sound();
    c.super.sound();
  }
}
