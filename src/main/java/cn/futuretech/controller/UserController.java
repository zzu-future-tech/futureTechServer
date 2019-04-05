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
		if (userTemp != null) {
			userService.deleteUserById(user.getUserid());
		}

		response.setStatus(userService.insertUser(user));

		return response;
	}
}
