import java.util.*;

public class Ligne {
    protected Vector <Point> listPoint = new Vector<>(2);

    public Ligne(){listPoint.addElement(new Point(0, 0)); listPoint.addElement(new Point(0, 0));}

    public Ligne(Point a, Point b){listPoint.add(0, a); listPoint.add(1, b);}

    public void Ajout(int n){
        for(int i=0;i<n;i++){
            System.out.println("Element numero "+(i+1));
            Scanner obj = new Scanner(System.in);
            double a = obj.nextDouble();
            double b = obj.nextDouble();
            listPoint.add(i, new Point(a, b));
        }
    }

    public void supp(int index){
        listPoint.remove(index);
    }

    public void affiche(){ 
        for (int i=0;i<listPoint.size();i++) {
            listPoint.get(i).getPoint();
        }
    }
}
