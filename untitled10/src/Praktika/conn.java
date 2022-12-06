package Praktika;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class conn {
    public static Connection conn;
    public static Statement statmt;
    public static ResultSet resSet;

    // --------ПОДКЛЮЧЕНИЕ К БАЗЕ ДАННЫХ--------
    public static void Conn() throws ClassNotFoundException, SQLException
    {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:Universities.db");

        System.out.println("База Подключена!");
    }

    public static void WriteDB() throws SQLException
    {
        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Petya', 125453); ");
        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Vasya', 321789); ");
        statmt.execute("INSERT INTO 'users' ('name', 'phone') VALUES ('Masha', 456123); ");

        System.out.println("Таблица заполнена");
    }

    // -------- Вывод таблицы--------
    public static void ReadDB() throws ClassNotFoundException, SQLException
    {
        resSet = statmt.executeQuery("SELECT * FROM ВУЗы");

        while(resSet.next())
        {
            int id = resSet.getInt("ID_ВУЗа");
            String  name = resSet.getString("Название");
            String  adress = resSet.getString("Адрес");
            int pass_score = resSet.getInt("Проходной_балл");
            int num_of_places = resSet.getInt("Количество_мест");
            System.out.println( "ID = " + id );
            System.out.println( "name = " + name );
            System.out.println( "adress = " + adress );
            System.out.println( "pass_score = " + pass_score);
            System.out.println( "num_of_places = " + num_of_places );
            System.out.println();
        }
    }

    // --------Закрытие--------
    public static void CloseDB() throws ClassNotFoundException, SQLException
    {
        conn.close();
        statmt.close();
        resSet.close();

        System.out.println("Соединения закрыты");
    }

}
