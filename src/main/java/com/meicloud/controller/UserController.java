package com.meicloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meicloud.model.User;

/**
 * 
 * 用户操作
 * 
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping(value = { "/getUserInfo" })
	@ResponseBody
	public Object getUserInfo() {
		return new User("admin", "admin");
	}

}
