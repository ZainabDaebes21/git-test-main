public class Main {
    public static void main(String[] args) {
        System.out.println("Main.main");
        System.out.println("Main.main 23-post-person");
        System.out.println("Main.main 3");

        Person person = new Person("Arne", 100);

        System.out.println("Main.main "+person.getName());

        System.out.println("HEJ");
    }
}
