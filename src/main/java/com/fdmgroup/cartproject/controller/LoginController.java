package com.fdmgroup.cartproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fdmgroup.cartproject.model.User;
import com.fdmgroup.cartproject.repo.UserDao;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    public static final String USER_ID = "USER_ID";

    @Autowired
    private UserDao userDao;

    @GetMapping("Login")
    public ModelAndView login() {
        return new ModelAndView("login.jsp", "user", new User());
    }

    @PostMapping("LoginSubmit")
    public String loginSubmit(@ModelAttribute("user")User user,
                              Model model, HttpSession session) {

        User userFromDatabase = userDao.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (userFromDatabase == null) {
            model.addAttribute("message", "Incorrect user name or password");
            return "login.jsp";
        }
        session.setAttribute("userName", user.getUsername());
        session.setAttribute(USER_ID, userFromDatabase.getId());
        model.addAttribute("user", userFromDatabase);

        return "WEB-INF/index.jsp";
    }

    @GetMapping("Logout")
    public ModelAndView logout(HttpSession session){
        Object idFromSession = session.getAttribute((LoginController.USER_ID));
        if (idFromSession != null){
            int userId = (int) session.getAttribute(LoginController.USER_ID);
        }
        session.invalidate();
        return new ModelAndView("login.jsp", "user", new User());
    }

    @RequestMapping("Index")
    public String returnToIndex(Model model) {
        return "WEB-INF/index.jsp";
    }
}
