class Cercle extends Point {
    private double rayon;
    public  Cercle(){
        x=0;
        y=0;
        rayon=0;
    }
    public void changeCercle( double X,double Y, double r){
        x=X;
        y=Y;
        rayon=r;
    }
    public double perimetreCercle(double rayon){
        double PI = 3.14;
        return (2*rayon*PI);
    }
    public float surfaceCercle(double rayon){
        double PI=3.14;
        return (float) (PI*Math.pow(rayon,2));
    }
    void afficheCercle(){
        System.out.println(" Cercle de coord : X :" + x + "Y :" + y + "et de rayon " + rayon);
    }
}
