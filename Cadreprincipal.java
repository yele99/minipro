package pak_Minipro;

import java.util.Scanner;

public class Cadreprincipal {

    public static void main(String[] args){

        Scanner Lecture = new Scanner(System.in);
        String nom , matricule;
        double IndiceSalarial , valeur;

        //Récupération des infos
        System.out.println("Veuillez entrer votre nom ");
        nom = Lecture.nextLine();
        System.out.println("Veuillez entrer votre matricule");
        matricule = Lecture.nextLine();
        System.out.println("Veuillez entrer votre indice salarial");
        IndiceSalarial = Lecture.nextDouble();
        System.out.println("Veuillez entrer le nombre de vos subalternes");
        int nbr = Lecture.nextInt();

        //Création d'un cadre
        Cadre C = new Cadre(nom,matricule,IndiceSalarial);
        C.EnregisterSubalternes(nbr);
        C.AfficherPersonnel();

    }

}
