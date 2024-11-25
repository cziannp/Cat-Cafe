public class Cat {

  private String name;
  private String type;
  private int age;
  private boolean isfriendly;
  private boolean issleeping;

  public Cat(String name, String type, int age, boolean isfriendly, boolean issleeping) {
    this.name = name;
    this.type = type;
    this.age = age;
    this.isfriendly = isfriendly;
    this.issleeping = issleeping;
  }

  public void printCatInfo() {
    System.out.println("This is " + name + " and it is " + age + " years old. It is a " + type + ".");
  }

  public void pet() {
    if (issleeping) {
      System.out.println("It's sleeping, it can't be pet.");
    }
    else if (!isfriendly) {
      System.out.println("This cat is not friendly. It bites you.");
    }
    else {
      System.out.println("You pet " + name + " and it purrs.");
    }
  }
  
  public void play() {
    if (age >= 18) {
      System.out.println("The cat is too old to play. It ignores you.");
    }
    else {
      System.out.println(name + " is having fun playing!");
    }
  }
}
