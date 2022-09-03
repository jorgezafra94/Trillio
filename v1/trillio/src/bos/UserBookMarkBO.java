package bos;

import models.BookmarkModel;
import models.UserModel;

public class UserBookMarkBO {

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
