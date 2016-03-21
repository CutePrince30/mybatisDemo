package org.jeremy.app.mybatisdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.jeremy.app.mybatisdemo.model.Employee;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		InputStream is = null;
		try {
			is = new FileInputStream("J:/eclipse luna j2ee workspace/mybatisDemo/src/main/java/mybatis-config.xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sessionFactory.openSession();
		
		Employee e = session.selectOne("org.jeremy.app.mybatisdemo.dao.CompanyDao.selectEmployeeByID", "1");
		
		System.out.println(e.getId());
	}

}
