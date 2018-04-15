/**
 * 
 */
package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class DemoController {

	@RequestMapping("/hi")
	public @ResponseBody String something() {
		return "hello";
	}
}
