public class VecteurEntiers {
    public static void remplir(int[] vecteur) {
        for (int i = 0; i < vecteur.length; i++) {
            vecteur[i] = (int)(Math.random() * 100); 
        }
    }
    
    public static void trier(int[] vecteur) {
        for (int i = 0; i < vecteur.length - 1; i++) {
            for (int j = 0; j < vecteur.length - i - 1; j++) {
                if (vecteur[j] > vecteur[j + 1]) {
                    int temp = vecteur[j];
                    vecteur[j] = vecteur[j + 1];
                    vecteur[j + 1] = temp;
                }
            }
        }
    }
    public static void afficher(int[] vecteur) {
        System.out.print("[");
        for (int i = 0; i < vecteur.length; i++) {
            System.out.print(vecteur[i]);
            if (i < vecteur.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] vect = new int[10];
        
        System.out.println("Vecteur initial (vide):");
        afficher(vect);
        
        remplir(vect);
        System.out.println("Vecteur après remplissage:");
        afficher(vect);
        
        trier(vect);
        System.out.println("Vecteur après tri:");
        afficher(vect);
    }
}