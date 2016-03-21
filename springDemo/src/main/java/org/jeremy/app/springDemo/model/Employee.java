package org.jeremy.app.springDemo.model;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author CutePrince
 *
 */
public class Employee implements InitializingBean, BeanPostProcessor {

	protected final Log logger = LogFactory.getLog(getClass());
	
	private Company company;

	private String name;

	public Employee() {
		
		System.out.println(logger.isDebugEnabled());
		
		System.out.println(this.getClass().getSimpleName()
				+ " constructor, name: " + this.name);
	}

	public void init() {
		System.out.println(this.getClass().getSimpleName()
				+ " init-method, name: " + this.name);
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println(this.getClass().getSimpleName()
				+ " InitializingBean afterPropertiesSet(), name: " + this.name);
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println(this.getClass().getSimpleName()
				+ " BeanPostProcessor postProcessBeforeInitialization() bean: "
				+ bean + "beanName: " + beanName);
		return null;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println(this.getClass().getSimpleName()
				+ " BeanPostProcessor postProcessAfterInitialization() bean: "
				+ bean + "beanName: " + beanName);
		return null;
	}
	
}
