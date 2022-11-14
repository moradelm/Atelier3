public abstract class Rectangle implements geometrie{

    @Override
    public void perimetre(){
        float longueur=0,largeur=0;
        System.out.println("perimetre de rectangle " + (longueur+largeur)*2);

    }
    public void surface() {
        float longueur=0,largeur=0;
        System.out.println("surface de rectangle " + longueur*largeur);
    }

}
