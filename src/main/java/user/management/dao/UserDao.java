package user.management.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import user.management.entity.User;
import user.management.util.PageBean;

public interface UserDao {
	/**
	 * ��֤��¼
	 * @param name
	 * @param pwd
	 * @return
	 */
	User checkUser(@Param("name")String name,@Param("pwd")String pwd);
	
	/**
	 * �õ��û��б�
	 * @return
	 */
	List<User> getUserList(@Param("uname")String uname,@Param("pageBean")PageBean pageBean);
	
	
	/**
	 * �����û�����ѯ����������
	 * @param uname
	 * @return
	 */
	int getUserCount(@Param("uname")String uname);
	
	/**
	 * ɾ���û�
	 * @param uuid
	 * @return
	 */
	int deleteUserById(int uuid);
	
	
	/**
	 * ��ѯ�û�
	 * @param uuid
	 * @return
	 */
	User getUserById(int uuid);
}
