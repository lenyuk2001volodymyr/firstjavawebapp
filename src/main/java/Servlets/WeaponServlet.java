package Servlets;

import Main.*;
import Person_Char.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class WeaponServlet extends javax.servlet.http.HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Weapon> weapons = new ArrayList<>();

        try
        {
            DBConnection db = new DBConnection();
            weapons.addAll(db.getWeapons());
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

        request.setAttribute("Weapons", weapons);
        request.getRequestDispatcher("weapons.jsp").forward(request, response);
    }
}
