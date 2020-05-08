package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DeleteOperation implements IOperation{

    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除图书的名字：");
        String name = scanner.nextLine();
        int i = 0;
        for (; i <bookList.getUserSize() ; i++) {
            Book book = bookList.getBooks(i);
            if(book.getName().equals(name)) {
                break;
            }
        }
        if(i == bookList.getUserSize()) {
            System.out.println("没有该书");
            return;
        }
        for (int pos = i; pos <bookList.getUserSize()-1 ; pos++) {
            Book book = bookList.getBooks(pos+1);
            bookList.setBooks(pos,book);
        }
        bookList.setUserSize(bookList.getUserSize()-1);
        System.out.println("删除成功");
    }
}
