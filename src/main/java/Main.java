import model.Book;

public class Main {

    public static void main(String[] args) {

        Book myBook1 = new Book("Gesammelte Werke", "Mark Twain");
        Book myBook2 = new Book("Gesammelte Werke", "Goethe");

        System.out.println(myBook1);
        System.out.println(myBook2);

        if (myBook1.equals(myBook2)) {
            System.out.println("Sind gleich!");

        } else {
            System.out.println("anders!");
        }

    }
}
