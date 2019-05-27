
import java.util.HashMap;
import java.util.Map;

public class Greeted {

    HashMap<String, Integer> map = new HashMap(); //{Jan=3}

    public String greetPerson(String name, String language) {
        try {

            if (map.containsKey(name)) {
                int greetedCounter = map.get(name) + 1;
                map.put(name, greetedCounter);
            }else {
                map.put(name, 1);
            }
            return Language.valueOf(language).getExpresssion()+ ",  " + name;
            }
         catch (Exception E) {
            return Language.valueOf("Xhosa").getExpresssion()+ ", " + name;
        }
    }


    public Map greeted () {
        return map;
    }

    public String greetedUser (String username) {
        return username +" have been greeted " + map.get(username) + " time(s)";
    }

    public String clear (String username) {
        if (map.containsKey(username)) {
            map.remove(username);
        }
        return username + " has been deleted";
    }

    public String reset () {
            map.clear();
    return "All greeted names have been deleted";
    }

    public String resetAll () {
        return reset();
    }

    public Integer counter () {
        return map.size();
    }

    public String totalCounter () {
        return counter() + " name(s) have been greeted";
    }

    public String help () {
        String str =
                "- greet followed by the name and the language the user is to be greeted in\n" +
                "- greeted should display a list of all users that has been greeted and how many time each user has been greeted\n" +
                "- greeted followed by a username returns how many times that username have been greeted\n" +
                "- counter returns a count of how many unique users has been greeted\n" +
                "- clear deletes of all users greeted and the reset the greet counter to 0\n" +
                "- clear followed by a username delete the greet counter for the specified user and decrement the greet counter by 1\n" +
                "- exit exits the application\n" +
                "- help shows a user an overview of all possible commands\n";

        return  str;
    }
}
