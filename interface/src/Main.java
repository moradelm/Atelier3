public class Main {
    public static void main(String[] args) {
     // Singleton singleton = new Singleton(); si on fait appel constructeur on aura erreur car constructeur prive alos on l'appelle a partir de methode getInstance
        for (int i = 0; i <5 ; i++) {
            Singleton s = Singleton.getInstance();
            s.traiter("Task "+i);
        }

    }
}