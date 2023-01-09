package com.overone.blok173DAO.dao;

import com.overone.blok173DAO.entity.Phone;
import com.overone.blok24JDBC.lesson169_170.ConnectDataBase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneDao extends AbstractDao<Integer, Phone>{
    public static final  String SQL_SELECT_ALL_PHONE = "SELECT * FROM phones";
    public static final  String SQL_SELECT_PHONE_ID = "SELECT * FROM phones WHERE id = ?";

    public static final  String SQL_DELETE_PHONE_ID = "DELETE FROM phones WHERE id = ?";

    public static final  String SQL_DELETE_PHONE = "DELETE FROM phones WHERE phone = ?";

    public static final String SQL_UPDATE_PHONE = "UPDATE phones SET phone = ? WHERE phone=?";

    public static final String SQL_CREATE_PHONE = "INSERT INTO phones(phone) VALUES (?)";

    @Override
    public List<Phone> findAll() {
        List <Phone> phones = new ArrayList<>();
        try(Connection connection = ConnectDataBase.getDBConnection();
            Statement statement = connection.createStatement()) {
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL_PHONE);

            while (rs.next()){
                int id = rs.getInt(1);
                String phone = rs.getString(2);
                phones.add(new Phone(id, phone));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return phones;
    }

    @Override
    public Phone findEntityById(Integer id) {
        Phone phone = null;
        try(Connection connection = ConnectDataBase.getDBConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_SELECT_PHONE_ID)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            while (rs.next()){

                String number = rs.getString(2);
                phone = new Phone(id, number);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return phone;
    }

    @Override
    public boolean delete(Integer id) {
        boolean result = true;
        try (Connection connection = ConnectDataBase.getDBConnection();
        PreparedStatement statement = connection.prepareStatement(SQL_DELETE_PHONE_ID)){
            statement.setInt(1, id);
            result = statement.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = false;
        }
        return result;
    }

    @Override
    public boolean delete(Phone entity) {
        boolean result = true;
        try (Connection connection = ConnectDataBase.getDBConnection();
            Statement statement = connection.createStatement()){
            statement.executeUpdate(SQL_DELETE_PHONE);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = false;
        }
        return result;
    }

    @Override
    public boolean create(Phone entity) {
        boolean result = true;

        try (Connection connection = ConnectDataBase.getDBConnection();
            PreparedStatement statement = connection.prepareStatement(SQL_CREATE_PHONE)){
            statement.setString(1,entity.getPhone().toString());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            result = false;
        }
        return result;
    }

    @Override
    public void update(Phone entity) {

        try (Connection connection = ConnectDataBase.getDBConnection();
             Statement statement = connection.createStatement()){
            statement.executeUpdate(SQL_UPDATE_PHONE);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
