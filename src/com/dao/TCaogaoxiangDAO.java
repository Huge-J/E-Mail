package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TCaogaoxiang;

/**
 * Data access object (DAO) for domain model class TCaogaoxiang.
 * 
 * @see com.model.TCaogaoxiang
 * @author MyEclipse Persistence Tools
 */

public class TCaogaoxiangDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TCaogaoxiangDAO.class);

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

	public void save(TCaogaoxiang transientInstance)
	{
		log.debug("saving TCaogaoxiang instance");
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

	public void delete(TCaogaoxiang persistentInstance)
	{
		log.debug("deleting TCaogaoxiang instance");
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

	public TCaogaoxiang findById(java.lang.Integer id)
	{
		log.debug("getting TCaogaoxiang instance with id: " + id);
		try
		{
			TCaogaoxiang instance = (TCaogaoxiang) getHibernateTemplate().get(
					"com.model.TCaogaoxiang", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TCaogaoxiang instance)
	{
		log.debug("finding TCaogaoxiang instance by example");
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
		log.debug("finding TCaogaoxiang instance with property: "
				+ propertyName + ", value: " + value);
		try
		{
			String queryString = "from TCaogaoxiang as model where model."
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
		log.debug("finding all TCaogaoxiang instances");
		try
		{
			String queryString = "from TCaogaoxiang";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TCaogaoxiang merge(TCaogaoxiang detachedInstance)
	{
		log.debug("merging TCaogaoxiang instance");
		try
		{
			TCaogaoxiang result = (TCaogaoxiang) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TCaogaoxiang instance)
	{
		log.debug("attaching dirty TCaogaoxiang instance");
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

	public void attachClean(TCaogaoxiang instance)
	{
		log.debug("attaching clean TCaogaoxiang instance");
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

	public static TCaogaoxiangDAO getFromApplicationContext(
			ApplicationContext ctx)
	{
		return (TCaogaoxiangDAO) ctx.getBean("TCaogaoxiangDAO");
	}
}