package com.model;

/**
 * TShoujianxiang generated by MyEclipse Persistence Tools
 */

public class TShoujianxiang implements java.io.Serializable
{

	// Fields

	private Integer id;

	private String title;

	private String content;

	private String fujian;

	private String fujianyuanshiming;

	private String shijian;

	private String fromUserName;

	private String toUserName;

	// Constructors

	/** default constructor */
	public TShoujianxiang()
	{
	}

	/** full constructor */
	public TShoujianxiang(String title, String content, String fujian,
			String fujianyuanshiming, String shijian, String fromUserName,
			String toUserName)
	{
		this.title = title;
		this.content = content;
		this.fujian = fujian;
		this.fujianyuanshiming = fujianyuanshiming;
		this.shijian = shijian;
		this.fromUserName = fromUserName;
		this.toUserName = toUserName;
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

	public String getTitle()
	{
		return this.title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getContent()
	{
		return this.content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getFujian()
	{
		return this.fujian;
	}

	public void setFujian(String fujian)
	{
		this.fujian = fujian;
	}

	public String getFujianyuanshiming()
	{
		return this.fujianyuanshiming;
	}

	public void setFujianyuanshiming(String fujianyuanshiming)
	{
		this.fujianyuanshiming = fujianyuanshiming;
	}

	public String getShijian()
	{
		return this.shijian;
	}

	public void setShijian(String shijian)
	{
		this.shijian = shijian;
	}

	public String getFromUserName()
	{
		return this.fromUserName;
	}

	public void setFromUserName(String fromUserName)
	{
		this.fromUserName = fromUserName;
	}

	public String getToUserName()
	{
		return this.toUserName;
	}

	public void setToUserName(String toUserName)
	{
		this.toUserName = toUserName;
	}

}