
import java.util.HashMap;

public class Greeted {
    HashMap<String, String> map = new HashMap();


    public String greetPerson(String name, String language) {
        try {
            return Language.valueOf(language).getExpresssion()+ ", " + name;
            }
         catch (Exception E) {
            return Language.valueOf("Xhosa").getExpresssion()+ ", " + name;
        }
    }


//    public String greeted (String name) {
//
//        if (map.containsKey(name)) {
//            System.out.println("map size is:" + map.size());
////            map.put(name);
//
//            String greetedNames = map.get(name);
//            System.out.println("Greeted Names: " + greetedNames);
//        } else if (map.isEmpty()) {
//            System.out.println("Map is empty");
//
//        }
//
////        return greetPerson();
//    }

}


//*Not going home until greeted class works*