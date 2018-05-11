package user.management.service;

import user.management.entity.User;
import user.management.util.PageBean;

public interface UserService {
	User checkUser(String name,String pwd);
	
	/**
	 * 对角色信息分页
	 * @param uname
	 * @return
	 */
	PageBean userPaging(String uname,int pageNow);
	
	
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
