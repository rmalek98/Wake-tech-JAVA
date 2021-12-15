import java.util.Scanner;

public class Business {

     //Create a static String field and assign it your company name Malek's deli
     static String companyName = "Malek's deli";
     //Create a static String field and assign it to your name Malek
     static String name = "Malek";
     //Create a static String array field containing all your menu items*.  for now.
     static String[] menuItems = {"Taco", "Hamburger", "Pizza", "Salad", "Soup","Cookie","Water","Soda", "Chips", "Nachos"};
     //Create a static int field that contains the number of items in your menu.
     static int numItems = 10;

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        //Define a String called decorativeLine and assign to it about 40  characters like %%%%%%%%%%%%%%%%%%%% 
        String decorativeLine = "\n####################################################\n";

        Thread.sleep(1000);
        System.out.println(decorativeLine + "\nWelcome to " + companyName +"!");
        Thread.sleep(1000);
        System.out.print("I am " + name + ". What's your name? ");
        Thread.sleep(1000);
        String name = input.next();
        Thread.sleep(1000);
        System.out.println("Hey there, " + name+" !");
        Thread.sleep(1500);

        System.out.println("Here's what we serve, "+ name + ". Have a look:\n");
        Thread.sleep(1000);
        //Print out the menu items, display all the menu items numbered 1 to 10 in a numbered list
        for (int i = 0; i < numItems; i++) {
            System.out.println((i+1) + ". " + menuItems[i]);
        }
        Thread.sleep(1000);

        System.out.print("\nHow many items would you like to order? ");
        int numberOfItems = input.nextInt();
        Thread.sleep(1000);
        //orderArray to save the user ordered items

        int[] orderedItems = new int[numberOfItems];
      
      
        for(int i=0; i<numberOfItems; i++) {
          
           System.out.print("Please enter the number of your item "+ (i+1) +": ");
           
           orderedItems[i] = input.nextInt();
           Thread.sleep(1000);
           //validating user input using while loop
           while(orderedItems[i] < 0 || orderedItems[i]>10) {
               System.out.print("You must enter an item number from 1 to 10. ");
              
              orderedItems[i] = input.nextInt();
              Thread.sleep(1000);
            }
        }
        
        //displaying the ordered items
      
       System.out.println("\nThank You for your Order, "+ name);
       Thread.sleep(1500);
       System.out.println("Your order includes: ");
         Thread.sleep(1000);
       //array for storing the items
       String[] order = new String[numberOfItems];
        Thread.sleep(1000);
       //storing the items in order array
       for (int i=0; i<numberOfItems;i++)
        {
           order[i] = menuItems[orderedItems[i]-1];
        }
      
       //now displaying the customer order in same line separated by comma in between and ending with a period
         System.out.print(order[0]);
            for(int i=1; i<numberOfItems; i++)
            {
                System.out.print(", "+order[i]);
            }   System.out.println(".");
            Thread.sleep(1000);
        //Thank the user by name, tell them something about how their order is coming right up, and to have a great day.
        System.out.println("\nThank you " + name + ", Your order is coming right up! Have a Great Day!");

        System.out.println(decorativeLine);
        input.close();
    }  
        
}