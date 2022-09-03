package services;

import models.BookModel;
import models.MovieModel;
import models.WebLinkModel;

public class BookMarkService {
    // Singleton Pattern
    private static BookMarkService instance = new BookMarkService();

    private BookMarkService() {}

    public static BookMarkService getInstance() {
        return instance;
    }

    // Business logic

    public WebLinkModel createWebLink(long id, String title, String profileUrl, String url, String host) {

        WebLinkModel webLink = new WebLinkModel();
        webLink.setId(id);
        webLink.setTitle(title);
        webLink.setProfileUrl(profileUrl);
        webLink.setUrl(url);
        webLink.setHost(host);

        return webLink;
    }

    public BookModel createBook(long id, String title, String profileUrl, int publicationYear, String publisher,
                                String[] authors, String genre, double amazonRating) {

        BookModel book = new BookModel();
        book.setId(id);
        book.setTitle(title);
        book.setProfileUrl(profileUrl);
        book.setPublicationYear(publicationYear);
        book.setPublisher(publisher);
        book.setAuthors(authors);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);

        return book;
    }

    public MovieModel createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
                                  String[] directors, String genre, double imdbRating) {

        MovieModel movie = new MovieModel();
        movie.setId(id);
        movie.setTitle(title);
        movie.setProfileUrl(profileUrl);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirectors(directors);
        movie.setGenre(genre);
        movie.setImdbRating(imdbRating);

        return movie;
    }
}
