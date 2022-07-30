package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TTongxunluDAO;
import com.dao.TUserDAO;
import com.model.TTongxunlu;
import com.model.TUser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class tongxunluAction extends ActionSupport
{
	private int id;
	private String name;
	private String sex;
	private String age;
	private String tel;
	
	private String address;
	private String gongsi;
	private String emaiadd;
	
	private String message;
	private String path;
	
	private int userId;
	
	private TTongxunluDAO tongxunluDAO;
	private TUserDAO userDAO;
	
	 
	public String tongxunluAdd(){
		Map request=(Map)ServletActionContext.getContext().get("request");
		String sql="from TUser where userName=?";
		Object[] c={emaiadd};
		List list=userDAO.getHibernateTemplate().find(sql,c);
		if(list.size()==0){
			request.put("msg", "邮箱地址不存在");
			return "msg";
		}
		TTongxunlu tongxunlu=new TTongxunlu();
		tongxunlu.setName(name);
		tongxunlu.setSex(sex);
		tongxunlu.setAge(age);
		tongxunlu.setTel(tel);
		tongxunlu.setAddress(address);
		tongxunlu.setGongsi(gongsi);
		tongxunlu.setEmaiadd(emaiadd);
		tongxunlu.setDel("no");
		tongxunlu.setUserId(userId);
		tongxunluDAO.save(tongxunlu);
		request.put("msg", "添加成功");
		return "msg";
	}
	public String tongxunluDel(){
		TTongxunlu tongxunlu=tongxunluDAO.findById(id);
		tongxunlu.setDel("yes");
		tongxunluDAO.attachDirty(tongxunlu);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "删除成功");
		return "msg";
	}
	public String tongxunluMy(){
		String sql="from TTongxunlu where del='no' and userId="+userId;
		List tongxunluList=tongxunluDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("tongxunluList", tongxunluList);
		return ActionSupport.SUCCESS;
	}
	public String tongxunluSelect()
	{
		String sql="from TTongxunlu where del='no' and userId="+userId;
		List tongxunluList=tongxunluDAO.getHibernateTemplate().find(sql);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("tongxunluList", tongxunluList);
		return ActionSupport.SUCCESS;
	}
	public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getMessage()
	{
		return message;
	}


	public void setMessage(String message)
	{
		this.message = message;
	}


	public String getAddress()
	{
		return address;
	}


	public void setAddress(String address)
	{
		this.address = address;
	}


	public String getAge()
	{
		return age;
	}


	public void setAge(String age)
	{
		this.age = age;
	}


	public String getEmaiadd()
	{
		return emaiadd;
	}


	public void setEmaiadd(String emaiadd)
	{
		this.emaiadd = emaiadd;
	}


	public String getGongsi()
	{
		return gongsi;
	}


	public void setGongsi(String gongsi)
	{
		this.gongsi = gongsi;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public String getSex()
	{
		return sex;
	}


	public void setSex(String sex)
	{
		this.sex = sex;
	}


	public String getTel()
	{
		return tel;
	}


	public void setTel(String tel)
	{
		this.tel = tel;
	}


	public String getPath()
	{
		return path;
	}


	public TUserDAO getUserDAO()
	{
		return userDAO;
	}



	public void setUserDAO(TUserDAO userDAO)
	{
		this.userDAO = userDAO;
	}



	public void setPath(String path)
	{
		this.path = path;
	}


	public TTongxunluDAO getTongxunluDAO()
	{
		return tongxunluDAO;
	}


	public void setTongxunluDAO(TTongxunluDAO tongxunluDAO)
	{
		this.tongxunluDAO = tongxunluDAO;
	}


	public int getUserId()
	{
		return userId;
	}


	public void setUserId(int userId)
	{
		this.userId = userId;
	}
	
	
}
