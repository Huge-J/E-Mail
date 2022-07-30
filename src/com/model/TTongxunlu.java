package com.model;

/**
 * TTongxunlu generated by MyEclipse Persistence Tools
 */

public class TTongxunlu implements java.io.Serializable
{

	// Fields

	private Integer id;

	private String name;

	private String sex;

	private String age;

	private String tel;

	private String address;

	private String gongsi;

	private String emaiadd;

	private String del;

	private Integer userId;

	// Constructors

	/** default constructor */
	public TTongxunlu()
	{
	}

	/** full constructor */
	public TTongxunlu(String name, String sex, String age, String tel,
			String address, String gongsi, String emaiadd, String del,
			Integer userId)
	{
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.tel = tel;
		this.address = address;
		this.gongsi = gongsi;
		this.emaiadd = emaiadd;
		this.del = del;
		this.userId = userId;
	}

	// Property accessors

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSex()
	{
		return this.sex;
	}

	public void setSex(String sex)
	{
		this.sex = sex;
	}

	public String getAge()
	{
		return this.age;
	}

	public void setAge(String age)
	{
		this.age = age;
	}

	public String getTel()
	{
		return this.tel;
	}

	public void setTel(String tel)
	{
		this.tel = tel;
	}

	public String getAddress()
	{
		return this.address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public String getGongsi()
	{
		return this.gongsi;
	}

	public void setGongsi(String gongsi)
	{
		this.gongsi = gongsi;
	}

	public String getEmaiadd()
	{
		return this.emaiadd;
	}

	public void setEmaiadd(String emaiadd)
	{
		this.emaiadd = emaiadd;
	}

	public String getDel()
	{
		return this.del;
	}

	public void setDel(String del)
	{
		this.del = del;
	}

	public Integer getUserId()
	{
		return this.userId;
	}

	public void setUserId(Integer userId)
	{
		this.userId = userId;
	}

}