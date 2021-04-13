package genesys.sf.demo.webapp.bootstrap;

import genesys.sf.demo.webapp.model.Author;
import genesys.sf.demo.webapp.model.Book;
import genesys.sf.demo.webapp.model.repositories.AuthorRepository;
import genesys.sf.demo.webapp.model.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public Bootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Author author_a = new Author("Patrick", "Ness");
        Book book_a = new Book("A Monster Calls", "0763660655", "Candlewick");
        author_a.getBooks().add(book_a);
        book_a.getAuthors().add(author_a);

        authorRepository.save(author_a);
        bookRepository.save(book_a);

        Author author_b = new Author("Tite", "Kubo");
        Book book_b = new Book("Bleach, Vol. 16 ", "1421506149", "VIZ Media LLC");
        author_b.getBooks().add(book_b);
        book_b.getAuthors().add(author_b);

        authorRepository.save(author_b);
        bookRepository.save(book_b);
    }
}
