public enum Language {
    Xhosa("Molo"),
    Spanish("Ola"),
    Arabic("Marhabaan");

    private final String expresssion;

    Language(String expression) {
        this.expresssion = expression;
    }

    public String getExpresssion() {
        return expresssion;
    }
}
