import java.lang.reflect.Array;
import java.nio.file.attribute.AclEntryPermission;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String question_1 = "what is your name?";
        String question_2 = "hard to gain easy to lose: ";
        String question_3 = "easy to gain hard to lose: ";


        String[] cevaplar = {"cem uzan", "ice cream", "battery"};


        Scanner scanner = new Scanner(System.in);
        int soru = 1;
        String cevap;

        while (true)
        {
            System.out.println(soru);
            switch (soru)
            {
                case 1:
                    System.out.println(question_1);
                    cevap = cevaplar[0];
                    break;
                case 2:
                    System.out.println(question_2);
                    cevap = cevaplar[1];
                    break;
                case 3:
                    System.out.println(question_3);
                    cevap = cevaplar[2];
                    break;
            }
            String input = scanner.nextLine();

            if (input.equals(cevaplar[soru - 1]))
            {
                System.out.println("Correct Answer!");
                if (soru <= 2)
                {
                    soru += 1;
                }
                else {
                    System.out.println("Great Job!");
                    break;
                }
            }
            else System.out.println("Even my grand ma would know this.."); continue;


        }
    }
}