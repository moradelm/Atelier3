import java.util.Scanner;

public class TestGeometrie {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Entrer X ");
        double x=input.nextDouble();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Entrer y ");
        double y=input.nextDouble();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Entrer rayon ");
        double r=input3.nextDouble();

        Point p = new Point();
        p.ChangePoint(x,y);
        p.affichePoint();


        Cercle C = new Cercle();
        C.changeCercle(x,y,r);
        C.afficheCercle();
        System.out.println("Perimetre de Cercle C est :"+ C.perimetreCercle(r));
        C.surfaceCercle(r);

        Vecteur V = new Vecteur();
        V.ChangeVec(x,y);
        System.out.println("Norme de Vecteur V est :"+ V.normeVecteur(x,y));



    }
}
