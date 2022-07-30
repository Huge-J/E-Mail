package com.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.dao.TCaogaoxiangDAO;
import com.dao.TFajianxiangDAO;
import com.dao.TLajixiangDAO;
import com.dao.TShoujianxiangDAO;
import com.dao.TUserDAO;
import com.model.TCaogaoxiang;
import com.model.TFajianxiang;
import com.model.TLajixiang;
import com.model.TShoujianxiang;
import com.model.TUser;
import com.opensymphony.xwork2.ActionSupport;
import com.util.youjianguolv;

public class emailAction extends ActionSupport
{
	private TFajianxiangDAO fajianxiangDAO;
	private TShoujianxiangDAO shoujianxiangDAO;
	private TCaogaoxiangDAO caogaoxiangDAO;
	private TLajixiangDAO lajixiangDAO;
	private TUserDAO userDAO;
	
	private int id;
	private String toUserName;
	private String fromUserName;
	private String title;
	private String content;
	private String fujian;
	private String fujianyuanshiming;
	
	private String message;
	private String path;
	
	
	public String emailAdd(){
		Map session= ServletActionContext.getContext().getSession();
		TUser user=(TUser)session.get("user");
		for(int i=0;i<youjianguolv.fandong().size();i++){
			if(title.indexOf(youjianguolv.fandong().get(i).toString()) != -1){//�ж��Ƿ����
				this.setMessage("���зǷ��ַ�");
				this.setPath("auser/email/emailAdd.jsp");
				return "succeed";
			}
		} 
		String sql="from TUser where userName=?";
		Object[] c={toUserName};
		List list=userDAO.getHibernateTemplate().find(sql,c);
		if(list.size()==0){
			this.setMessage("�ռ��˲����ڡ���������д");
			this.setPath("auser/email/emailAdd.jsp");
			return "succeed";
		}
		else{
			TFajianxiang fajianxiang=new TFajianxiang();
			fajianxiang.setToUserName(toUserName);
			fajianxiang.setFromUserName(user.getUserName());
			fajianxiang.setTitle(title);
			fajianxiang.setContent(content);
			fajianxiang.setShijian(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
			fajianxiang.setFujian(fujian);
			fajianxiang.setFujianyuanshiming(fujianyuanshiming);
			fajianxiangDAO.save(fajianxiang);
			if(title.indexOf("���") != -1){//�ǹ���ʼ����ŵ�������
				TLajixiang lajixiang=new TLajixiang();
				lajixiang.setToUserName(toUserName);
				lajixiang.setFromUserName(user.getUserName());
				lajixiang.setTitle(title);
				lajixiang.setContent(content);	
				lajixiang.setShijian(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
				lajixiang.setFujian(fujian);
				lajixiang.setFujianyuanshiming(fujianyuanshiming);
				lajixiangDAO.save(lajixiang);
			}
			if(title.indexOf("���") == -1){//���ǹ���ʼ����ŵ��ռ���
				TShoujianxiang shoujianxiang=new TShoujianxiang();
				shoujianxiang.setToUserName(toUserName);
				shoujianxiang.setFromUserName(user.getUserName());
				shoujianxiang.setTitle(title);
				shoujianxiang.setContent(content);
				shoujianxiang.setShijian(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
				shoujianxiang.setFujian(fujian);
				shoujianxiang.setFujianyuanshiming(fujianyuanshiming);
				shoujianxiangDAO.save(shoujianxiang);
			}
			this.setMessage("�����ɹ�");
			this.setPath("auser/email/emailAdd.jsp");
			return "succeed";
		}
	}
	public String emailAdd_caogaoxiang(){
		Map session= ServletActionContext.getContext().getSession();
		TUser user=(TUser)session.get("user");
		for(int i=0;i<youjianguolv.fandong().size();i++){
			if(title.indexOf(youjianguolv.fandong().get(i).toString()) != -1){//�ж��Ƿ����
				this.setMessage("���зǷ��ַ�");
				this.setPath("auser/email/emailAdd.jsp");
				return "succeed";
			}
		}
		String sql="from TUser where userName=?";
		Object[] c={toUserName};
		List list=userDAO.getHibernateTemplate().find(sql,c);
		if(list.size()==0){
			this.setMessage("�ռ��˲����ڡ���������д");
			this.setPath("auser/email/emailAdd.jsp");
			return "succeed";
		}
		else{
			TCaogaoxiang caogaoxiang=new TCaogaoxiang();
			caogaoxiang.setToUserName(toUserName);
			caogaoxiang.setFromUserName(user.getUserName());
			caogaoxiang.setTitle(title);
			caogaoxiang.setContent(content);
			caogaoxiang.setShijian(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
			caogaoxiang.setFujian(fujian);
			caogaoxiang.setFujianyuanshiming(fujianyuanshiming);
			caogaoxiangDAO.save(caogaoxiang);
			this.setMessage("�����ɹ�");
			this.setPath("auser/email/emailAdd.jsp");
			return "succeed";
		}
	}
	public String fajianxiang_me(){//������
		Map session= ServletActionContext.getContext().getSession();
		TUser user=(TUser)session.get("user");
		String sql="from TFajianxiang where fromUserName=? order by id desc";
		Object[] c={user.getUserName()};
		List fajianxiangList=fajianxiangDAO.getHibernateTemplate().find(sql,c);	
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("fajianxiangList", fajianxiangList);
		return ActionSupport.SUCCESS;
	}
	public String fajianxiang_me_search(){//������
		HttpServletRequest req=ServletActionContext.getRequest();
		String shijian1=req.getParameter("shijian1");
		String shijian2=req.getParameter("shijian2");
		Map session= ServletActionContext.getContext().getSession();
		TUser user=(TUser)session.get("user");
		StringBuffer sql=new StringBuffer("from TFajianxiang where fromUserName='"+user.getUserName()+"'");
		sql.append(" and toUserName like '%"+toUserName+"%'");
		sql.append(" and title like '%"+title+"%'");
		if(shijian1!=""){
			sql.append(" and shijian>'"+shijian1+"'");
		}
		if(shijian2!=""){
			sql.append(" and shijian<'"+shijian2+"'");
		}
		System.out.println(sql.toString()+"^^^^^^");
		Object[] c={};
		List fajianxiangList=fajianxiangDAO.getHibernateTemplate().find(sql.toString(),c);	
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("fajianxiangList", fajianxiangList);
		return ActionSupport.SUCCESS;
	}
	public String fajianxiangDetail_me(){//������
		TFajianxiang fajianxiang=fajianxiangDAO.findById(id);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("fajianxiang", fajianxiang);
		return ActionSupport.SUCCESS;
	}
	public String fajianxiangDel_me(){
		TFajianxiang fajianxiang=fajianxiangDAO.findById(id);
		fajianxiangDAO.delete(fajianxiang);	
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "�����ɹ�");
		return "msg";
	}
	public String shoujianxiang_me(){//�ռ���
		Map session= ServletActionContext.getContext().getSession();
		TUser user=(TUser)session.get("user");
		
		String sql="from TShoujianxiang where toUserName=? order by id desc";
		Object[] c={user.getUserName()};
		List shoujianxiangList=shoujianxiangDAO.getHibernateTemplate().find(sql,c);	
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("shoujianxiangList", shoujianxiangList);
		return ActionSupport.SUCCESS;
	}
	public String shoujianxiang_me_search(){//�ռ���
		HttpServletRequest req=ServletActionContext.getRequest();
		String shijian1=req.getParameter("shijian1");
		String shijian2=req.getParameter("shijian2");
		Map session= ServletActionContext.getContext().getSession();
		TUser user=(TUser)session.get("user");
		StringBuffer sql=new StringBuffer("from TShoujianxiang where toUserName='"+user.getUserName()+"'");
		sql.append(" and fromUserName like '%"+fromUserName+"%'");
		sql.append(" and title like '%"+title+"%'");
		if(shijian1!=""){
			sql.append(" and shijian>'"+shijian1+"'");
		}
		if(shijian2!=""){
			sql.append(" and shijian<'"+shijian2+"'");
		}
		System.out.println(sql.toString()+"^^^^^^");
		Object[] c={};
		List shoujianxiangList=shoujianxiangDAO.getHibernateTemplate().find(sql.toString(),c);	
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("shoujianxiangList", shoujianxiangList);
		return ActionSupport.SUCCESS;
	}
	public String shoujianxiangDetail_me(){//������
		TShoujianxiang shoujianxiang=shoujianxiangDAO.findById(id);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("shoujianxiang", shoujianxiang);
		return ActionSupport.SUCCESS;
	}
	public String shoujianxiangDel_me(){
		TShoujianxiang shoujianxiang=shoujianxiangDAO.findById(id);
		shoujianxiangDAO.delete(shoujianxiang);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "�����ɹ�");
		return "msg";
	}
	public String caogaoxiang_me(){
		Map session= ServletActionContext.getContext().getSession();
		TUser user=(TUser)session.get("user");
		String sql="from TCaogaoxiang where fromUserName=? order by id desc";
		Object[] c={user.getUserName()};
		List caogaoxiangList=caogaoxiangDAO.getHibernateTemplate().find(sql,c);	
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("caogaoxiangList", caogaoxiangList);
		return ActionSupport.SUCCESS;
	}
	public String caogaoxiangDel_me(){
		TCaogaoxiang caogaoxiang=caogaoxiangDAO.findById(id);
		caogaoxiangDAO.delete(caogaoxiang);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "�����ɹ�");
		return "msg";
	}
	public String caogaoxiangFasong_me(){
		TCaogaoxiang caogaoxiang=caogaoxiangDAO.findById(id);
		TFajianxiang fajianxiang=new TFajianxiang();
		fajianxiang.setToUserName(caogaoxiang.getToUserName());
		fajianxiang.setFromUserName(caogaoxiang.getFromUserName());
		fajianxiang.setTitle(caogaoxiang.getTitle());
		fajianxiang.setContent(caogaoxiang.getContent());
		fajianxiang.setShijian(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
		fajianxiang.setFujian(caogaoxiang.getFujian());
		fajianxiang.setFujianyuanshiming(caogaoxiang.getFujianyuanshiming());
		fajianxiangDAO.save(fajianxiang);
		TShoujianxiang shoujianxiang=new TShoujianxiang();
		shoujianxiang.setToUserName(caogaoxiang.getToUserName());
		shoujianxiang.setFromUserName(caogaoxiang.getFromUserName());
		shoujianxiang.setTitle(caogaoxiang.getTitle());
		shoujianxiang.setContent(caogaoxiang.getContent());
		shoujianxiang.setShijian(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
		shoujianxiang.setFujian(caogaoxiang.getFujian());
		shoujianxiang.setFujianyuanshiming(caogaoxiang.getFujianyuanshiming());
		shoujianxiangDAO.save(shoujianxiang);
		caogaoxiangDAO.delete(caogaoxiang);
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "�����ɹ�");
		return "msg";
	}
	public String lajixiang_me(){
		Map session= ServletActionContext.getContext().getSession();
		TUser user=(TUser)session.get("user");
		String sql="from TLajixiang where toUserName=? order by id desc";
		Object[] c={user.getUserName()};
		List lajixiangList=lajixiangDAO.getHibernateTemplate().find(sql,c);	
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("lajixiangList", lajixiangList);
		return ActionSupport.SUCCESS;
	}
	public String lajixiangDel_me(){
		TLajixiang lajixiang=lajixiangDAO.findById(id);
		lajixiangDAO.delete(lajixiang);
		
		Map request=(Map)ServletActionContext.getContext().get("request");
		request.put("msg", "�����ɹ�");
		return "msg";
	}
	public String emailAddQun(){//�����ж��ռ����Ƿ���ڣ�ӦΪ�϶�����
		Map session= ServletActionContext.getContext().getSession();
		TUser user=(TUser)session.get("user");
		for(int i=0;i<youjianguolv.fandong().size();i++){
			if(title.indexOf(youjianguolv.fandong().get(i).toString()) != -1){//�ж��Ƿ����
				this.setMessage("���зǷ��ַ�");
				this.setPath("auser/tongxunlu/emailAddQun.jsp");
				return "succeed";
			}
		}
	    String[] a= toUserName.split(",");
	    for(int i=0;i<a.length;i++){
            TFajianxiang fajianxiang=new TFajianxiang();
			fajianxiang.setToUserName(a[i]);
			fajianxiang.setFromUserName(user.getUserName());
			fajianxiang.setTitle(title);
			fajianxiang.setContent(content);
			fajianxiang.setShijian(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
			fajianxiang.setFujian(fujian);
			fajianxiang.setFujianyuanshiming(fujianyuanshiming);
			fajianxiangDAO.save(fajianxiang);
			if(title.indexOf("���") != -1){//�ǹ���ʼ����ŵ�������
				TLajixiang lajixiang=new TLajixiang();
				lajixiang.setToUserName(a[i]);
				lajixiang.setFromUserName(user.getUserName());
				lajixiang.setTitle(title);
				lajixiang.setContent(content);
				lajixiang.setShijian(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
				lajixiang.setFujian(fujian);
				lajixiang.setFujianyuanshiming(fujianyuanshiming);
				lajixiangDAO.save(lajixiang);
			}
			if(title.indexOf("���") == -1){//���ǹ���ʼ����ŵ��ռ���
				TShoujianxiang shoujianxiang=new TShoujianxiang();
				shoujianxiang.setToUserName(a[i]);
				shoujianxiang.setFromUserName(user.getUserName());
				shoujianxiang.setTitle(title);
				shoujianxiang.setContent(content);
				shoujianxiang.setShijian(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
				shoujianxiang.setFujian(fujian);
				shoujianxiang.setFujianyuanshiming(fujianyuanshiming);
				shoujianxiangDAO.save(shoujianxiang);
			}
	    }
	    this.setMessage("�����ɹ�");
	    this.setPath("auser/tongxunlu/emailAddQun.jsp");
		return "succeed";
	}
	public String emailAddByAdmin(){
		for(int i=0;i<youjianguolv.fandong().size();i++){
			if(title.indexOf(youjianguolv.fandong().get(i).toString()) != -1){//�ж��Ƿ����
				this.setMessage("���зǷ��ַ�");
				this.setPath("admin/email/emailAdd.jsp");
				return "succeed";
			}
		} 
		String sql="from TUser where userName=?";
		Object[] c={toUserName};
		List list=userDAO.getHibernateTemplate().find(sql,c);
		if(list.size()==0){
			this.setMessage("�ռ��˲����ڡ���������д");
			this.setPath("admin/email/emailAdd.jsp");
			return "succeed";
		}
		else{
			TFajianxiang fajianxiang=new TFajianxiang();
			fajianxiang.setToUserName(toUserName);
			fajianxiang.setFromUserName("ϵͳ����Ա");
			fajianxiang.setTitle(title);
			fajianxiang.setContent(content);
			fajianxiang.setShijian(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
			fajianxiang.setFujian(fujian);
			fajianxiang.setFujianyuanshiming(fujianyuanshiming);
			fajianxiangDAO.save(fajianxiang);
			if(title.indexOf("���") != -1){//�ǹ���ʼ����ŵ�������
				TLajixiang lajixiang=new TLajixiang();
				lajixiang.setToUserName(toUserName);
				lajixiang.setFromUserName("ϵͳ����Ա");
				lajixiang.setTitle(title);
				lajixiang.setContent(content);
				lajixiang.setShijian(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
				lajixiang.setFujian(fujian);
				lajixiang.setFujianyuanshiming(fujianyuanshiming);
				lajixiangDAO.save(lajixiang);
			}
			if(title.indexOf("���") == -1){//���ǹ���ʼ����ŵ��ռ���
				TShoujianxiang shoujianxiang=new TShoujianxiang();
				shoujianxiang.setToUserName(toUserName);
				shoujianxiang.setFromUserName("ϵͳ����Ա");
				shoujianxiang.setTitle(title);
				shoujianxiang.setContent(content);
				shoujianxiang.setShijian(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
				shoujianxiang.setFujian(fujian);
				shoujianxiang.setFujianyuanshiming(fujianyuanshiming);
				shoujianxiangDAO.save(shoujianxiang);
			}
			this.setMessage("�����ɹ�");
			this.setPath("admin/email/emailAdd.jsp");
			return "succeed";
		}
	}
	public TCaogaoxiangDAO getCaogaoxiangDAO()
	{
		return caogaoxiangDAO;
	}
	
	public TUserDAO getUserDAO()
	{
		return userDAO;
	}

	public void setUserDAO(TUserDAO userDAO)
	{
		this.userDAO = userDAO;
	}

	public void setCaogaoxiangDAO(TCaogaoxiangDAO caogaoxiangDAO)
	{
		this.caogaoxiangDAO = caogaoxiangDAO;
	}
	public TFajianxiangDAO getFajianxiangDAO()
	{
		return fajianxiangDAO;
	}
	public void setFajianxiangDAO(TFajianxiangDAO fajianxiangDAO)
	{
		this.fajianxiangDAO = fajianxiangDAO;
	}
	public TLajixiangDAO getLajixiangDAO()
	{
		return lajixiangDAO;
	}
	public void setLajixiangDAO(TLajixiangDAO lajixiangDAO)
	{
		this.lajixiangDAO = lajixiangDAO;
	}
	public TShoujianxiangDAO getShoujianxiangDAO()
	{
		return shoujianxiangDAO;
	}
	public void setShoujianxiangDAO(TShoujianxiangDAO shoujianxiangDAO)
	{
		this.shoujianxiangDAO = shoujianxiangDAO;
	}
	public String getFromUserName()
	{
		return fromUserName;
	}
	public void setFromUserName(String fromUserName)
	{
		this.fromUserName = fromUserName;
	}
	public String getFujian()
	{
		return fujian;
	}
	public void setFujian(String fujian)
	{
		this.fujian = fujian;
	}
	public String getFujianyuanshiming()
	{
		return fujianyuanshiming;
	}
	public void setFujianyuanshiming(String fujianyuanshiming)
	{
		this.fujianyuanshiming = fujianyuanshiming;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message = message;
	}
	public String getPath()
	{
		return path;
	}
	public void setPath(String path)
	{
		this.path = path;
	}
	public String getToUserName()
	{
		return toUserName;
	}
	public void setToUserName(String toUserName)
	{
		this.toUserName = toUserName;
	}
	

}
