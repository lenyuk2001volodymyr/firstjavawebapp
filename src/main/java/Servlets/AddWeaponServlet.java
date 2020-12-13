package Servlets;

import Main.*;
import Person_Char.Weapon;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;

public class AddWeaponServlet extends javax.servlet.http.HttpServlet{

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("addWeapon.jsp").forward(httpServletRequest, httpServletResponse);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        try
        {
            String name = request.getParameter("name");
            int damage = Integer.parseInt(request.getParameter("damage"));
            int kickback_chance = Integer.parseInt(request.getParameter("kickback_chance"));
            int defend_chance = Integer.parseInt(request.getParameter("defend_chance"));
            int critical_damage_chance = Integer.parseInt(request.getParameter("critical_damage_chance"));

            Weapon weapon = new Weapon();
            weapon.setName(name);
            weapon.setDamage(damage);
            weapon.setKickback_chance(kickback_chance);
            weapon.setDefend_chance(defend_chance);
            weapon.setCritical_damage_chance(critical_damage_chance);

            DBConnection db = new DBConnection();

            db.insertWeapon(weapon);
        } catch (SQLException | NumberFormatException e) {
            request.setAttribute("error", Arrays.toString(e.getStackTrace()));
            request.getRequestDispatcher("addError.jsp").forward(request, httpServletResponse);
        }
    }
}
