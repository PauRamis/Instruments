public class Instrument {
    private String nom;
    private int preu;
    private int nserie;
    private Especificacio especificacio = new Especificacio();

    public String getNom(String nom) {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    public int getNserie() {
        return nserie;
    }

    public void setNserie(int nserie) {
        this.nserie = nserie;
    }

    public Especificacio getEspecificacio() {
        return especificacio;
    }

    public void setEspecificacio(Especificacio especificacio) {
        this.especificacio = especificacio;
    }
}
