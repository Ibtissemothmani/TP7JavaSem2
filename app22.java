import java.util.Scanner;
public class app22 {
    public static String coderChaine(String ch) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) (base + (c - base + 3) % 26);
            }
            sb.append(c);
        }
        return sb.toString();
    }
    
}
