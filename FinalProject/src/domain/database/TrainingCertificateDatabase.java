package domain.database;

import models.TrainingCertificate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TrainingCertificateDatabase extends BaseDatabase<models.TrainingCertificate> {

    public TrainingCertificateDatabase() {
    }

    @Override
    public void add(models.TrainingCertificate item) throws SQLException {

    }

    @Override
    public void update(models.TrainingCertificate item) throws SQLException {

    }

    @Override
    public void delete(int id) throws SQLException {

    }

    @Override
    public models.TrainingCertificate getById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<TrainingCertificate> getAll() throws SQLException {
        Connection connection = getConnection();

        ResultSet resultSet = connection.createStatement().executeQuery("Select * from TrainingCertificate");

        ArrayList<TrainingCertificate> trainingCertificates = new ArrayList<>();

        while (resultSet.next()) {

            models.TrainingCertificate trainingCertificate = new models.TrainingCertificate(
                    resultSet.getInt("Id"),
                    resultSet.getString("name"),
                    resultSet.getInt("trainingModuleId"),
                    resultSet.getInt("perosonId")

            );

            trainingCertificates.add(trainingCertificate);

        }

        return trainingCertificates;
    }
}
