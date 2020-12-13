package Main;

import Person_Char.Weapon;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.TimeZone;

public class DBConnection {

    private static final String URL = "jdbc:mysql://127.0.0.1/game?serverTimezone=" + TimeZone.getDefault().getID();
    private static final String USER = "root";
    private static final String PASSWORD = "Lenyuk1999oo";

    private Connection connection;

    public DBConnection() throws SQLException
    {
        Properties properties = new Properties();
        properties.setProperty("user", USER);
        properties.setProperty("password", PASSWORD);
        properties.setProperty("useSSL", "false");
        properties.setProperty("autoReconnect", "true");
        connection = DriverManager.getConnection( URL, properties );
    }

    public ArrayList<Weapon> getWeapons() throws SQLException
    {
        ArrayList<Weapon> weapons = new ArrayList<>();

        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery("SELECT * FROM `weapon`");

        while(set.next())
        {
            String name = set.getString("wname");
            int damage = set.getInt("wdamege");
            int kickback_chance = set.getInt("wkickback_chance");
            int defend_chance = set.getInt("wdefend_chance");
            int critical_damage_chance = set.getInt("wcritical_damage_chance");

            Weapon weapon = new Weapon();
            weapon.setName(name);
            weapon.setDamage(damage);
            weapon.setKickback_chance(kickback_chance);
            weapon.setDefend_chance(defend_chance);
            weapon.setCritical_damage_chance(critical_damage_chance);

            weapons.add(weapon);

            //System.out.println(idframe + " " + weight + " " + producer + " " + release);
        }

        return weapons;
    }

    public void insertWeapon(Weapon weapon) throws SQLException
    {
        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery("SELECT * FROM `weapon`");
        int idweapon = 0;
        while(set.next())
        {
            ++idweapon;
        }
        ++idweapon;
        String sql = "INSERT INTO `game`.`weapon` (`idweapon`, `wname`, `wdamege`, `wkickback_chance`, `wdefend_chance`,`wcritical_damage_chance`) VALUES ('"+idweapon+"', '"+weapon.getName()+"', '"+weapon.getDamage()+"', '"+weapon.getKickback_chance()+"', '"+weapon.getDefend_chance()+"', '"+weapon.getCritical_damage_chance()+"')";
        statement.executeUpdate(sql);
    }

    public void updateWeapon(Weapon weapon) throws SQLException
    {
        Statement statement = connection.createStatement();
        ResultSet set = statement.executeQuery("SELECT * FROM `weapon`");
        int idweapon = 0;
        while(set.next()) {
            String name1 = set.getString("wname");
            if (weapon.getName().equals(name1)) {
                break;
            }
            ++idweapon;
        }
        String sql = "UPDATE INTO `game`.`weapon` (`idweapon`, `wname`, `wdamege`, `wkickback_chance`, `wdefend_chance`,`wcritical_damage_chance`) VALUES ('"+idweapon+"', '"+weapon.getName()+"', '"+weapon.getDamage()+"', '"+weapon.getKickback_chance()+"', '"+weapon.getDefend_chance()+"', '"+weapon.getCritical_damage_chance()+"')";
        statement.executeUpdate(sql);
    }

    public void clearWeapons() throws SQLException
    {
        Statement statement = connection.createStatement();
        statement.executeUpdate("truncate table weapon");
    }

    public static void main(String[] args) {
        try
        {
            DBConnection db = new DBConnection();
            Weapon weapon1 = new Weapon("Weapon 1", 35, 20, 20, 15);
            Weapon weapon2 = new Weapon("Weapon 2", 50, 15, 30, 10);

            db.clearWeapons();

            db.insertWeapon(weapon1);
            db.insertWeapon(weapon2);

            System.out.println(db.getWeapons());

            //System.out.println(set.getString(0));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
