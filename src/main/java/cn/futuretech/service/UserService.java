package cn.futuretech.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.futuretech.domain.User;

/**
 * 商品管理的 Service接口
 * @author 赵祝德
 *
 */

public interface UserService {

	/**
	 * 用户注册
	 * @param user
	 * @return
	 * @throws Exception
	 */
	int insertUser(User user) throws Exception;
	
	/**
	 * 根据用户id删除用户
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	int deleteUserById(String userid) throws Exception;
	
	/**
	 * 根据用户id查找用户
	 * @param userid
	 * @return
	 * @throws Exception
	 */
	User findUserByUserid(String userid) throws Exception;
	
	/**
	 * 根据用户id更新用户
	 * @param userid
	 * @throws Exception
	 */
	void updateUserCheckNumByUserid(User user) throws Exception;
	
	/**
	 * 根据用户id和用户密码查找用户
	 * @param user
	 * @throws Exception
	 */
	User findUserByUserIdAndPassword(User user) throws Exception;
	
}
