public class Main {
    public static void main(String[] args) {
        Instrument guitarra1 = new Instrument();
        guitarra1.setNserie(1102001020);
        guitarra1.setPreu(1000);
        guitarra1.getNom("guit");
        Especificacio esp1 = new Especificacio();
        esp1.addAtribute("Marca", "Gibson");
        esp1.addAtribute("nCordes", 2);
        esp1.addAtribute("a", "e");
        guitarra1.setEspecificacio(esp1);

        Instrument guitarra2 = new Instrument();
        guitarra2.setNserie(123213213);
        guitarra2.setPreu(11222);
        guitarra2.setNom("aaaa");
        guitarra2.setEspecificacio(esp1);

    }
}
