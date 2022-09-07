package trillio.daos;

import trillio.DataStore;
import trillio.models.User;

public class UserDao {

    public User[] getUsers() {
        return DataStore.getUsers();
    }
}
