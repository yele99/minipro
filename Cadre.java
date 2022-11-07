package pak_Minipro;

import java.util.*;

public class Cadre extends Personnel {

    //Attributs
     private ArrayList<Personnel> ListeSubalterne = new ArrayList<Personnel>();

    //Constructeur
    public Cadre(String nom, String matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
    }

    //Accesseur
    public ArrayList<Personnel> getListeSubalterne() {
        return ListeSubalterne;
    }

    //Modificateur
    public void setListeSubalterne(ArrayList<Personnel> listeSubalterne) {
        ListeSubalterne = listeSubalterne;
    }

    //METHODES SPECIFIQUE A LA CLASSE CADRE
    public void EnregisterSubalternes (int nbr){
        for (int i = 1 ; i <= nbr ; i++){
            System.out.println("Enregistrment du subalterne N°"+ i );
            Scanner Lecture = new Scanner(System.in);
            String NomSubalterne , MatriculeSubalterne;
            double IndiceSalarialSubalterne;
            System.out.println("Veuillez entrer le nom  du subalterne N° " + i);
            NomSubalterne = Lecture.nextLine();
            System.out.println("Veuillez entrer le matricule de " + NomSubalterne);
            MatriculeSubalterne = Lecture.nextLine();
            System.out.println("Veuillez entrer  l'indice salarial de N° " + NomSubalterne);
            IndiceSalarialSubalterne = Lecture.nextDouble();
            Personnel Subalterne = new Personnel(NomSubalterne,MatriculeSubalterne,IndiceSalarialSubalterne);
            ListeSubalterne.add(Subalterne);
            System.out.println("FIN DE L'ENREGISTREMENT DU SUBALTERNE " + NomSubalterne);
            System.out.println("");
        }
    }

    public void AfficherPersonnel(){
        int NombreSubalterne = ListeSubalterne.size();
        System.out.println(super.getNom() +" Vous avez " + NombreSubalterne +" subalterne(s)");
        System.out.println("Voici la liste :");
        for (int j = 0 ; j <= (NombreSubalterne - 1) ; j++){
            int NumeroSubalterne = j + 1 ;
            System.out.println("Subalterne N° " + NumeroSubalterne);
            Personnel Subalterne = ListeSubalterne.get(j);
            System.out.println(Subalterne.toString());;
        }
    }
}
