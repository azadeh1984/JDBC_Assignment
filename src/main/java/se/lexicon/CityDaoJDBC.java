package se.lexicon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
// step1: use try-with-resources
// step2: define a select query by id
// step3: create a db connection
// step4: create a prepared statement
// step5: set id param into the prepared statement
// step6: execute the query
// step7: get data from the result set and set it to city object
// step8: return the city

public class CityDaoJDBC implements CityDao{

    public City findById(int id) {
        String query = "SELECT * FROM city WHERE id = ?";
        City city = new City();

        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
        ) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                city.setId(resultSet.getInt(1));
                city.setName(resultSet.getString(2));
                city.setCountryCode(resultSet.getString(3));
                city.setDistrict(resultSet.getString(4));
                city.setPopulation(resultSet.getInt(5));
            }

        } catch (DBConnectionException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return city;
    }


    public List<City> findByCode(String code) {
        List<City> cities = new ArrayList<>();

        return cities;
    }

    public List<City> findByName(String name) {
        return null;
    }

    public List<City> findAll() {
        return null;
    }

    public City add(City city) {
        return null;
    }

    public City update(City city) {
        return null;
    }

    public int delete(City city) {
        return 0;
    }
}
