public class Tableau2DOperations {
    
    public static void affiche(double[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean regulier(double[][] t) {
        if (t.length == 0) return true;
        int taille = t[0].length;
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != taille) {
                return false;
            }
        }
        return true;
    }
    public static double[] sommelignes(double[][] t) {
        double[] sommes = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double sum = 0;
            for (int j = 0; j < t[i].length; j++) {
                sum += t[i][j];
            }
            sommes[i] = sum;
        }
        return sommes;
    }
    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2) || 
            t1.length != t2.length || 
            (t1.length > 0 && t1[0].length != t2[0].length)) {
            return null;
        }
        
        double[][] result = new double[t1.length][];
        for (int i = 0; i < t1.length; i++) {
            result[i] = new double[t1[i].length];
            for (int j = 0; j < t1[i].length; j++) {
                result[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return result;
    }    public static void main(String[] args) {
        double[][] tab1 = {{1.5, 2.3}, {4.7, 5.1}, {3.2, 6.4}};
        double[][] tab2 = {{0.5, 1.7}, {2.3, 3.9}, {4.8, 5.6}};
        double[][] tab3 = {{1, 2}, {3}}; // Tableau non régulier
        
        System.out.println("Tableau 1:");
        affiche(tab1);
        
        System.out.println("\nTableau 1 est régulier? " + regulier(tab1));
        System.out.println("Tableau 3 est régulier? " + regulier(tab3));
        
        System.out.println("\nSommes des lignes de tableau 1:");
        double[] sommes = sommelignes(tab1);
        for (double s : sommes) {
            System.out.println(s);
        }
        
        System.out.println("\nSomme de tableau 1 et tableau 2:");
        double[][] sommeTab = somme(tab1, tab2);
        affiche(sommeTab);
        
        System.out.println("\nEssai d'addition avec tableau non régulier:");
        System.out.println(somme(tab1, tab3));
    }
}