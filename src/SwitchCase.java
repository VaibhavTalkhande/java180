public class SwitchCase {
    /*
     Switch(var) {
	Case C1:
		//Code;
		break;
	Case C2:
		//Code;
		break;
	Case C3:
		//Code
		break;
	default:
		//Code
     */
    public static void main(String[] args) {

            String var = "Saurabh";


            switch (var) {
                case "Shubham" -> {
                    System.out.println("You are going to become an Adult!");
                    System.out.println("You are going to become an Adult!");
                    System.out.println("You are going to become an Adult!");
                }
                case "Saurabh" -> System.out.println("You are going to join a Job!");
                case "Vishaka" -> System.out.println("You are going to get retired!");
                default -> System.out.println("Enjoy Your life!");
            }
            System.out.println("Thanks for using my Java Code!");
    }
}
