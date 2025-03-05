import java.util.Scanner;
public class app33 {
    public static String mettreMajuscules(String ch) {
        StringBuffer sb = new StringBuffer(ch);
        boolean enDebutMot = true;
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (Character.isLetter(c)) {
                if (enDebutMot) {
                    sb.setCharAt(i, Character.toUpperCase(c));
                    enDebutMot = false;
                }
            } else {
                enDebutMot = true;
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
}
