package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.City;
import utility.ConnectionManager;

public class CityDAO {
	
	public void getCityByName(City city) throws ClassNotFoundException, SQLException, IOException {

		Long id=city.getCityId();
		String name=city.getCityName();
		
		ConnectionManager cm = new ConnectionManager();
		
		String sql = "INSERT INTO CITYNAME (ID,NAME)VALUES(?,?)";
		
		PreparedStatement st= cm.getConnection().prepareStatement(sql);
		
		st.setLong(1, id);
		st.setString(2, name);
		
		st.executeUpdate();
		cm.getConnection().close();

	}
}
