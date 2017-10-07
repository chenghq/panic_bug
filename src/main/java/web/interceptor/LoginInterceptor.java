package web.interceptor;

import data.constant.SessionConstants;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created on 2017/9/27.
 * 登录处理
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

//    private final Logger log = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();

        Object isLogin = session.getAttribute(SessionConstants.IS_LOGIN);
        if (isLogin != null && "true".equals(isLogin.toString())) {
            // 已经登录

            return true;
        } else {
            // 跳转到登录界面
            request.getRequestDispatcher("/login.html").forward(request, response);
            return false;
        }
    }
}
