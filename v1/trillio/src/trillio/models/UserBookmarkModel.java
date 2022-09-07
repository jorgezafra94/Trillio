package trillio.models;

public class UserBookmarkModel {

    private BookmarkModel bookmark;
    private UserModel user;

    public BookmarkModel getBookmark() {
        return bookmark;
    }

    public void setBookmark(BookmarkModel bookmark) {
        this.bookmark = bookmark;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }
}
