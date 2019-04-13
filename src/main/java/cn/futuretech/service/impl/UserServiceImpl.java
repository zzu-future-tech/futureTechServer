package cn.futuretech.service.impl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.futuretech.domain.User;
import cn.futuretech.mapper.UserMapper;
import cn.futuretech.service.UserService;
import cn.futuretech.utils.MailUtil;

/**
 * 用户服务层
 * 
 * @author 赵祝德
 *
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper usermapper;

	/**
	 * 插入用户
	 */
	@Override
	public int insertUser(User user) throws Exception {
		Date date = new Date();
		Timestamp timeStamep = new Timestamp(date.getTime());
		StringBuffer stringBuffer = new StringBuffer("");

		Random ra = new Random();
		for (int i = 0; i < 4; i++)
			stringBuffer.append((ra.nextInt(100) + 1) % 10);

		user.setEmail(user.getUserid());
		user.setGmtModified(date);
		user.setGmtCreate(date);
		user.setCheckNum(stringBuffer.toString());

		new Thread(new MailUtil(user.getEmail(), user.getCheckNum())).start();
		return usermapper.registerByUseridAndPassword(user);
	}

	/**
	 * 根据用户id查找用户
	 */
	@Override
	public User findUserByUserid(String userid) throws Exception {
		
		return usermapper.findUserByUserid(userid);
	}

	/**
	 * 根据用户id删除用户
	 */
	@Override
	public int deleteUserById(String userid) throws Exception {

		return usermapper.deleteUserById(userid);
	}

	/**
	 * 根据用户id更新用户验证码
	 */
	@Override
	public void updateUserCheckNumByUserid(User user) throws Exception {
		Date date = new Date();
		Timestamp timeStamep = new Timestamp(date.getTime());
		user.setCheckNum("FFFF");
		user.setGmtModified(date);
		
		usermapper.updateUserCheckNumByUserid(user);
	}

	/**
	 * 根据用户id和用户密码查找用户
	 */
	@Override
	public User findUserByUserIdAndPassword(User user) throws Exception {
		
		return usermapper.findUserByUserIdAndPassword(user);
	}

}
