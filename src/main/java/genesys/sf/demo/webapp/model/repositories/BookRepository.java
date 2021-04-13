package genesys.sf.demo.webapp.model.repositories;

import genesys.sf.demo.webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
