package qrcode;

import javax.sql.*;

import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class RetrieveBean {
	public String name;
	public String father_name;
	public String yob;
	public String gender;
	public String address;
	
	public void ret() throws ClassNotFoundException, SQLException, NotFoundException, WriterException, IOException
	{    
		ScanQRCodeBean scanobj=new ScanQRCodeBean();
		scanobj.mapped();
		Connection con1=DriveManag.con;
		String query="SELECT * FROM adhar_detail WHERE adhar_no="+scanobj.getfinalResult();
		Statement st=con1.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{   
			name=rs.getString(1);
			father_name=rs.getString(2);
			yob=rs.getString(3);
			gender=rs.getString(4);
			address=rs.getString(5);
		}
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getYob() {
		return yob;
	}

	public void setYob(String yob) {
		this.yob = yob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}