package com.adasoraninda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {

    @Override
    public void save(User data) {
        Connection conn = Database.getInstance().getConnection();

        try {
            String sql = "INSERT INTO user (name) values (?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, data.getName());

            stmt.executeUpdate();

            stmt.close();
        } catch (SQLException e) {
            throw new DaoException(e);
        }

    }

    @Override
    public Optional<User> findById(int id) {
        Connection conn = Database.getInstance().getConnection();

        try {
            String sql = "SELECT * FROM user WHERE id=?";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");

                User user = new User(id, name);

                return Optional.of(user);
            }

            stmt.close();
        } catch (SQLException e) {
            throw new DaoException(e);
        }

        return Optional.empty();
    }

    @Override
    public void update(User data) {
        Connection conn = Database.getInstance().getConnection();

        try {
            String sql = "UPDATE user set name=? WHERE id=?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, data.getName());
            stmt.setInt(2, data.getId());

            stmt.executeUpdate();

            stmt.close();
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }

    @Override
    public void delete(int id) {
        Connection conn = Database.getInstance().getConnection();

        try {
            String sql = "DELETE FROM user WHERE id=?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            stmt.executeUpdate();

            stmt.close();
        } catch (SQLException e) {
            throw new DaoException(e);
        }
    }

    @Override
    public List<User> getAll() {

        List<User> users = new ArrayList<>();
        Connection conn = Database.getInstance().getConnection();

        try {
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM user");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                users.add(new User(id, name));
            }

            stmt.close();
        } catch (SQLException e) {
            throw new DaoException(e);
        }

        return users;
    }

}
