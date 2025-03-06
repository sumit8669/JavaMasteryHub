package sumit.designpattern.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User()
                .withFirstName("Sumit")
                .withLastName("Rana");

        System.out.println(user);
    }

}
