package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        String username = null;
        boolean valid = false;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                username = user.getUsername();
                valid = user.isValid();
                break;
            }
        }
        if (username == null) {
            throw new UserNotFoundException("User is not found");
        }
        return new User(username, valid);
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || !user.isValid()) {
            throw new UserInvalidException("User invalid");
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Semen Semenych", true),
                new User("Ni", true)
        };
        try {
            User user = findUser(users, "Ni");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }
    }
}