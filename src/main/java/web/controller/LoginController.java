package web.controller;

import data.constant.SessionConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.user.UserMgr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created on 2017/9/27.
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserMgr userMgr;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String login(HttpServletRequest request) {

        HttpSession session = request.getSession();
        Object isLogin = session.getAttribute(SessionConstants.IS_LOGIN);
        if (isLogin != null && "true".equals(isLogin.toString())) {
            // ÒÑ¾­µÇÂ¼

            return "true";
        } else {
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");

            if (userMgr.isExist(userName, password)) {
                session.setAttribute(SessionConstants.IS_LOGIN, true);
                return "true";
            }

            return "false";
        }

    }
}
