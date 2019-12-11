package by.gsu.ms42;

import by.gsu.ms42.connection.ConnectionManager;
import by.gsu.ms42.model.TriangleEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static by.gsu.ms42.constants.SqlQueries.SELECT_ALL_COORDINATES_AND_LENGTHS;

public class idz11Application {
    public static void main(String[] args) {

        Statement statement;
        ResultSet resultSet;
//        List<Triangle> isoscelesTriangle = new ArrayList<>();
//        List<Triangle> equilateralTriangleList = new ArrayList<>();
//        List<Triangle> rightTriangleList = new ArrayList<>();
        List<TriangleEntity> triangleEntityList = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SELECT_ALL_COORDINATES_AND_LENGTHS);

            while (resultSet.next()) {
                triangleEntityList.add(new TriangleEntity(resultSet.getDouble("A"), resultSet.getDouble("B"), resultSet.getDouble("C")));
            }
            for (TriangleEntity triangleEntity : triangleEntityList) {
                Double A = triangleEntity.getA();
                Double B = triangleEntity.getB();
                Double C = triangleEntity.getC();
                Double hypotenuse = A * A;
                Double sideSquare = B * B + C * C;
                if (A < B + C && B < A + C && C < A + B) {
                    if ((A.equals(B)) || (A.equals(C)) || (B.equals(C))) {
                        System.out.println("Isosceles triangle");
                        System.out.println(triangleEntity);
                    } else if ((A.equals(B)) && (A.equals(C)) && (B.equals(C))) {
                        System.out.println("Equilateral triangle: ");
                        System.out.println(triangleEntity);
                    } else if (hypotenuse.equals(sideSquare)){
                        System.out.println("Right triangle");
                    }
                } else {
                    System.out.println("Not a triangle");
                    System.out.println(triangleEntity);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
