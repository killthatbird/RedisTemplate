package org.wlfek.test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wlfek.test.Domain.User;
import org.wlfek.test.Service.TestService;

@RestController
public class TestController {


	@Autowired
	private TestService testService;

	@RequestMapping(value="/")
	public User test(Model model){
		User user = testService.test();
		return user;
	}
}
