package Abstract;

/*
    Abstract class we can't able to create a Object
    Hiding certain details and showing essential details
    abstract keyword is a non-access modifier
    Abstract method , Abstract class
 */

abstract class Animal {
  public abstract void animalSound();
  void sleep(){
      System.out.println("zzzz");
  }
}

class WildAnimals extends Animal{
    public void animalSound(){
        System.out.println("Sound");
    }
}
class Main{
    public static void main(String[] args) {
        WildAnimals wd = new WildAnimals();
        wd.animalSound();
        wd.sleep();
    }
}
