import java.util.Scanner;

public class Greet {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Greeted greeted = new Greeted();

        boolean exit = true;

        while (exit) {
//            ArrayList <String> greet = new ArrayList<>();
            System.out.print("Please enter command: ");

            //String input
            String commandParts = sc.nextLine(); //greet Lihle xhosa
            String[] commandArray = commandParts.split(" "); // ['greet','Lihle','xhosa']

            String command = commandArray[0];
            if(commandParts.equals("exit")) {
                System.out.println("goodbye");
                return;
            }

            if(command.equalsIgnoreCase("greet")){
                if(commandArray.length ==  2) {
                // Default language
                    String name = commandArray[1], language = "Xhosa";
                    System.out.println(greeted.greetPerson(name, language));
                } else if (commandArray.length == 3){
                    String name = commandArray[1], language = commandArray[2];
                    System.out.println(greeted.greetPerson(name, language));
                } else if (commandArray.length == 2) {
                    String name = commandArray[1], language = "Xhosa";
                    System.out.println(greeted.greetPerson(name, language));
                }
                else if (command.equalsIgnoreCase("greeted")) {
                    String name = commandArray[1], language = commandArray[2];
                    System.out.println(greeted.greetPerson(name, language));
                }
            } else {
                System.out.println("Invalid command");
            }


        }
    }
}
