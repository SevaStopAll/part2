package part2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import part2.domain.Book;
import part2.repository.BookRepository;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
