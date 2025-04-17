import java.util.Scanner;
public class ex1 {
        public static int Lecture() {
            Scanner scanner = new Scanner(System.in);
            int n;
            do {
                System.out.println("Entrer un entier strictement positif :");
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("L'entier doit être strictement positif !");
                }
            } while (n <= 0);
            return n;
        }
    
        public static int Compter(int n) {
            int count = 0;
            while (n != 0) {
                n /= 10;
                count++;
            }
            return count;
        }
    
        public static void main(String[] args) {
            int nombre = Lecture();
            int nbChiffres = Compter(nombre);
            System.out.println("Le nombre contient " + nbChiffres + " chiffre(s).");
        }
    }