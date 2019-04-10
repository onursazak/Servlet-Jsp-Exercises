package com.onur.web.dao;

import com.onur.web.model.Gadgets;
import java.sql.*;

public class GadgetsDao 
{
	
	public Gadgets getGadgets(int gid)
	{
		Gadgets g = new Gadgets();
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqldb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","thuglife_bitch31");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select *from gadgets where gid="+ gid);
			if(rs.next())
			{
				g.setGid(rs.getInt("gid"));
				g.setName(rs.getString("gname"));
				g.setGprice(rs.getInt("gprice"));
			}
		} catch (Exception e) 
		{
			System.out.println(e);
		}		
	
	
		return g;

	
	
	
	}

	
	
}
