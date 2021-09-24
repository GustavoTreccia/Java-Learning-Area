package jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import db.DB;
import db.DbException;

public class Program {
    
    public static void main(String[] args){
        Connection conn = null;
        Statement st = null;
        Resultset rs = null;
        try{
            conn = DB.getConnection();
            st = conn.createStatement();
            rs = (Resultset) st.executeQuery("SELECT * FROM department");

            while (((ResultSet) rs).next()){
                System.out.println(((ResultSet) rs).getInt("Id") + ", " + ((ResultSet) rs).getString("Name"));
            }
        }
        catch (SQLException e){
            throw new DbException(e.getMessage());
        }finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
            DB.closeConnection();
            
        }
    }
}
