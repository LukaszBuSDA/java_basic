package loops;

public class ForLoop {
    public static void main(String[] args) {
        String sentence = "Ala ma kota";
        // Ala ma kota znaki
        // 012345678910 idneksy
        // wyousz w petli wszystkie znaki  pojedynczko
        for (int i = 0; i <= sentence.length() -1 ; i++){

            // warunek wycinający spację
            if (sentence.charAt(i) !=' '){
                System.out.printf("indeks: %d znak: %c \n", i, sentence.charAt(i));


        }
    }
        //tablica zmienna przechowująca zestaw wartości uporządkowanych po indeksach
        // index 0 -> 2
        // index 1 -> 4 itd

        int numbers [] = {2,4,6,8};
        // for ( typ pojedynczej wartości  nazwa podreczna : sekwencja - kolekcja wartości)
        int index = 0;
        for (int number : numbers)
              {
                  System.out.printf("indeks: %d wartość: %d\n", index , number);
                  index++;
        }
}
}

