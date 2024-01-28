import java.util.ArrayList;
public class Cafe {
	public static void main(String[] args) {
		Patron cindy = new Patron("Cindy");
		ArrayList<String> beverageList = new ArrayList<>();
		beverageList.add("Tea");
		beverageList.add("Coffee"); // Cindy is allergic to coffee
		beverageList.add("Beer"); // Cindy will feel sick if she drinks beer
		beverageList.add("Milk");
        try {
            // For each beverage in beverageList
            for (int i=0; i < beverageList.size(); i++) {
                // cindy drinks the beverage
                String beverage = beverageList.get(i);
                try {
                    cindy.drink(beverage);
                } catch (AllergyException e) {
                    System.out.println("Allergic to " + beverage);
                }
            }
        } catch (SickException e) {
            System.out.println("sick");
        } finally {
            System.out.println("Bye bye");
        }
	}
}