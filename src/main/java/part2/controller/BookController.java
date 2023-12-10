package part2.controller;

import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import part2.domain.Book;
import part2.service.BookService;
import part2.util.BookFromJsonMapper;


@RequiredArgsConstructor
@RestController
@RequestMapping("/book")
public class BookController {

    private final BookFromJsonMapper mapper;
    private final BookService bookService;

    @PostMapping
    public ResponseEntity<String> receiverBook(@RequestBody Book book) {
        bookService.save(book);
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        return new ResponseEntity<String>(
                "Book got",
                HttpStatus.CREATED
        );
    }
}
