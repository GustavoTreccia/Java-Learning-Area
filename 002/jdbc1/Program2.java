package jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program2 {
    
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement ps = null;
        try{
            conn = DB.getConnection();
            /*
            ps = conn.prepareStatement("INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, "Janne Five");
            ps.setString(2, "Janee@Five.com");
            ps.setDate(3, new java.sql.Date(sdf.parse("25/08/1995").getTime()));
            //Ou ps.setString(3, "22/04/1995");
            ps.setDouble(4, 3000.00);
            ps.setInt(5, 3);
            */
            ps = conn.prepareStatement("INSERT INTO department (Name) VALUES ('D1'), ('D2')",
                                        Statement.RETURN_GENERATED_KEYS);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0){
                ResultSet rs = ps.getGeneratedKeys();
                while(rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Job done! Id = " + id);
                }
            }else {
                System.out.println("No rows affected");
            }
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        /*
        catch(ParseException p){
            p.printStackTrace();
        }*/
        finally{
            DB.closeStatement(ps);
            DB.closeConnection();
        }
    }
}
