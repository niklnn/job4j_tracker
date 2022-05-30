package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        String username = null;
        boolean valid = false;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                username = user.getUsername();
                valid = user.isValid();
            }
        }
        if (username == null) {
            throw new UserNotFoundException("User is not found");
        }
        return new User(username, valid);
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean rsl = user.getUsername().length() >= 3 && user.isValid();
        if (!rsl) {
            throw new UserInvalidException("User invalid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Semen Semenych", true),
                new User("Nik", true)
        };
        try {
            User user = findUser(users, "Nik");
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