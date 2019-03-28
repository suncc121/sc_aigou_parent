package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.common.AjaxResult;
import cn.itsource.aigou.domain.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plat")
public class UserController {

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        if (user!=null&&!StringUtils.isEmpty(user.getName())&&!StringUtils.isEmpty(user.getPassword())){
            if("admin".equals(user.getName())&&"123456".equals(user.getPassword())){
                return AjaxResult.me().setMsg("登录成功");
            } else {
                return AjaxResult.me().setSuccess(false).setMsg("登录失败");
            }
        }
        return AjaxResult.me().setSuccess(false).setMsg("登录失败");
    }

}
