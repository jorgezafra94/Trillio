package trillio.daos;

import trillio.DataStore;
import trillio.models.Bookmark;

public class BookmarkDao {

    public Bookmark[][] getBookmarks() {
        return DataStore.getBookmarks();
    }
}
