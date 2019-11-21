package staticClass;


public class User {
    // sadowe statyczne - pole lub metoda związana z klasą a nie z obiektem
    public static int globalId;
    private String login;
    private String password;

    public static void incrementGlobalId(){
        globalId++;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;

    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
