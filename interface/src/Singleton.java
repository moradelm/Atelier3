public class Singleton {
    private static final Singleton singleton;
    private int counter;

    static {
        singleton = new Singleton();
    }
    private Singleton(){}
    public static Singleton getInstance(){
        return singleton;
    }
    public void traiter(String taskName){
        System.out.println("Traitement tache " +taskName);
        for (int i = 0; i < 5; i++) {
            counter++;
            System.out.println(".."+counter);
        }
        System.out.println("Fin");
    }

}
