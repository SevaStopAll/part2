package part2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import part2.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
