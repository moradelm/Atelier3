 class Vecteur extends Point {
      public Vecteur(){
          x=0;
          y=0;
      }
     public void ChangeVec(double X,double Y){
         x=X;
         y=Y;
     }
     public double normeVecteur(double x,double y){
          return (Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
     }
     public void afficheVecteur(){
             System.out.println(" Vecteur de coord : X :" + x + "Y :" + y);
      }
 }
