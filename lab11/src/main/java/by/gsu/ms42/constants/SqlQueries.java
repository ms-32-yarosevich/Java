package by.gsu.ms42.constants;

public class SqlQueries {
    public static final String SELECT_ALL_COORDINATES_AND_LENGTHS =  "SELECT x1, y1, x2, y2, x3, y3,\n" +
                                                                "\t   round(sqrt(( pow(x2 - x1, 2)) + (pow(y2 - y1, 2))), 2) as A,\n" +
                                                                "\t   round(sqrt(( pow(x3 - x2, 2)) + (pow(y3 - y2, 2))), 2) as B,\n" +
                                                                "       round(sqrt(( pow(x1 - x3, 2)) + (pow(y1 - y3, 2))), 2) as C\n" +
                                                                " FROM coordinates";
}
