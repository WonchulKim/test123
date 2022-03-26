package com.example.demo.user;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserAct {

  @Autowired
  UserDao userDao;
	
  @RequestMapping("/user")
  public ModelAndView user() {
		
    ModelAndView mav = new ModelAndView();
    mav.setViewName("user");
    List<Map<String, String>> l = userDao.allMember();
    System.out.println(l);
	System.out.println("source_change");
    System.out.println(3);
    mav.addObject("user", l);
    return mav;
  }
}
