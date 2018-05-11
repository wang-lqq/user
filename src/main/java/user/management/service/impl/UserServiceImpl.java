package user.management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.management.dao.UserDao;
import user.management.entity.User;
import user.management.service.UserService;
import user.management.util.PageBean;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	
	@Autowired
	PageBean pageBean;
	
	public User checkUser(String name, String pwd) {
		return userDao.checkUser(name, pwd);
	}
	
	//��ҳ����
	public PageBean userPaging(String uname,int pageNow) {
		//���¸� 2
		int userCount = userDao.getUserCount(uname);
		//����������,�ڸ���pageSize�õ���ҳ��
		pageBean.setRowCount(userCount);
		//���õ�ǰҳ,����pageSize�ɵõ�start end����ҳ
		pageBean.setPageNow(pageNow);
		
		List<User> userList = userDao.getUserList(uname, pageBean);
		pageBean.setDataList(userList);
		return pageBean;
	}

	public int deleteUserById(int uuid) {
		return userDao.deleteUserById(uuid);
	}

	public User getUserById(int uuid) {
		return userDao.getUserById(uuid);
	}
}
