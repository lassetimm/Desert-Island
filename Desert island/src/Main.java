import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Items = {"Flaske vand", "Kasse mad", "Hængekøje", "Kæreste", "Øl", "Telefon", "Wc", "Seng", "Tag over hoved", "Solcreme"};
        int[] ItemNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ItemCounter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        String WelcomeMsg = "Hvilken ting ville du helst havde med af disse muligheder?";
        System.out.println(WelcomeMsg);

        SoutItems(Items, ItemNumber);

        AnswerRepeter(Items, ItemCounter);
        System.out.println(Arrays.toString(ItemCounter));

        MostPopularItem(ItemCounter);

    }

    public static void MostPopularItem(int[] ItemCounter) {
        for (int i = 10; i > 0; i--) {
            if (i == 10)
                for (int j = 0; j < ItemCounter.length; j++) {

                }
        }
        System.out.println(ItemCounter[9]);

    }

    public static void AnswerRepeter(String[] Items, int[] ItemCounter) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        String HvorMangeMennesker = "Hvor mange mennekser skal svare på dette spørgsmål?";
        System.out.println(HvorMangeMennesker);
        int Rounds = scanner.nextInt();

        while (i < Rounds) {
            String IntastValg = "Intast nummeret på den ting du helt vil havde med";
            System.out.println(IntastValg);
            int Answer = scanner.nextInt();
            ItemCounter(Answer, Items, ItemCounter);
            i++;
        }
    }


    public static void SoutItems(String[] Items, int[] ItemNumber) {
        //System.out.println(Arrays.toString(items));
        for (int i = 0; i < Items.length; i++) {
            System.out.println(ItemNumber[i] + " " + Items[i]);
        }
    }


    public static void ItemCounter(int Answer, String[] Items, int[] ItemCounter) {

        for (int i = 0; i < 10; i++) {
            if (i == Answer) {
                System.out.println("Du har valgt " + Items[i - 1]);
                ItemCounter[i - 1]++;
            }
        }
    }


}
