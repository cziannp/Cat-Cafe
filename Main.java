import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Cat cat1 = new Cat("Fluffy", "Persian", 3, true, false);
        Cat cat2 = new Cat("Jack Skellington", "Gray Tabby", 5, false, false);
        Cat cat3 = new Cat("Martini", "Bengal", 6, true, true);
        Cat cat4 = new Cat("Mittens", "British Shorthair", 1, true, false);
        Cat cat5 = new Cat("Patches", "Ragdoll", 20, true, false);
        Cat cat6 = new Cat("Snowball", "British Shorthair", 18, true, false);

        Menu menu1 = new Menu("Chocolate Cake", 10.99, false);
        Menu menu2 = new Menu("Cupcake", 5.99, true);
        Menu menu3 = new Menu("Tea", 2.99, false);
        Menu menu4 = new Menu("Cucumber Sandwich", 8.99, false);
        Menu menu5 = new Menu("Coffee", 3.50, false);
        
        System.out.print("Hi there! Welcome to our Cat Cafe! What is your name? ");
        String name = s.nextLine();
        System.out.println("Nice to meet you, " + name + ". We have a variety of beverages and pastries to choose from.");
        System.out.println();
        
        System.out.println("Here is our menu: ");
        menu1.printMenu();
        menu2.printMenu();
        menu3.printMenu();
        menu4.printMenu();
        menu5.printMenu();
        System.out.println();
        
        System.out.println("Here are our cats: ");
        cat1.printCatInfo();
        cat2.printCatInfo();
        cat3.printCatInfo();
        cat4.printCatInfo();
        cat5.printCatInfo();
        cat6.printCatInfo();
        System.out.println();

        System.out.print("What would you like to buy: ");
        String item = s.nextLine();
        if (item.equals("Chocolate Cake")) {
            menu1.buy();
        }
        else if (item.equals("Cupcake")) {
            menu2.buy();
        }        
        else if (item.equals("Tea")) {
            menu3.buy();
        }
        else if (item.equals("Cucumber Sandwich")) {
            menu4.buy();
        }
        else if (item.equals("Coffee")) {
            menu5.buy();
        }
        else {
            System.out.println("Sorry, we don't have that item.");
        }
        System.out.println();

        
        System.out.print("What cat would you like to pet: ");
        String cat = s.nextLine();
        if (cat.equals("Fluffy")) {
            cat1.pet();
        }
        else if (cat.equals("Jack Skellington")) {
            cat2.pet();
        }
        else if (cat.equals("Martini")) {
            cat3.pet();
        }
        else if (cat.equals("Mittens")) {
            cat4.pet();
        }
        else if (cat.equals("Patches")) {
            cat5.pet();
        }
        else if (cat.equals("Snowball")) {
            cat6.pet();
        }
        else {
            System.out.println("Sorry, we don't have that cat.");
        }
        System.out.println();
        

        System.out.print("What cat would you like to play with: ");
        String play = s.nextLine();
        if (play.equals("Fluffy")) {
            cat1.play();
        }
        else if (play.equals("Jack Skellington")) {
            cat2.play();
        }
        else if (play.equals("Martini")) {
            cat3.play();
        }
        else if (play.equals("Mittens")) {
            cat4.play();
        }
        else if (play.equals("Patches")) {
            cat5.play();
        }
        else if (play.equals("Snowball")) {
            cat6.play();
        }
        else {
            System.out.println("Sorry, we don't have that cat.");
        }
        System.out.println();
        System.out.println();

        System.out.println("It seems our time has run up together. Thank you for coming to our Cat Cafe, " + name + "! Have a lovely day!");
        
    }
}
