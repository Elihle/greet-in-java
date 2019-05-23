
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

    public String counter (String name) {
        int greetedCounter = map.get(name);

        if (map.containsKey(greetedCounter)) {
        }
        return greetedCounter + " name(s) have been greeted";
    }


}
