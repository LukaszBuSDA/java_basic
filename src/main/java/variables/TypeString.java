package variables;

public class TypeString {

    public static void main(String[] args) {
        String text = "Dowolny napis 1 1.32";
        System.out.println("text = " + text);
        System.out.println("Pierwszy znak napisu " + text.charAt(0));
        System.out.println("Trzeci znak napisu " + text.charAt(2));
        System.out.println("Ostatni znak napisu " + text.charAt(text.length() - 1));

        System.out.println("y znajduje sie na indeksie: " + text.indexOf('y'));
        System.out.println("spacja znajduje sie na indeksie: " + text.indexOf(' '));
        System.out.println("napis znajduje sie na indeksie: " + text.indexOf("napis"));
        System.out.println("Długość napisu w zmiennnej tekst: " + text.length());

        // jak wydobyć i zapisać w nowej zmiennej słowo napis z zmiennej text
        String napis = text.substring(8, 13);
        System.out.println(napis);

        String cite = " Być albo nie być!";
        String updatedCite = cite.replaceAll("ć", "c");
        System.out.println(updatedCite);

        String name1 = "Ala";
        String name2 = "ala";
        System.out.println(name1.equals(name2));
        System.out.println(name1.length() >= name2.length());

        String name = "Michał";
        // name.charAt(name.length() -1) = 'l';   ---> typ string jest niezmienny
        name = name.replace("ł", "l");
        System.out.println("Po:" + name);
        //name + "abc";
        name = name + "abc";
        System.out.println("Po złączeniu z abc: " + name);

        // sprawdzenie czhy napis jest palindromem
        String txt = "KAJAKI";
        System.out.println(txt);
        // utworzyliśmy obiekt klasy stringbuffer   ---> edytowalny string
        StringBuffer editableTxt = new StringBuffer(txt);

        // odwrócenie kolejności liter w napisie
        editableTxt.reverse();
        String txtReversed = editableTxt.toString();

        System.out.println(editableTxt);

        System.out.println("czy napis jest polindromem: " + txt.equals(txtReversed));

        // false przy różnej wielkości znaków i przy nieprarzystej liczbie liter

        // inny sposób tego co wyżej ---- > jest u michała na gicie

        String login = "MikiKru";
//        System.out.println("małe litery: " + login.toLowerCase());
//        System.out.println("oryginał: " + login);

        System.out.println(login.equals("mikikru"));
        System.out.println(login.toUpperCase().equals("mikikru".toUpperCase()));

        String sentence = "Być albo nie być oto jest pytanie";
        // podziel zdanie na wyrazy
        // separator -> spacja
        String [] words = sentence.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);
        System.out.println(words[5]);
        System.out.println(words[6]);



    }
}
