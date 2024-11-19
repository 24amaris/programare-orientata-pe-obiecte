package ro.emanuel.order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ro.emanuel.helper.DBHelper;
import ro.emanuel.order.pojo.OrderPOJO;


public class OrderDAO {

	public static OrderPOJO getById(int id) throws SQLException, ClassNotFoundException {
		 Connection conn = DBHelper.getConnection();
	     String query = "select * from orders where id=?";
	     PreparedStatement ps = conn.prepareStatement(query);
	     ps.setInt(1, id);
	         
	        ResultSet rs = ps.executeQuery();
	        
	        if(rs.next()) {
	        	OrderPOJO order = new OrderPOJO (rs.getInt("id"),
	        			rs.getString("name"),
	        			rs.getInt("price"),
	        			rs.getInt("cod"));
	        	DBHelper.closeConnection();
	        	return order;
	        }
	        
	        DBHelper.closeConnection();
	        return null;
	}
	
	public static ArrayList<OrderPOJO> getAll() throws ClassNotFoundException, SQLException{
        Connection conn=DBHelper.getConnection();
        String query="select * from orders";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        ArrayList<OrderPOJO> orders = new ArrayList<>();
        
        
        while(rs.next()) {
            OrderPOJO order =new OrderPOJO(rs.getInt("id"),
            		rs.getString("name"),
        			rs.getInt("price"),
        			rs.getInt("cod"));
            orders.add(order);
        }
        DBHelper.closeConnection();
        return orders;
    
	}
}
