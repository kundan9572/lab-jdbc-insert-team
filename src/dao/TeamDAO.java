package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	
	public  void createTeam(Team team) throws ClassNotFoundException, SQLException, IOException {
		
		String name=team.getName();
		String coach=team.getCoach();
		String city=team.getCity();
		
		ConnectionManager cm = new ConnectionManager();
		
		String sql = "INSERT INTO TEAMNAME(NAME,COACH,CITY) VALUES(?,?,?)";
		
		PreparedStatement st= cm.getConnection().prepareStatement(sql);
		
		st.setString(1, name);
		st.setString(2, coach);
		st.setString(3, city);
		
		st.executeUpdate();
		cm.getConnection().close();
	}
}
