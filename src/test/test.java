package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.gxnu.study.bean.User;
import com.gxnu.study.dao.UserDao;


public class test {
	@Test
	public void testMybatis(){
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream("resource/mybatis-config.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		//获得一个session,ture设置事务自动提交
		SqlSession session = sqlSessionFactory.openSession(true);
		UserDao mapper = session.getMapper(UserDao.class);
		mapper.addUser(new User("叶家欣",20));
		session.delete("com.gxnu.study.dao.UserDao.deleteUserById", 10);
		mapper.selectUser().forEach(System.out::println);
		
		
		
	}
}
