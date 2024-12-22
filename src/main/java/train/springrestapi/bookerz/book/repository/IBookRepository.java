package train.springrestapi.bookerz.book.repository;

import train.springrestapi.bookerz.book.models.Book;

import java.util.List;
import java.util.Optional;

public interface IBookRepository {
    List<Book> getBooks();
    Optional<Book> getBookById(long id);
    Book createBook(Book book);
    Book updateBook(long id, Book book);
    void deleteBook(long id);
}