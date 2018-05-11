package user.management.service;

import user.management.entity.User;
import user.management.util.PageBean;

public interface UserService {
	User checkUser(String name,String pwd);
	
	/**
	 * �Խ�ɫ��Ϣ��ҳ
	 * @param uname
	 * @return
	 */
	PageBean userPaging(String uname,int pageNow);
	
	
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
