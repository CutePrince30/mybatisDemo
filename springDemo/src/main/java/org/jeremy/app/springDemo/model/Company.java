package org.jeremy.app.springDemo.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author CutePrince
 *
 */
public class Company implements InitializingBean, BeanPostProcessor {

	private String name;

	private String location;

	public Company() {
		System.out.println(this.getClass().getSimpleName()
				+ " constructor, name: " + this.name);
	}

	public void init() {
		System.out.println(this.getClass().getSimpleName()
				+ " init-method, name: " + this.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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
