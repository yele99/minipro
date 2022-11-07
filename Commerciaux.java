package pak_Minipro;

public class Commerciaux extends Personnel {
    //Attributs

    private double NombresVentes  , proportion , sal  ;

    //Constructeur


    public Commerciaux(String nom, String matricule, double indiceSalarial, double nombresVentes) {
        super(nom, matricule, indiceSalarial);
        NombresVentes = nombresVentes;
    }

    //ACCESSEURS
    public double getNombresVentes() {
        return NombresVentes ;
    }

    //MODIFICATEUR
    public void setNombresVentes(double nombresVentes) {
        NombresVentes = nombresVentes;
    }



    //Redéfinission de la mérhode toString()
    public String toString() {
        return "Nom='" + super.getNom() + '\'' +
                ", Matricule ='" + super.getMatricule() + '\'' +
                ", Indice salarial=" + super.getIndiceSalarial() +'\'' +
                ", Vente du dernier mois =" + getNombresVentes()
                ;
    }

    //METHODE
    public double interessement( ) {

        if( getNombresVentes() <= 500000){
            proportion = 0;
        }
        else {

            if ( 500000 < getNombresVentes() &&  getNombresVentes() < 750000) {
                proportion = 1.05;
            }
            else {
                if (750000 <= getNombresVentes() && getNombresVentes() < 900000){
                    proportion = 0.05;
                }
                else {
                    if(900000 <= getNombresVentes() && getNombresVentes() < 1000000){
                        proportion = 0.05;
                    }
                    else {
                        proportion = 0.08;
                    }
                }
            }
        }
        return getNombresVentes() * proportion;
    }

    public double CalculSal ( ) {
        return ( super.CalculSalaire() + interessement() )   ;
    }


}
