package tech.makers.twitter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Clock;
import java.time.LocalDateTime;

// This is a Spring Entity.
// It represents a Model in MVC.
// And each instance, when saved, will refer to a row in the 'tweet' table in the database.
@Entity
public class Tweet {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String body;
    private LocalDateTime createdAt;

    protected Tweet() {}

    public Tweet(String body) {
        this.body = body;
        // By default, LocalDateTime chooses the time of your computer.
        // Provide Universal Time as default instead
        this.createdAt = LocalDateTime.now( Clock.systemUTC() );
    }

    // for dependency injecting a fake clock
    public Tweet(String body, Clock clock) {
        this.body = body;
        this.createdAt = LocalDateTime.now(clock);
    }

    // custom return value for toString (inherited from Object)
    @Override
    public String toString() {
        return String.format("Tweet[id=%d, body='%s', createdAt=%s]", id, body, createdAt);
    }

    public Long getId() {
        return this.id;
    }

    public String getBody() {
        return this.body;
    }

    public LocalDateTime getCreatedAt() { return this.createdAt; }
}
