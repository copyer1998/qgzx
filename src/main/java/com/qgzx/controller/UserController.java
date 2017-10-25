package com.qgzx.controller;

import com.qgzx.dto.Result;
import com.qgzx.entity.User;
import com.qgzx.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * The type User controller.
 */
@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    /**
     * 登录 login
     *
     * @param user    the user
     * @param session the session
     * @return result
     * @author zhangzhengan
     * @since JDK 1.7
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result<String> login(@RequestBody User user, HttpSession session) {

        String result;
        try {
            result = userService.login(user);
        } catch (Exception e) {
            return new Result<String>(false, "登录失败", null);
        }
        if (!"success".equals(result)) {
            return new Result<String>(false, result, null);
        } else {
            logger.info("登录成功：" + user);
            session.setAttribute("user", user);
            return new Result<String>(true, "登录成功", null);
        }
    }

    /**
     * 登录界面
     *
     * @return string
     * @author zhangzhengan
     * @since JDK 1.7
     */
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String index() {
        return "login";
    }

    /**
     * Home string.
     *
     * @param session the session
     * @return the string
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String home(HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "login";
        }
        return "index";
    }

    /**
     * Exit string.
     *
     * @param session the session
     * @return the string
     */
    @RequestMapping(value = "/exit", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String exit(HttpSession session) {
        session.removeAttribute("user");
        return "login";
    }

    /**
     * Admin left string.
     *
     * @return the string
     */
    @RequestMapping(value = "/admin-left", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String adminLeft() {
        return "admin-left";
    }

    /**
     * Insert bring info string.
     *
     * @return the string
     */
    @RequestMapping(value = "/insertBringInfo", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String insertBringInfo() {
        return "insertBringInfo";
    }

    /**
     * Manage string.
     *
     * @return the string
     */
    @RequestMapping(value = "/manage", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String manage() {
        return "manage";
    }

    /**
     * Read string.
     *
     * @return the string
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String read() {
        return "list";
    }

    /**
     * Back string.
     *
     * @return the string
     */
    @RequestMapping(value = "/back", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String back() {
        return "back";
    }

    /**
     * Gets bring info.
     *
     * @return the bring info
     */
    @RequestMapping(value = "/getBringInfo", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    public String getBringInfo() {
        return "bringInfo";
    }
}
