package loops;

public class OmittingInstructions {
    public static void main(String[] args) {
        // program wyszukujacy określony znak w napisie
        // --> jeśli znaleziono -- > wypisz pozycję tego znaku
        // -> jeśli nie znaleziono wypisz komunikat
        String sentence = "Ala ma kota a kot ma Alę";
        char search = '.';
        boolean isFound = false;
        for (int i = 0; i < sentence.length() ; i++) {
            System.out.println("iteracja nr: " + i);
            if(sentence.charAt(i) !=search){
                continue;
            } else if (sentence.charAt(i) ==search) {
                System.out.printf("znaleziono na znak %c na indeksie %d", sentence.charAt(i),i);
                // instrukcja przerywająca działanie pętli
                isFound = true;
                break;
            }
            System.out.println("Nic ważnego");
        }
        if(isFound == false){
            System.out.printf("Nie znaleziono znaku %c w tekście %s\n", search, sentence);
        }
    }
}
