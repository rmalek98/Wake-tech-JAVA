public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){

    }

    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    // add your code here

    public void showDecaseconds(int numSeconds){
        double decasecond = numSeconds*0.10;
        String description = "Decasecond is 10 secs.";
        System.out.println(description + "\n" + numSeconds + "sec = " + decasecond + " Decaseconds");
        
    }
   
    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    // add your code here

   public void showJiffies(int numSeconds){
       int jiffy = numSeconds * 60;
       //double jiffy = numSeconds * 0.01;
       String description = "A jiffy is a unit of time used in computer operating systems. It is 10 milliseconds.";
       System.out.println(description + "\n" + numSeconds+ "sec = "+jiffy+ " Jiffies");
   }

    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    // add your code here

    public void showNewYorkMinutes(int numSeconds){
        double nyMininutes = numSeconds*0.05;
        String description = "A new york minute is the period of time between the traffic lights turning green and the cab behind you honking. It is 1/20th of 1 second.";
        System.out.println(description + "\n" + numSeconds+"sec = "+ nyMininutes + " NY minutes");
    }

    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    // add your code here

    public void showNanoCenturies(int numSeconds){
        double nanoCenturies = numSeconds/3.156;
        String description = "A nanocentury is a computing measurement coined from the expression - never to let the user wait more than a few nanocenturies for a response. It is 3.156 seconds.";
        System.out.println(description + "\n" + numSeconds+"sec = "+ nanoCenturies + " Nanocenturies");
    }

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here

    public void showScaramuccis(int numSeconds){
        double scaramuccis = (double)numSeconds/(11*24*60*60);
        String description = "A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days";
        System.out.println(description + "\n" + numSeconds+"sec = "+ scaramuccis + " Scaramuccis");
    }

}//end class