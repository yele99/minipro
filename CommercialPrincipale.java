package pak_Minipro;

import java.util.Scanner;

public class CommercialPrincipale {

    public static void main(String[] args){

        Scanner Lecture = new Scanner(System.in);
        String nom , matricule;
        double IndiceSalarial , valeur;

        //R�cup�ration des infos
        System.out.println("Veuillez entrer votre nom ");
        nom = Lecture.nextLine();
        System.out.println("Veuillez entrer votre matricule");
        matricule = Lecture.nextLine();
        System.out.println("Veuillez entrer votre indice salarial");
        IndiceSalarial = Lecture.nextDouble();
        System.out.println("Veuillez entrer votre vente du dernier mois ");
        double Vente = Lecture.nextDouble();

        //Cr�aation d'un nouveau commercial
        Commerciaux Commercial = new Commerciaux(nom,matricule,IndiceSalarial,Vente);
        System.out.println(Commercial.toString());
        System.out.println("Le salaire de "+Commercial.getNom()+" est "+ Commercial.CalculSal() );
    }

}


