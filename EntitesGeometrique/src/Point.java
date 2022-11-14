import java.util.Scanner;

public class Point {
      protected double x;
      protected double y;
      public  Point(){
           x=0;
           y=0;
     }
      public void ChangePoint(double X,double Y){
            x=X;
            y=Y;
      }
      public void affichePoint(){
          System.out.println("X :" + x + "Y :" + y);
      }
}
