public class ex1 {
    public static double somme(double[] tab) {
        double sum = 0;
        for (double num : tab) {
            sum += num;
        }
        return sum;
    }
    public static void incre(double[] tab, double valeur) {
        for (int i = 0; i < tab.length; i++) {
            tab[i] += valeur;
        }
    }
    public static void affiche(double[] tab) {
        System.out.print("[");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
            if (i < tab.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        double[] nombres = {1.5, 2.3, 4.7, 5.1};
        
        System.out.println("Tableau initial:");
        affiche(nombres);
        
        System.out.println("Somme: " + somme(nombres));
        
        incre(nombres, 2.0);
        System.out.println("Tableau après incrémentation de 2:");
        affiche(nombres);
    }
}