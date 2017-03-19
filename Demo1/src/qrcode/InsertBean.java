package qrcode;

import java.io.IOException;
import java.net.ConnectException;
import java.sql.*;


import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;

public class InsertBean {
	public String fname;
	public String mail;
	public String leaving_from;
	public String going_to;
	public String clas;
	public String adhar;
	public String day;
	public String month;
	public String year;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	String lname;

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	String mob_no;
	public String getMob_no() {
		return mob_no;
	}

	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getLeaving_from() {
		return leaving_from;
	}

	public void setLeaving_from(String leaving_from) {
		this.leaving_from = leaving_from;
	}

	public String getGoing_to() {
		return going_to;
	}

	public void setGoing_to(String going_to) {
		this.going_to = going_to;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getAdhar() {
		return adhar;
	}

	public void setAdhar(String adhar) {
		this.adhar = adhar;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
    public void conn() throws ClassNotFoundException, SQLException, NotFoundException, WriterException, IOException
    {
    	Connection con1=DriveManag.con;
    	String doj=year+"/"+month+"/"+day;
    	String query="INSERT INTO ticket_booking VALUES(?,?,?,?,?,?,?,?,?)";
    	PreparedStatement ps=con1.prepareStatement(query);
    	ps.setString(1,fname);
    	ps.setString(2,lname);
    	ps.setString(3,mob_no);
    	ps.setString(4,mail);
    	ps.setString(5,leaving_from);
    	ps.setString(6,going_to);
    	ps.setString(7,doj);
    	ps.setString(8,clas);
    	ps.setString(9,adhar);
    	int i=ps.executeUpdate();
    	QRCodeBean qr=new QRCodeBean();
    	qr.setQrCodeData(adhar);
    	qr.mapping();

    }

}
