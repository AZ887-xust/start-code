package book;

public class BookList {
    private Book[] books = new Book[100];
    private int userSize = 0;

    public BookList() {
        books[0] = new Book("西游记","吴承恩",100,"小说");
        books[1] = new Book("三国演义","罗贯中",100,"小说");
        books[2] = new Book("水浒传","施耐庵",100,"小说");
        this.userSize = 3;

    }

    public Book getBooks(int pos) {
        return this.books[pos];
    }

    public void setBooks(int pos,Book book) {
        this.books[pos] = book;
    }

    public int getUserSize() {
        return userSize;
    }

    public void setUserSize(int userSize) {
        this.userSize = userSize;
    }
}
