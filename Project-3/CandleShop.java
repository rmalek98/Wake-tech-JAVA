import java.util.Scanner;

public class CandleShop {
    public static void main(String[] args) {
       Candle [] candle = new  Candle[3]; ;   
        /*enter the name, type, price and burn time for each
        of the three different types of candles, types 1, 2, and 3.
        Instantiate three Candle objects*/
 
        Scanner sc = new Scanner(System.in); 
        String name ="";
        int type;
        double cost;
        int burnTime;
            for(int i = 1; i <= 3; i++){
                System.out.println("\nWelcome to the Candle Shop! ");
                System.out.println("Please enter the Name, Price and Burn time for type "+i+" Candles!\n");
                type = i;
                System.out.println("Enter the name of the candle: like--> Taper, Pillar, Tea Light");
                name=sc.nextLine();
                System.out.println("Enter the price of the candle");
                cost=sc.nextDouble();
                //dont accept negative numbers and zero
                while(cost <= 0){
                    System.out.println("Please Enter a vild number from: 1");
                    cost=sc.nextDouble();
                }
                System.out.println("Enter the burn time of the candle");
                burnTime=sc.nextInt();
                //dont accept negative numbers and zero
                while(burnTime <= 0){
                    System.out.println("Please Enter a vild number from: 1");
                    burnTime=sc.nextInt();
                }
                sc.nextLine();
                candle[i-1] = new Candle(name,type,cost,burnTime);   
            }
        // create variables to store type of candles 
        int[] candleType = new int[3]; 
            for(int i = 0; i < 3; i++){
                System.out.println("--------------\nEnter number of candles you want to buy of Type "+(i+1) + "\n--------------"); 
                // take user input of candle type  
                candleType[i] = sc.nextInt();
                //dont accept negative numbers and zero
                while(candleType[i] <= 0){
                    System.out.println("Please Enter a vild number from: 1");
                    candleType[i] = sc.nextInt();
                }
            }
    
        // create varible to store total price 
        double totalPrice = 0.0; 
        // multiply number of candles by their price and sum in the total price 
            for(int i = 0; i<3; i++){
                totalPrice += candleType[i] * candle[i].getCost();
            }

        // print total price before discount.
        System.out.println("--------------\nTotal price before discount is: " +totalPrice + "$\n--------------");
        
        double discount = 0;
            if( totalPrice > 20 && totalPrice < 35) 
                discount = totalPrice *5/100 ;
           else if( totalPrice > 35 && totalPrice < 55) 
                discount = totalPrice * 7/100 ;  
            else if( totalPrice > 55 && totalPrice < 100) 
                discount = totalPrice * 10/100 ; 
            else
                discount = totalPrice * 20/100 ;

                // calculate total price after discount            
                totalPrice = totalPrice - discount;  
                
        // create variable for total burn time 
        int totalBurnTime = 0; 
        // multiply number of candles by their burn time and sum in the total price 
            for(int i = 0; i < 3; i++){
                totalBurnTime += candleType[i] * candle[i].getTime();
            }
        // calculate cost per minute, also conver the time in minutes by multiplying it by 60 
   
        double costPerMinute = (totalPrice/(totalBurnTime*60));  
        // Display the results... 
            for(int i = 0; i < 3; i++){
                candle[i].toString();
                System.out.println("The Number of candles of Type " + (i+1) + " is " + candleType[i]);
            }
        System.out.println("--------------\nTotal price with discount is : " + String.format("%.02f", totalPrice));
        System.out.println("Total burn time of candles: " + totalBurnTime); 
        System.out.println("Cost per minute: " + String.format("%.02f", costPerMinute)); 
    
        // Part C - Visualizing the purchase 
     System.out.println("--------------\nHistogram of Number Purchased\n--------------");
     
         System.out.print(candleType[0] + " type " + candle[0].getType() + " ("+candle[0].getName() + ") candles :");
         for(int j = 0; j < candleType[0]; j++){
             System.out.print("#");
            }
         System.out.println();
      
         System.out.print(candleType[1]+" type "+candle[1].getType()+" ("+candle[1].getName()+") candles :");
         for(int j = 0;j < candleType[1]; j++){
             System.out.print("@");
            }
         System.out.println();
         
          System.out.print(candleType[2]+" type "+candle[2].getType()+" ("+candle[2].getName()+") candles :");
         for(int j = 0; j < candleType[2];j++){
             System.out.print("+");
            }
         System.out.println("\n-----Thank you for shopping!-----");

         sc.close();
    }
}