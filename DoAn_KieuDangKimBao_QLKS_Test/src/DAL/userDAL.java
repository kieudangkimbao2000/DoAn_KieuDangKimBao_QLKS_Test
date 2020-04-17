package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.userDTO;
import UTILS.connectionUTILS;
public class userDAL {
	private connectionUTILS conUTILS;
	private Connection con;
	private PreparedStatement preparedStatement;
	private ResultSet resultset;
	
	public ResultSet getUserByNamePass(userDTO uDTO) {
		ResultSet result=null;
		String sql = "Select * from user where username=? and password=?";
		try {
			conUTILS = new connectionUTILS();
			con=conUTILS.getConnection();
			preparedStatement=con.prepareStatement(sql);
			preparedStatement.setString(1,uDTO.getUsername());
			preparedStatement.setString(2,uDTO.getPassword());
			result = preparedStatement.executeQuery();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				preparedStatement.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return result;
		}
	}
}
