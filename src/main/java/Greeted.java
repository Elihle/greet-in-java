
import java.util.HashMap;
import java.util.Map;

public class Greeted {

    HashMap<String, Integer> map = new HashMap(); //{Jan=3}


    public String greetPerson(String name, String language) {
        try {

            if (map.containsKey(name)) {
//                System.out.println("map size is:" + map.size());
                int greetedCounter = map.get(name) + 1;
                map.put(name, greetedCounter);
//                System.out.println("Greeted Names: " + greetedNames);

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

    public String greetedUser (String userName) {
        return userName +" have been greeted " + map.get(userName) + " time(s)";
    }

    public String clear () {
        return clear();
    }

}
