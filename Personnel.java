package pak_Minipro;

public class Personnel {

    //Attributs
    private String nom , matricule;
    private double indice;
    private final double SalaireBase = 50000.0 ;

    //Constructeur
    public Personnel(String nom, String matricule, double indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        indice = indiceSalarial;
    }

    //Accessurs
    public String getNom() {
        return nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public double getIndiceSalarial() {
        return indice;
    }

    //Modificateurs
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void setIndiceSalarial(double indiceSalarial) {
        indice = indiceSalarial;
    }

    //Redéfinition de la méthode toString

    @Override
    public String toString() {
        return "Nom='" + nom + '\'' +
                ", Matricule='" + matricule + '\'' +
                ", Indice salarial=" + indice
                ;
    }

    //LES METHODESSPECIFIQUE A LA CLASSE PERSONNEL
    public double CalculSalaire(){
        double Salaire = getIndiceSalarial()*SalaireBase;
        return  Salaire;
    }
}
