package services;

import models.UserModel;

public class UserService {
    // Singleton Pattern
    private static UserService instance = new UserService();

    private UserService() {}

    public static UserService getInstance() {
        return instance;
    }

    // Business logic
    public UserModel createUser(long id, String email, String password, String firstName,
                                String lastName, int gender, String userType) {

        UserModel userModel = new UserModel();
        userModel.setId(id);
        userModel.setEmail(email);
        userModel.setPassword(password);
        userModel.setFirstName(firstName);
        userModel.setLastName(lastName);
        userModel.setGender(gender);
        userModel.setUserType(userType);

        return userModel;
    }
}
