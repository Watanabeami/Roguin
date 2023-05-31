package jp.co.aforce.dao2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Bean;
import jp.co.aforce.dao.Dao;

public class Dao2 extends Dao{
	public Bean getUser(String id, String password) throws Exception {
		Connection con = getConnection();
		
		PreparedStatement st = con.prepareStatement(
				"select * from User where id = ? and password = ?"
			);
		st.setString(1, id);
		st.setString(2, password);
		
		ResultSet rs = st.executeQuery();
		
		Bean user = null;
		if(rs.next()) {
			user = new Bean();
			user.setId(rs.getString("id"));
			user.setPassword(rs.getString("password"));
		}
		
		st.close();
		con.close();
		
		return user;
	}
	
	public int createUser(String id, String password) throws Exception {
        Connection con = getConnection();
		
		PreparedStatement st = con.prepareStatement(
				"insert into user values (?, ?)"
			);
		st.setString(1, id);
		st.setString(2, password);
		int line = st.executeUpdate();
		
		st.close();
		con.close();
		
		return line;
	}

	
	
		

	

}
