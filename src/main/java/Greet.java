import java.util.Scanner;

public class Greet {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Greeted greeted = new Greeted();

        boolean exit = true;

        while (exit) {
//            ArrayList <String> greet = new ArrayList<>();
            System.out.print("Please enter command: ");

            //reads input incl. spaces
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

            }   else if (command.equalsIgnoreCase("greeted")) {

               if (commandArray.length == 2) {
                    String name = commandArray[1];
                   System.out.println(greeted.greetedUser(name));
                }

                else if (commandArray.length == 1) {
                    System.out.println(greeted.greeted());
                }

            }
            else if (command.equalsIgnoreCase("clear")) {

                if (commandArray.length == 2) {
                    String name = commandArray[1];
                    System.out.println(greeted.clear(name));
                }
                else if (commandArray.length == 1){
                    System.out.println(greeted.resetAll());
                }
            }

            else if (command.equalsIgnoreCase("counter")) {
                if (commandArray.length == 2) {
                    String name = commandArray[1];
                    System.out.println(greeted.counter(name));
                }
            }

            else {
                System.out.println("Invalid command");
            }


        }
    }
}
