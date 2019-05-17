public class Greeted {
    public String greetPerson(String name, String language) {

        try {
            return Language.valueOf(language).getExpresssion()+ ", " + name;
        } catch (Exception E) {
            return Language.valueOf("Xhosa").getExpresssion()+ ", " + name;
        }
    }
}
