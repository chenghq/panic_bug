package web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created on 2017/9/27.
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String login(HttpServletRequest request) {

        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        return "true";
    }
}
