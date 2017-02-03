package com.tieto.anuja.dao;

import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.tieto.anuja.bean.Emp;


public class EmpDao {
JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}
public int save(Emp p){
	String n=p.getName();
	String p1=p.getPassword();
	BigInteger b=p.getMobile();
	//int k=update1(p);
	/*if(n=="" ||p1==""||b==null){
		return 2;
	}
	else
	{*/
	    String sql="insert into TcashUser1(Username,Password,Mobile,bonus,Referral) values('"+p.getName()+"',SHA1('"+p.getPassword()+"'),"+p.getMobile()+","+p.getAmount()+",'"+p.getReferral()+"')";
	    return template.update(sql);
	}
public int update(Emp p){
	String sql="update TcashUser1 set Username='"+p.getName()+"', Password=SHA1('"+p.getPassword()+"'), Mobile="+p.getMobile()+" where id="+p.getId()+"";
	return template.update(sql);
}
public int Submit(Emp p)
{
	String n=p.getName();
	String p1=p.getPassword();
	
	if(n=="" ||p1==""){
		return 2;
	}else
	{
	String sql="select * from TcashUser1 where Username='"+p.getName()+"'";
	  template.execute(sql);
	  return 1;
	}
	   
}

public int update1(Emp p)
{
	String i=p.getName();
	String sql2="update TcashUser1 set bonus="+50+" where Referral='"+i+"'";
	return template.update(sql2);
	
}
}

