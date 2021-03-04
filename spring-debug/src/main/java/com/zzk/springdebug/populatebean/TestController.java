package com.zzk.springdebug.populatebean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zzk
 * @create 2021-03-03 22:33
 */
@Controller
public class TestController {
	@Autowired
	private TestService testService;
}
