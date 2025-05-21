public class exercice1 {
    public static double convertir(String chaine) {
        try {
            return Double.parseDouble(chaine);
        } catch (NumberFormatException e) {
            System.out.println("erreur: la chaine \"" + chaine + "\" ne peut pas etre convertie en double.");
            return 0.0;
        }
    }

    public static void AffichageM(double[][] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
