package cn.futuretech.domain;

/**
 * 用户查询表现层包装对象
 * @author 赵祝德
 *
 */
public class UserQueryVo {

	// 用户信息
	private User user;
	
	// 用户信息的拓展类
	private UserCustom userCustom;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserCustom getUserCustom() {
		return userCustom;
	}

	public void setUserCustom(UserCustom userCustom) {
		this.userCustom = userCustom;
	}
	
}
