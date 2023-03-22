package dev.swarupa.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data //for setters and getters
@AllArgsConstructor //constructor with arguments
@NoArgsConstructor //constructor without arguments
public class Review {
    @Id
    private ObjectId id;

    public Review(String body) {
        this.body = body;
    }

    private String body;

}
