package user.management.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import user.management.entity.User;
import user.management.util.PageBean;

public interface UserDao {
	/**
	 * 验证登录
	 * @param name
	 * @param pwd
	 * @return
	 */
	User checkUser(@Param("name")String name,@Param("pwd")String pwd);
	
	/**
	 * 得到用户列表
	 * @return
	 */
	List<User> getUserList(@Param("uname")String uname,@Param("pageBean")PageBean pageBean);
	
	
	/**
	 * 根据用户名查询总数据行数
	 * @param uname
	 * @return
	 */
	int getUserCount(@Param("uname")String uname);
	
	/**
	 * 删除用户
	 * @param uuid
	 * @return
	 */
	int deleteUserById(int uuid);
	
	
	/**
	 * 查询用户
	 * @param uuid
	 * @return
	 */
	User getUserById(int uuid);
}
