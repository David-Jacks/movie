package dev.movieApi.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MovieService {
    @Autowired //we want the framework to instantiae the class for us
    private MovieRepository movieRepository;
    public List<Movies> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movies> singlMovie(ObjectId Id){
        return movieRepository.findById(Id);
    }
}
