package BLL;

import DTO.userDTO;

import java.sql.ResultSet;

import DAL.userDAL;
public class userBLL {
	userDAL uDAL;
	 
	public ResultSet Login(userDTO uDTO) {
		ResultSet result=null;
		if(uDTO.getUsername().equals("")) {
			return result;
		}else if(uDTO.getPassword().equals("")) {
			return result;
		}else {
			uDAL=new userDAL();
			result=uDAL.getUserByNamePass(uDTO);
		}
		return result;
	}
}
