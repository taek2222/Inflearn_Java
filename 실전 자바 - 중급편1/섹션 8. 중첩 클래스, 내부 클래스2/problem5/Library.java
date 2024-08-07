package problem5;

public class Library {
    Book[] books;
    int bookNumber;

    public Library(int maxBooks) {
        books = new Book[maxBooks];
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        insertBook(book);
    }

    public void insertBook(Book book) {
        if (bookCheck())
            System.out.println("도서관 저장 공간이 부족합니다.");
        else
            books[bookNumber++] = book;
    }

    private boolean bookCheck() {
        return bookNumber == books.length;
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
        }
    }

    class Book {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
