package cn.futuretech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.futuretech.domain.Response;
import cn.futuretech.domain.User;
import cn.futuretech.service.UserService;
import cn.futuretech.service.impl.UserServiceImpl;

/**
 * 用户信息的Controller
 * 
 * @author 赵祝德
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	/**
	 * 自动注入
	 */
	@Autowired
	private UserService userService;

	@RequestMapping("/test")
	/**
	 * 测试输入、输出json串
	 * 
	 * @param user
	 * @return json
	 */
	public @ResponseBody User test(@RequestBody User user) {

		return user;
	}

	@RequestMapping("/test1")
	/**
	 * 测试输入参数，输出json串
	 * 
	 * @param user
	 * @return
	 */
	public @ResponseBody User test1(User user) {

		return user;
	}

	/**
	 * 用户激活方法
	 * @param user
	 * @return
	 */
	@RequestMapping("/avtivateUser")
	public @ResponseBody Response activeUserByCheckNum(User user) {

		Response response = new Response();
		User userTemp;
		try {
			userTemp = userService.findUserByUserid(user.getUserid());
			if (userTemp != null) 
				if ( userTemp.getCheckNum().equals(user.getCheckNum()) && !userTemp.getCheckNum().equals("FFFF")) { 
					// 如果验证码一致
					userService.updateUserCheckNumByUserid(user);
					response.setStatus(100);
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return response;
	}

	/**
	 * 用户注册方法
	 * 
	 * @param user
	 * @return int 插入是否成功
	 * @throws Exception
	 */
	@RequestMapping("/insertUser")
	public @ResponseBody Response insertUser(User user) throws Exception {

		Response response = new Response();
		response.setStatus(0);

		User userTemp = userService.findUserByUserid(user.getUserid());
		// 如果找到该用户，且该用户的未验证
		if (userTemp != null && !userTemp.getCheckNum().equals("FFFF")) {
			// 删除用户
			userService.deleteUserById(user.getUserid());
		} else if (userTemp != null && userTemp.getCheckNum().equals("FFFF")){
			// 如果用户已验证
			response.setStatus(0);
			return response;
		}

		response.setStatus(userService.insertUser(user));
		return response;
	}
	
	/**
	 * 用户登录方法
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/userLogin")
	public @ResponseBody Response userLogin(User user) throws Exception {
		
		Response response = new Response();
		// 根据用户id和用户密码查找用户查找用户
		User userTemp = userService.findUserByUserIdAndPassword(user);
		// 判断是否找到用户
		if (userTemp == null && !userTemp.getCheckNum().equals("FFFF")) {
			// 如果没有找到用户
			response.setStatus(101);
		} else {
			// 如果找到用户
			response.setStatus(100);
		}
		
		// 返回结果值
		return response;
	}
}
