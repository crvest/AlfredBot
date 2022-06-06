import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    
    public String guestGreeting(String name) {
        return String.format("Hello %s, welcome to Wayne Manor.", name);
    }


    // ninja bonus: accept period of day 
    public String guestGreeting(String name, String dayPeriod) {
        // initialize response string
        String guestGreetingString = "";
        // test for time of data and create custom response
        if (dayPeriod.equals("morning")) {
            guestGreetingString = String.format("Good %s %s. Can I get you a cup of tea?", dayPeriod, name);
        } 
        else if (dayPeriod.equals("afternoon")) {
            guestGreetingString = String.format("Good %s %s. Lunch is being served in the solarium", dayPeriod, name);
        } 
        else if (dayPeriod.equals("evening")) {
            guestGreetingString = String.format("Good %s %s. Drinks are being served in the lounge", dayPeriod, name);
        }
        return guestGreetingString;
    }


    // sensei bonus: no parameters
    public String guestGreeting() {
        // set the patern of the simpleDateFormat to hour of day(1-24)
        String pattern = "k";
        // create instance of simpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        // create instance of Date formated to hour of the day
        Integer hourOfDay = Integer.parseInt(simpleDateFormat.format(new Date()));
        // create custom greeting based on time of day
        // hour 23-5: late
        // hour 6-11: good morning
        // hour 12-16: good afternoon
        // hour 17-22: good evening
        String guestGreetingString = "";
        if (hourOfDay <= 5 || hourOfDay >= 23) {
            guestGreetingString = "A bit late to be calling on Master Wayne I'm afraid";
        }
        else if (hourOfDay <= 11 && hourOfDay >= 6) {
            guestGreetingString = "Good morning. Just in time for juice and bagels";
        }
        else if (hourOfDay <= 16 && hourOfDay >= 12) {
            guestGreetingString = "Good afternoon. Just in time for lunch";
        }
        else if (hourOfDay <= 22 && hourOfDay >= 17) {
            guestGreetingString = "Good evening. Dinner will be served shortly";
        }
        return guestGreetingString;
    }


    public String dateAnnouncement() {
        java.util.Date currentDate = new java.util.Date();
        return "At the sound of the bell, the time will be " + currentDate;
    }


    public String respondBeforeAlexis(String conversation)  {
        // declare response string variable
        String alexisResponseString;
        // test for input conversation
        if (conversation.contains("Alexis")){
            alexisResponseString = "Allow me sir, I believe she is busy at the moment";
        } else if (conversation.contains("Alfred")){
            alexisResponseString = "Right away sir";
        } else {
            alexisResponseString = "Mmm, quite";
        }
        // return input conversation and Alfred response
        return String.format("Bruce Wayne: %s\nAlfred: %s", conversation, alexisResponseString);
    }
}