public class AlfredTest {
    public static void main(String[] args) {
        // create an instance of AlfredQuotes to access its methods
        AlfredQuotes alfredBot = new AlfredQuotes();

        // test greetings
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        String testDateAnnouncement = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats");
        String alfredTest = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
        String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing...");

        // print the greetings to test
        System.out.println(testGreeting);        
        // Uncomment these one at a time as you implement each method.
        System.out.println(testGuestGreeting);
        System.out.println(testDateAnnouncement);
        System.out.println("----alexis test----");
        System.out.println(alexisTest);
        System.out.println(alfredTest);
        System.out.println(notRelevantTest);

        // ninja bonus
        System.out.println("----ninja bonus: overload guestGreeting----");
        System.out.println(alfredBot.guestGreeting("Dick Grayson", "morning"));
        System.out.println(alfredBot.guestGreeting("Selena Kyle", "afternoon"));
        System.out.println(alfredBot.guestGreeting("Solomon Grundy", "evening"));

        // sensei bonus
        System.out.println("----sensei bonus: no parameters----");
        System.out.println(alfredBot.guestGreeting());
        
    }
}