package tp1_java;

public class point {
    private String nom;
    private int abscisse;
    private int ordonnee;

    public point(String nom, int abscisse, int ordonnee) {
        this.nom = nom;
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    public point(int abscisse, int ordonnee) {
    	this.abscisse = abscisse;
    	this.ordonnee = ordonnee;
    }

    public point(String nom) {
        this.nom = nom;
    }

    public void Affiche() {
        System.out.println(nom + " (" + abscisse + ", " + ordonnee + ")");
    }

    public void TranslHoriz(int a) {
        abscisse += a;
    }

    public void TranslVert(int a) {
        ordonnee += a;
    }

    public void Translation(int a, int b) {
        abscisse += a;
        ordonnee += b;
    }

    public boolean Coincide(point p) {
        return this.abscisse == p.abscisse && this.ordonnee == p.ordonnee;
    }

    public String getNom() {
        return nom;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonnee() {
        return ordonnee;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public void setOrdonnee(int ordonnee) {
        this.ordonnee = ordonnee;
    }
}
