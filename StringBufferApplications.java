import java.util.Scanner;
public class StringBufferApplications {
    
    // Application 1: Rechercher et Remplacer
    public static String rechercherEtRemplacer(String ch, String mot1, String mot2) {
        return new StringBuffer(ch).toString().replace(mot1, mot2);
    }