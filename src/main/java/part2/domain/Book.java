package part2.domain;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "author")
    private String author;

    @Column(name = "name")
    private String title;
}
