package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TFajianxiang;

/**
 * Data access object (DAO) for domain model class TFajianxiang.
 * 
 * @see com.model.TFajianxiang
 * @author MyEclipse Persistence Tools
 */

public class TFajianxiangDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TFajianxiangDAO.class);

	// property constants
	public static final String TITLE = "title";

	public static final String CONTENT = "content";

	public static final String FUJIAN = "fujian";

	public static final String FUJIANYUANSHIMING = "fujianyuanshiming";

	public static final String SHIJIAN = "shijian";

	public static final String FROM_USER_NAME = "fromUserName";

	public static final String TO_USER_NAME = "toUserName";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TFajianxiang transientInstance)
	{
		log.debug("saving TFajianxiang instance");
		try
		{
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re)
		{
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TFajianxiang persistentInstance)
	{
		log.debug("deleting TFajianxiang instance");
		try
		{
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re)
		{
			log.error("delete failed", re);
			throw re;
		}
	}

	public TFajianxiang findById(java.lang.Integer id)
	{
		log.debug("getting TFajianxiang instance with id: " + id);
		try
		{
			TFajianxiang instance = (TFajianxiang) getHibernateTemplate().get(
					"com.model.TFajianxiang", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TFajianxiang instance)
	{
		log.debug("finding TFajianxiang instance by example");
		try
		{
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value)
	{
		log.debug("finding TFajianxiang instance with property: "
				+ propertyName + ", value: " + value);
		try
		{
			String queryString = "from TFajianxiang as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title)
	{
		return findByProperty(TITLE, title);
	}

	public List findByContent(Object content)
	{
		return findByProperty(CONTENT, content);
	}

	public List findByFujian(Object fujian)
	{
		return findByProperty(FUJIAN, fujian);
	}

	public List findByFujianyuanshiming(Object fujianyuanshiming)
	{
		return findByProperty(FUJIANYUANSHIMING, fujianyuanshiming);
	}

	public List findByShijian(Object shijian)
	{
		return findByProperty(SHIJIAN, shijian);
	}

	public List findByFromUserName(Object fromUserName)
	{
		return findByProperty(FROM_USER_NAME, fromUserName);
	}

	public List findByToUserName(Object toUserName)
	{
		return findByProperty(TO_USER_NAME, toUserName);
	}

	public List findAll()
	{
		log.debug("finding all TFajianxiang instances");
		try
		{
			String queryString = "from TFajianxiang";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TFajianxiang merge(TFajianxiang detachedInstance)
	{
		log.debug("merging TFajianxiang instance");
		try
		{
			TFajianxiang result = (TFajianxiang) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TFajianxiang instance)
	{
		log.debug("attaching dirty TFajianxiang instance");
		try
		{
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TFajianxiang instance)
	{
		log.debug("attaching clean TFajianxiang instance");
		try
		{
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TFajianxiangDAO getFromApplicationContext(
			ApplicationContext ctx)
	{
		return (TFajianxiangDAO) ctx.getBean("TFajianxiangDAO");
	}
}