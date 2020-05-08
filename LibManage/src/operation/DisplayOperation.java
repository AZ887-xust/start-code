package operation;

import book.Book;
import book.BookList;

public class DisplayOperation implements IOperation {


    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        for (int i = 0; i <bookList.getUserSize() ; i++) {
            Book book = bookList.getBooks(i);
            System.out.println(book);
        }
    }
}
