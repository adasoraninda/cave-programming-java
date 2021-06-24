package com.adasoraninda;

import java.sql.SQLException;
import java.util.Optional;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {

        Database db = Database.getInstance();

        try {
            db.connect();
            System.out.println("Connected to database.");

            UserDao userDao = new UserDaoImpl();

            // Insert data
            // userDao.save(new User("Bob"));
            // userDao.save(new User("Maria"));

            // Delete data
            userDao.delete(2);

            // Get data
            userDao.getAll().stream().forEach(new Consumer<User>() {

                @Override
                public void accept(User user) {
                    System.out.println(user);
                }

            });

            // Find data
            Optional<User> user = userDao.findById(1);
            System.out.println("Retrivied: " + (user.isPresent() ? user.get() : "No data"));

            // Update data
            if (user.isPresent()) {
                User user2 = user.get();
                user2.setName("Bobby");

                userDao.update(user2);

                userDao.getAll().stream().forEach(new Consumer<User>() {

                    @Override
                    public void accept(User user) {
                        System.out.println(user);
                    }

                });
            }

        } catch (SQLException e) {
            System.out.println("Can't connect to database.");
        } finally {
            try {
                db.close();
            } catch (SQLException e) {
                System.out.println("Failed to close database.");
            }
        }

    }
}
