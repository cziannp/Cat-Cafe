public class Menu {
  
  private String item;
  private double price;
  private boolean issoldOut;

  public Menu(String item, double price, boolean issoldOut) {
    this.item = item;
    this.price = price;
    this.issoldOut = issoldOut;
  }

  public void printMenu() {
    System.out.println("This is " + item + " and it costs " + price + " dollars.");
  }

  public void buy() {
    if (issoldOut) {
      System.out.println("This item is sold out.");
    }
    else {
      System.out.println("You bought " + item + " for " + price + " dollars.");
    }
  }

}
