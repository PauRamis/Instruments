public class Especificacio{
    private final static int MAX_ATTRS = 100;

    private String[] atributs = new String[MAX_ATTRS];
    private Object[] valors = new Object[MAX_ATTRS];
    private int natr = 0;

    public String[] getAtributs() {
        return atributs;
    }

    public Object[] getValors() {
        return valors;
    }

    public void addAtribute(String nom, Object valor){

    }

    public boolean match(Especificacio espCerca) {
        Especificacio espInst = this;
        for (int i = 0; i < espCerca.natr; i++) {
            String atribut = atributs[i];
            Object valor = valors[i];
            if (!attMatch(atribut, valor)){
                return false;
            }
        }

        return true;
    }

    private boolean attMatch(String atribut, Object valor) {
        for (int i = 0; i < this.natr; i++) {
            if (this.atributs[i].equals(atribut)){
                return this.valors[i].equals(valor);
            }
        }
        return false;
    }
}
