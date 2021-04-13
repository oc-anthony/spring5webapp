package genesys.sf.demo.webapp.model.repositories;

import genesys.sf.demo.webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
