package web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created on 2017/9/27.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/server/status", method = RequestMethod.GET)
    public String getServerStatus(HttpServletRequest request) {

        return "The Manager is up!!";
    }
}
