package lombok;
// model java beans

// @ToString             // dodaje toString()
// @Setter              // dodaje settery dla wszystkich pól
// @Getter              // dodaje gettery dla wszystkich pól
// @NoArgsConstructor // dodaje konstrukktor domyślny - bez argumentów
@AllArgsConstructor // dodaje konstruktory z wszystkimi polami klaswoymi w argumencie
@Data // dodaje gettery, settery i toString do wszystkich pól klasowych
public class AnnotationsLombok {

    private String login;
    private String password;
    private String acronim;


}
