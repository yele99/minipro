package pak_Minipro;

import java.util.Scanner;

public class PaiementPrincipal {

    public static void main(String[] args){

        Scanner Lecture = new Scanner(System.in);
        System.out.println("Combien avez vous d'employés qui ne sont pas des commerciaux ? ");
        int nbr1 = Lecture.nextInt();
        System.out.println("Combien avez vous de commerciaux ?");
        int nbr2 = Lecture.nextInt();

        Paiement paiement = new Paiement(nbr1,nbr2);
        paiement.RecensementPersonnel(nbr1);
        paiement.RecensementCommerciaux(nbr2);
        System.out.println("Pour payer tout le monde vous devez prévoir "+ paiement.SalaireGeneral());

    }

}


