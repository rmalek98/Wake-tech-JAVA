public class Budget {

    public static void main(String[] args) {

        /* *********************************
                     PROJECT 1
        ********************************** */  
        int hrlyWage = 10;
        int rent = 625;
        int internet = 27;
        int grocery = 250;
        int funActivity = 150;


        //Print the hrly wage, and the monthly expenses
        System.out.println("The hourly wage is: $" + hrlyWage + "\nThe Montly expenses are:" +
                "\n 1-> $625 for rent\n 2-> $027 for internt\n 3-> $250 for gocery\n 4-> $150 fun allowance");

        //calculate the total expenses
        int totalExpens = (hrlyWage + rent + internet + grocery + funActivity); 

        //print the monthly expenses
        System.out.println("The total monthly expenses are: $" + totalExpens);

        // 1062/4 = 265.5 the weekly earn devived by the wage $10. 265.5/10 = 26.55

        double weeksPerMonth = 4.0;
        double weeklyEarn = (totalExpens/weeksPerMonth);
        double weeklyHours = (weeklyEarn/hrlyWage);
        int moneySaved = 100;
        
        System.out.println("The total weekly hours needed are: " + weeklyHours);

        System.out.println("The hours needed per week to save $100 a month is " +(weeklyEarn+moneySaved/weeksPerMonth)/hrlyWage + " hours");

        System.out.println("The hours needed per month to save $100 are "+(weeklyEarn+moneySaved/weeksPerMonth)/hrlyWage *(weeksPerMonth) + " hours" );

        //

    }
}


