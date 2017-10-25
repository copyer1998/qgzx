package com.qgzx.service;

import com.qgzx.entity.User;


/**
 * The interface User service.
 */
public interface UserService {
	/**
	 * Login string.
	 *
	 * @param user the user
	 * @return the string
	 * @throws Exception the exception
	 * @author zhangzhengan
	 * @since JDK 1.7
	 */
	String login(User user) throws Exception;
}
