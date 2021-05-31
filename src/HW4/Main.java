package HW4;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Денежко", "9987451623");
        phonebook.add("Кущ", "9975623145");
        phonebook.add("Олейник", "9996658236");
        phonebook.add("Фролов", "9825678943");
        phonebook.add("Денежко", "9975621974");
        System.out.println("-----");

        System.out.println("Денежко");
        System.out.println(phonebook.get("Денежко"));
        System.out.println("Кущ");
        System.out.println(phonebook.get("Кущ"));
        System.out.println("Олейник");
        System.out.println(phonebook.get("Олейник"));
        System.out.println("Фролов");
        System.out.println(phonebook.get("Фролов"));

        
    }
}
