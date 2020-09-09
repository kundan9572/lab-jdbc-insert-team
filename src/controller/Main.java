package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

class Main{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		CityDAO citydao = new CityDAO();
		TeamDAO teamdao = new TeamDAO();
		
		City city ;
		
		Team team ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n 1- Team \n 2- City \n");
		int choice =sc.nextInt();

		switch(choice)
		{
		case 1: System.out.println("Enter Name : ");
				String name=sc.next();
				sc.nextLine();
				System.out.println("Enter coach : ");
				String coach = sc.nextLine();
				System.out.println("Enter city");
				String city1 = sc.nextLine();
				team = new Team(name,coach,city1);
				teamdao.createTeam(team);
				break;
		
		
		case 2: System.out.println("Enter ID : ");
				Long id = sc.nextLong();
				sc.nextLine();
				System.out.println("Enter Name:");
				String name1 =sc.nextLine();
				city = new City(id,name1);
				citydao.getCityByName(city);
				break;
		
		
		default : System.out.println("Invalid choice\n");
		}
	}
}