package com.shoppingapp.controller;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingapp.domain.Login;
import com.shoppingapp.domain.User;
import com.shoppingapp.repository.UserRepository;
import com.shoppingapp.repository.UserRepositoryImpl;

@Controller
@SessionAttributes("user")
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("ShoppingCart") Login login, ModelMap model, Model model1) {
    	
		Configuration con = new Configuration().configure().addAnnotatedClass(User.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		session.getTransaction().begin();
    	
		System.out.println(login.getUsername());
		
        UserRepository userRepository = new UserRepositoryImpl(session);
        
        if(userRepository.validateUser(login) == null) {
        	return user();
        }
        model.addAttribute("username", login.getUsername());
        model.addAttribute("password", login.getPassword());
        model.addAttribute("message", login.getUsername());
        System.out.println(login.getUsername());

        return new ModelAndView("home");
    }

    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    public ModelAndView logout(SessionStatus sessionStatus, HttpSession session) {
        sessionStatus.setComplete();
        session.invalidate();

        return user();
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView user() {
        return new ModelAndView("login", "command", new Login());
    }
}


