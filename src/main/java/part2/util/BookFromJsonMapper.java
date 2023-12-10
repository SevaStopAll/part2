package part2.util;

import org.json.JSONObject;
import org.springframework.stereotype.Component;
import part2.domain.Book;

@Component
public class BookFromJsonMapper {


    public Book map(JSONObject object) {
        Book book = new Book();
        book.setAuthor(object.getString("author"));
        book.setTitle(object.getString("title"));
        return book;
    }
}
