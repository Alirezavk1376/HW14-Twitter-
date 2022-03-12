package models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String comment;
    @ManyToOne
    private Twit twit;
    @ManyToOne
    private User user;

    public Comment(Integer id, String comment, Twit twit, User user) {
        this.id = id;
        this.comment = comment;
        this.twit = twit;
        this.user = user;
    }

    public Comment() {
    }
}
