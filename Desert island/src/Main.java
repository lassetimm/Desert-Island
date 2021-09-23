import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static String[] Items = {"Flaske vand", "Kasse mad", "Hængekøje", "Kæreste", "Øl", "Telefon", "Wc", "Seng", "Tag over hoved", "Solcreme"};
    static int[] ItemNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int[] ItemCounter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public static void main(String[] args) {

        AnswerRepeter(Items, ItemCounter);
        System.out.println(Arrays.toString(ItemCounter));

        MostPopularItem(ItemCounter);


        String popItem = Items[MostPopularItem(ItemCounter)];
        String mestPopularItem = "Den mest populare ting er ";
        System.out.println(mestPopularItem + popItem);

    }

    public static int MostPopularItem(int[] ItemCounter) { //Jeg troede det virkede men det viste det sig ikke at gøre da jeg viste det til min bror. Prøvede at fix det man havde ikke tid dsv. Så at finde det mest populære item kan den dsv ikke.
        int temp = 0;
        int indexNumber = 0;
        for (int i = 0; i < ItemCounter.length; i++) {
            if (ItemCounter[i] > temp) {
                temp = ItemCounter[i];
                indexNumber = ItemCounter[i];
            }
        }
        return indexNumber;

    }

    public static void AnswerRepeter(String[] Items, int[] ItemCounter) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        String HvorMangeMennesker = "Hvor mange mennekser skal svare på dette spørgsmål?";
        System.out.println(HvorMangeMennesker);
        int Rounds = scanner.nextInt();

        String WelcomeMsg = "Hvilken ting ville du helst havde med af disse muligheder?";
        System.out.println(WelcomeMsg);

        SoutItems(Items, ItemNumber);

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