interface Animal {
  void sound();
}

class Dog implements Animal {
  public void sound() {
    System.out.println("Woof");
  }
}

public class Interface {
  public static void main(String[] args) {
    Animal dog = new Dog();
    dog.sound();
  }
}