public class MaximumTableau {
    
    public static int maxTableau(int[] tableau) {
        if (tableau.length == 0) {
            throw new IllegalArgumentException("Un tableau vide n'a pas de maximum");
        }
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int[] t1 = {1, 2, 5, 89, 75, 10};
        int[] t2 = {8};
        int[] t3 = {}; 
        
        System.out.println("Max de t1: " + maxTableau(t1)); 
        System.out.println("Max de t2: " + maxTableau(t2)); 
        
        try {
            System.out.println("Max de t3: " + maxTableau(t3));
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}