package text7;

import java.util.Scanner;


public class Text {
    public static void main (String[] args)  {
        try {
            Scanner in = new Scanner(System.in);
            String email = in.nextLine();
            email e = new email();
            e.checkEmail(email);
        } catch (emailException e) {
            e.printStackTrace();
        }

    }

}
