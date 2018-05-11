package user.management.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import user.management.entity.User;
import user.management.util.PageBean;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml",
	"classpath:spring/spring-service.xml"
})//加载配置文件   
public class UserServiceTest {
	@Autowired
	UserService userService;
	@Test
	public void testCheckUser() {
		User user = userService.checkUser("郭德纲", "123");
		if(user!=null) {
			System.out.println("!=null");
		}else {
			System.out.println("null");
		}
	}
	@Test
	public void testUserPaging() {
		PageBean pageBean = userService.userPaging("郭德纲", 2);
		pageBean.toString();
		List<User> list = pageBean.getDataList();
		for (User user : list) {
			System.out.println(user.toString());
		}
	}
}
