package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TTongxunlu;

/**
 * Data access object (DAO) for domain model class TTongxunlu.
 * 
 * @see com.model.TTongxunlu
 * @author MyEclipse Persistence Tools
 */

public class TTongxunluDAO extends HibernateDaoSupport
{
	private static final Log log = LogFactory.getLog(TTongxunluDAO.class);

	// property constants
	public static final String NAME = "name";

	public static final String SEX = "sex";

	public static final String AGE = "age";

	public static final String TEL = "tel";

	public static final String ADDRESS = "address";

	public static final String GONGSI = "gongsi";

	public static final String EMAIADD = "emaiadd";

	public static final String DEL = "del";

	public static final String USER_ID = "userId";

	protected void initDao()
	{
		// do nothing
	}

	public void save(TTongxunlu transientInstance)
	{
		log.debug("saving TTongxunlu instance");
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

	public void delete(TTongxunlu persistentInstance)
	{
		log.debug("deleting TTongxunlu instance");
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

	public TTongxunlu findById(java.lang.Integer id)
	{
		log.debug("getting TTongxunlu instance with id: " + id);
		try
		{
			TTongxunlu instance = (TTongxunlu) getHibernateTemplate().get(
					"com.model.TTongxunlu", id);
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TTongxunlu instance)
	{
		log.debug("finding TTongxunlu instance by example");
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
		log.debug("finding TTongxunlu instance with property: " + propertyName
				+ ", value: " + value);
		try
		{
			String queryString = "from TTongxunlu as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re)
		{
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByName(Object name)
	{
		return findByProperty(NAME, name);
	}

	public List findBySex(Object sex)
	{
		return findByProperty(SEX, sex);
	}

	public List findByAge(Object age)
	{
		return findByProperty(AGE, age);
	}

	public List findByTel(Object tel)
	{
		return findByProperty(TEL, tel);
	}

	public List findByAddress(Object address)
	{
		return findByProperty(ADDRESS, address);
	}

	public List findByGongsi(Object gongsi)
	{
		return findByProperty(GONGSI, gongsi);
	}

	public List findByEmaiadd(Object emaiadd)
	{
		return findByProperty(EMAIADD, emaiadd);
	}

	public List findByDel(Object del)
	{
		return findByProperty(DEL, del);
	}

	public List findByUserId(Object userId)
	{
		return findByProperty(USER_ID, userId);
	}

	public List findAll()
	{
		log.debug("finding all TTongxunlu instances");
		try
		{
			String queryString = "from TTongxunlu";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re)
		{
			log.error("find all failed", re);
			throw re;
		}
	}

	public TTongxunlu merge(TTongxunlu detachedInstance)
	{
		log.debug("merging TTongxunlu instance");
		try
		{
			TTongxunlu result = (TTongxunlu) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TTongxunlu instance)
	{
		log.debug("attaching dirty TTongxunlu instance");
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

	public void attachClean(TTongxunlu instance)
	{
		log.debug("attaching clean TTongxunlu instance");
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

	public static TTongxunluDAO getFromApplicationContext(ApplicationContext ctx)
	{
		return (TTongxunluDAO) ctx.getBean("TTongxunluDAO");
	}
}