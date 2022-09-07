package trillio.services;

import trillio.models.Book;
import trillio.models.Movie;
import trillio.models.WebLink;

public class BookmarkService {
    // Singleton Pattern
    private static BookmarkService instance = new BookmarkService();

    private BookmarkService() {}

    public static BookmarkService getInstance() {
        return instance;
    }

    // Business logic

    public WebLink createWebLink(long id, String title, String url, String host) {

        WebLink webLink = new WebLink();
        webLink.setId(id);
        webLink.setTitle(title);
        webLink.setUrl(url);
        webLink.setHost(host);

        return webLink;
    }

    public Book createBook(long id, String title, int publicationYear, String publisher,
                           String[] authors, String genre, double amazonRating) {

        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setPublicationYear(publicationYear);
        book.setPublisher(publisher);
        book.setAuthors(authors);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);

        return book;
    }

    public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
                             String[] directors, String genre, double imdbRating) {

        Movie movie = new Movie();
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
