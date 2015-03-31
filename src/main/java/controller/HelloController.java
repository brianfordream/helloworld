package controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author brian.yang
 * @email brian.yang@qunar.com
 * @date 15-3-30
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public @ResponseBody String hello(HttpServletRequest httpServletRequest){
        return "hello:"+httpServletRequest.getParameter("name");
    }


}
