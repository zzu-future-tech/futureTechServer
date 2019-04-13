package cn.futuretech.mapper;

import cn.futuretech.domain.User;
import cn.futuretech.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
	/**
	 * 注入用户
	 * 
	 * @param record
	 * @return
	 */
	int registerByUseridAndPassword(User record);

	/**
	 * 根据用户id查找用户
	 * 
	 * @param email
	 * @return
	 */
	User findUserByUserid(String userid);

	/**
	 * 根据用户id删除用户
	 * 
	 * @param userid
	 * @return
	 */
	int deleteUserById(String userid);

	/**
	 * 根据用户id更新用户
	 * 
	 * @param userid
	 */
	void updateUserCheckNumByUserid(User user);
	
	/**
	 * 根据用户id和用户密码查找用户
	 * @param user
	 */
	User findUserByUserIdAndPassword(User user);
}