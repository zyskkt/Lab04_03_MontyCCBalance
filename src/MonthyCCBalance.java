public class MonthyCCBalance {
    public static void main(String[] args) {
        //Starting balance, would normally ask the user for this input
        double startBalance = 5000;

        //Interest rate.
        double intRate = .17;

        //Calculate the interest for month 1
        double intFirstMonth = 5000 * .17;

        //Calulate the total after 1 month
        double totFirstMonth = startBalance + intFirstMonth;

        //Output first month data
        System.out.println("Your interest after one month is " + intFirstMonth + " and your total balance is " + totFirstMonth + ".");

        //Calculate the interest for month 2
        double intSecondMonth = totFirstMonth *.17;

        //Calculate the total interest
        double intTotal = intFirstMonth + intSecondMonth;

        //Add the interest to the total balance
        double totSecondMonth = totFirstMonth + intSecondMonth;

        //Output month 2 data
        System.out.println("Your interest for month 2 is " + intSecondMonth + " for a total interest of " + intTotal + ". Your grand total after 2 months is " + totSecondMonth + ".");



    }
}
