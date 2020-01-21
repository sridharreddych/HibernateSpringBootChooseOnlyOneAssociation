package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
//            bookstoreService.persistReviewOk();
           bookstoreService.persistReviewWrong();
        };
    }
}

/*
 * How To Ensure/Validate That Only One Association Is Non-Null

Description: Consider an entity named Review. This entity defines three @ManyToOne relationships to Book, Article and Magazine. A review can be associated with either a book, a magazine or an article. To validate this constraint, we can rely on Bean Validation as in this application.

Key points:

rely on Bean Validation to validate that only one association is non-null
expose the constraint via a custom annotation (@JustOneOfMany) added at class-level to the Review entity
for preventing native query to break our constraint add the validation at database level as well (e.g., in MySQL add a TRIGGER)
 */
