public class ITSC1212Lab2 {
    public static void main(String[] args) {



        // short x = 0;
        // short y = 2000;
        // int z = 100000;

        //char used to hold charcter of text!
        // char a = 'a';
        // char b = 'b';

        //boolean holds true or false / 1 or 0 / yes or no
        // boolean boo = true;

        // System.out.println(x + y + z);
        
        // var needed is int 

        // System.out.println(a + b);

        // 195 bc added the unicode of a =97 and b=98 97 + 98 = 195


        // System.out.println(x < y);
        // System.out.println(y > z);
        // System.out.println(z < a);   

        // > greater than >= greater than or equal to, < less than <= less than or equal to, == equal to, != does not equal to

        
///////////////////////////////////// Part B ////////////////////////////////////

        // int ex = (int) 4.9;
        // System.err.println(ex);
        // 4 printed when 4.0 to 4.9 bc we casted double to int by adding (int) 4.9

        // double x = 8.8;
        // double y = 2.2;

        // System.out.println(x / y);
        // System.out.println(x / (int) y);
        // System.out.println((int) x / y);
        // System.out.println((int) (x / y));

        // bc we casted the # in which we did put (int) infront of

        // double cost = 10.10;
        // double paid = 12.33;
        // double change = paid - cost;
        
        //i used String.format("%.02f", change) to keep 2 decimal places.
        
        //System.out.println("The change owed in this transation is: " + String.format("%.02f", change));

        // change *= 100;
        // change = (int)change;
        // change = (Double)change;
        // change /=100;
        //System.out.println("The change owed in this transation is: " + change);
        


        // int totalDays = 62;
        // int weeks = (totalDays/7);
        // int remainderDays = (totalDays%7);

        // System.out.println(weeks + " weeks " + remainderDays + " days");

////////////////////////////////////// Part C ////////////////////////////////////

        int totalDays = 11111;
        int years = (totalDays / 365);
        int weeks = (totalDays - 365 * years ) / 7;
        int remainderDays = (totalDays % 365) % 7;

        System.out.println("Number of total days is: " + totalDays);
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: "+ remainderDays);


     }
}
