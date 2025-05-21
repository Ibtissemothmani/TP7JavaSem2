import java.util.Scanner;

public class exercice2 {
    public static void afficherProduit(String[] produit) {
        for (String champ : produit) {
            System.out.print(champ + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[][] produits = {
            {"Amoxicillie", "Antibiotique", "13-04-2023", "14-03-2026", "Oral", "34.600"},
            {"Ceftriaxone", "Antibiotique", "01-01-2025", "01-10-2028", "Oral", "10.768"},
            {"Fluconazole", "Antifongique", "05-02-2024", "10-12-2027", "Oral", "20.500"}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer la catégorie à afficher (ex: Antibiotique) : ");
        String categorie = scanner.nextLine();

        System.out.println("\nMédicaments de la catégorie " + categorie + " :");
        for (String[] produit : produits) {
            if (produit[1].equalsIgnoreCase(categorie)) {
                afficherProduit(produit);
            }
        }

        System.out.println("\nApplication d'une augmentation de 5% sur le prix de chaque médicament :");
        for (String[] produit : produits) {
            double prix = Double.parseDouble(produit[5]);
            prix = prix * 1.05;
            produit[5] = String.format("%.3f", prix);
            afficherProduit(produit);
        }
    }
}