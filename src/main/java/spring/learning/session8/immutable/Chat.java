package spring.learning.session8.immutable;

import java.time.LocalDateTime;

public record Chat(String message, LocalDateTime timestamp) {
    public Chat(String message) {
        this(message, LocalDateTime.now());
    }
}
