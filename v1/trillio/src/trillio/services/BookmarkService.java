package trillio.services;

import trillio.models.BookModel;
import trillio.models.MovieModel;
import trillio.models.WebLinkModel;

public class BookmarkService {
    // Singleton Pattern
    private static BookmarkService instance = new BookmarkService();

    private BookmarkService() {}

    public static BookmarkService getInstance() {
        return instance;
    }

    // Business logic

    public WebLinkModel createWebLink(long id, String title, String url, String host) {

        WebLinkModel webLink = new WebLinkModel();
        webLink.setId(id);
        webLink.setTitle(title);
        webLink.setUrl(url);
        webLink.setHost(host);

        return webLink;
    }

    public BookModel createBook(long id, String title, int publicationYear, String publisher,
                                String[] authors, String genre, double amazonRating) {

        BookModel book = new BookModel();
        book.setId(id);
        book.setTitle(title);
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
