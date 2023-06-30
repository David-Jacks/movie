package dev.movieApi.movies;

import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "movies")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movies {
    @Id
    private ObjectId id;

    private String imdbId;

    private String releaseDate;

    private String title;

    private String trialerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;
    @DocumentReference
    private List<Reviews> reviewIds;
}
