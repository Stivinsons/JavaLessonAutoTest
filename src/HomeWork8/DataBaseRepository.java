package HomeWork8;

import HomeWork8.entity.WeatherFromEveryDay;

import java.sql.*;

public class DataBaseRepository {

    private static final String DB_URL = "jdbc:sqlite:C:\\JavaLessonAutoTest\\src\\HomeWork8\\weather.db";
    Statement statement = null;
    String insertWeatherRequest = "insert into weatherForEveryDay (time_Response, city_Key, weatherFromDay)" +
            "values (?, ?, ?)";
    String getWeatherFromTable = "select * from weatherForEveryDay";

    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void saveWeather(WeatherFromEveryDay weatherForEveryDay) {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            PreparedStatement preparedStatement = connection.prepareStatement(insertWeatherRequest);
            preparedStatement.setString(1, weatherForEveryDay.getTime_Response());
            preparedStatement.setString(2, weatherForEveryDay.getCity_Key());
            preparedStatement.setString(3, weatherForEveryDay.getWeatherForDay());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void getWeather() {
        try (Connection connection = DriverManager.getConnection(DB_URL)) {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getWeatherFromTable);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("weatherFromDay"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
