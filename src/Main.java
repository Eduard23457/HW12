public class Main {
    public static void main(String[] args) {

        Author bookOne = new Author("Александр", "Пушкин");
        Author bookTwo = new Author("Александр", "Грибоедов");
        Book one = new Book("Дубровский", bookOne, 1841);
        Book two = new Book("Горе от ума", bookTwo, 1833);
        System.out.println("Название книги " + one.getBookName() + ". Автор " + bookOne.getFirstName() + " " + one.getAuthor().getLastName() + ", год: " + one.getBookAge());
        System.out.println("Название книги " + two.getBookName() + ". Автор " + bookTwo.getFirstName() + " " + two.getAuthor().getLastName() + ", год: " + two.getBookAge());

    }

}

