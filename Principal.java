
package pak_Minipro;


import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner Lecture = new Scanner(System.in);
        String nom , matricule;
        double IndiceSalarial , valeur;
        System.out.println("Veuillez entrer votre nom ");
        nom = Lecture.nextLine();
        System.out.println("Veuillez entrer votre matricule");
        matricule = Lecture.nextLine();
        System.out.println("Veuillez entrer votre indice salarial");
        IndiceSalarial = Lecture.nextDouble();
        Personnel P1 = new Personnel(nom,matricule,IndiceSalarial);
        
        System.out.println("L'employé "+P1.getNom()+" de matricule "+P1.getMatricule()+" d'indice salarial "+ P1.getIndiceSalarial()+
        		"a un salaire de "+ P1.CalculSalaire() );
    }

}
