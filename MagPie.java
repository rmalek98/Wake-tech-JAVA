public class MagPie {
    
    /**
     * A default constuctor
     * 
     */
    public MagPie(){

    }
   
    /**
     * Get a default greeting
     * 
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */

    // public String getResponse(String statement) {
    //     String response = "";
    //     if (statement.indexOf("no") >= 0) {
    //         response = "Why so negative?";
    //     } else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0
    //             || statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0) {
    //         response = "Tell me more about your family.";
    //     } else if (statement.indexOf("tired") >= 0 || statement.indexOf("long") >=0
    //             || statement.indexOf("bored") >=0 || statement.indexOf("day") >=0){
    //         response = "Tell me about your day.";
    //     }else if (statement.indexOf("Mr") >= 0){
    //         response = "He sounds like a good teacher";
    //     } else if (statement.indexOf("Ms") >= 0){
    //         response = "She sounds like a good teacher";
    //     } else if (statement.trim().equals("")){
    //         response = "Say something.";
    //     }else {
    //         response = getRandomResponse();
    //     } 
    //     return response;
    // }

    ///////////////////
//PART D
    ///////////////////
    public String getResponse(String statement) {
        String response = "";
        if (statement.indexOf("mother") >= 0){
            response = "Tell me more about your family"; //
        } else if (statement.startsWith("no")){
            response = "Why so negative?";
        } else if (statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0  //
                || statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0) { //
            response = "Tell me more about your family.";
        } else if (statement.indexOf("tired") >= 0 || statement.indexOf("long") >=0
                || statement.indexOf("bored") >=0 || statement.indexOf("day") >=0){
            response = "Tell me about your day.";
        }else if (statement.indexOf("Mr") >= 0){
            response = "He sounds like a good teacher";
        } else if (statement.indexOf("Ms") >= 0){
            response = "She sounds like a good teacher";
        } else if (statement.trim().equals("")){
            response = "Say something.";
        } else if (statement.indexOf("near") >= 0 && statement.indexOf("Starbucks") >= 0){
            response = "The nearset Starbucks is in the Student Union 0.5 miles away.";
        }else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0){
                response = "Tell me more about your pets";
        }else if (statement.indexOf("park") >= 0 && !(statement.indexOf("car") >= 0)){
            response = "I bet the trees there are lovely this time of year.";
        }else if (statement.indexOf("park") >= 0){
            response = "parking on campus is atrocious and expensive.";
        }else if (statement.indexOf("love") >= 0 && statement.indexOf("mom") >= 0 && statement.indexOf("cook") >= 0){
            response = "I'll bet it's delicious.";
        }else {
            response = getRandomResponse();
        }
        return response;
    }
    

    /**
     * Pick a default response to use if nothing else fits.
     * 
     * @return a string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4){
            response = "You got this.";
        }else if (whichResponse == 5){
            response = "I'm here to help.";
        }

        return response;
    }
}
