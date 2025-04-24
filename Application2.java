import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        int n = lectureN();
        int[] T = new int[n];
        RemplirTab(T);
        
        double moyenne = Calcul_Moy(T);
        int nombreSup = NombreNote(T, moyenne);
        
        System.out.println("Nombre de notes supérieures à la moyenne (" + moyenne + "): " + nombreSup);
    }
    
    public static int lectureN() {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez le nombre d'étudiants (n >= 10): ");
            n = scanner.nextInt();
        } while (n < 10);
        return n;
    }
    
    public static void RemplirTab(int[] T) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisie des notes (entre 0 et 20):");
        for (int i = 0; i < T.length; i++) {
            do {
                System.out.print("Note " + (i+1) + ": ");
                T[i] = scanner.nextInt();
            } while (T[i] < 0 || T[i] > 20);
        }
    }
    
    public static double Calcul_Moy(int[] T) {
        double somme = 0;
        for (int note : T) {
            somme += note;
        }
        return somme / T.length;
    }
    
    public static int NombreNote(int[] T, double moyenne) {
        int count = 0;
        for (int note : T) {
            if (note > moyenne) {
                count++;
            }
        }
        return count;
    }
}
