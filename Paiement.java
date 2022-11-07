package pak_Minipro;

import java.util.Scanner;

public class Paiement {

    //Attributs
    private int NbrEmploye, NbrCommerciaux ;
    private double SalaireTotalDuPersonnel = 0.0 , SalareTotalDesCommerciaux = 0.0;

    //Constructeur
    public Paiement(int nbrEmploye, int nbrCommerciaux) {
        NbrEmploye = nbrEmploye;
        NbrCommerciaux = nbrCommerciaux;
    }

    //LES METHODES
    public void RecensementPersonnel (int nbrEmploye){

        for (int i = 1 ; i <= nbrEmploye ; i++){

            //Initialisations et variables
            System.out.println("Enregistrment de l'employé N°"+ i );
            Scanner Lecture = new Scanner(System.in);
            String NomEmploye , MatriculeEmloye;
            double IndiceSalarialEmploye , ValeurBaseEmploye;

            //Prise  des informmations
            System.out.println("Veuillez entrer le nom  de l'employé N° " + i);
            NomEmploye = Lecture.nextLine();
            System.out.println("Veuillez entrer le matricule de l'employé " + NomEmploye);
            MatriculeEmloye = Lecture.nextLine();
            System.out.println("Veuillez entrer  l'indice salarial de l'employé " + NomEmploye);
            IndiceSalarialEmploye = Lecture.nextDouble();

            //Création c'un employé
            Personnel Employe = new Personnel(NomEmploye,MatriculeEmloye,IndiceSalarialEmploye);
            SalaireTotalDuPersonnel = SalaireTotalDuPersonnel +  Employe.CalculSalaire();

            //Message de fin de récesement
            System.out.println("FIN DE L'ENREGISTREMENT DE L'EMPLOYE " + i );
            System.out.println("");
        }
    }

    public void RecensementCommerciaux (int nbrCommerciaux){

        for (int i = 1 ; i <= nbrCommerciaux ; i++){

            //Initialisations et variables
            System.out.println("Enregistrment du commercial N°"+ i );
            Scanner Lecture = new Scanner(System.in);
            String NomCommercial , MatriculeCommercial;
            double IndiceSalarialCommercial , ValeurBaseCommercial , VenteDuDernierMois;

            //Prise  des informmations
            System.out.println("Veuillez entrer le nom  du commercial N° " + i);
            NomCommercial = Lecture.nextLine();
            System.out.println("Veuillez entrer le matricule du commercial " + NomCommercial);
            MatriculeCommercial = Lecture.nextLine();
            System.out.println("Veuillez entrer  l'indice salarial du commercial " + NomCommercial);
            IndiceSalarialCommercial = Lecture.nextDouble();
            System.out.println("Veuillez entrer la vente du dernier mois du commercial  " + NomCommercial);
            VenteDuDernierMois= Lecture.nextDouble();

            //Création c'un employé
            Commerciaux Commercial = new Commerciaux(NomCommercial,MatriculeCommercial,IndiceSalarialCommercial,VenteDuDernierMois);
            SalareTotalDesCommerciaux = SalareTotalDesCommerciaux + Commercial.CalculSal();

            //Message de fin de récesement
            System.out.println("FIN DE L'ENREGISTREMENT DU COMMERCIAL " + i);
            System.out.println("");
        }
    }

    public double SalaireGeneral (){
        return SalareTotalDesCommerciaux + SalaireTotalDuPersonnel ;
    }


}
