package com.pinbang.pb.controller.UserController;

import com.github.pagehelper.PageInfo;
import com.pinbang.pb.entity.User;
import com.pinbang.pb.service.user.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    UserService userService;
    /**
     * 查询所有用户信息
     * @return
     */
    @RequestMapping("findAll")
    public Map<String,Object> findAllUser(@RequestParam(value = "info",defaultValue = "") String info,
                                          @RequestParam(value = "page",defaultValue = "1")int pageNo,
                                          @RequestParam(value = "limit",defaultValue = "10")int pageSize){
        PageInfo<User> userPageInfo = null;
        Map<String,Object> map = new HashMap<>();
        if("".equals(info)&&info.equals(null)){
            userPageInfo  = userService.findAll(pageNo,pageSize);
        }else{
            userPageInfo = userService.findLike(info,pageNo,pageSize);
        }
        map.put("code",0);
        map.put("msg","");
        map.put("count",userPageInfo.getTotal());
        map.put("data",userPageInfo.getList());
        return map;
    }
    /**
     * 添加用户信息
     * @param user 用户对象
     * @return
     */
    @RequestMapping("addUser")
    public String addUser(User user){
        int i = userService.addUser(user);
        if (i>0){
            return "success";
        }else{
            return "fail";
        }
    }

    /**
     * 修改用户信息
     * @param user 用户对象
     * @return
     */
    @RequestMapping("updateUser")
    public String updateUser(User user){
        int i = userService.updateUser(user);
        if (i>0){
            return "success";
        }else{
            return "fail";
        }
    }

    /**
     * 删除用户(逻辑删除)
     * @param id 用户id
     * @return
     */
    @RequestMapping("delUser")
    public String delUser(int id){
        int i = userService.delUser(new Byte(id+""));
        if (i>0){
            return "success";
        }else{
            return "fail";
        }
    }

    /**
     * 批量删除用户
     * @param list 用户id集合
     * @return
     */
    @RequestMapping("delMoreUser")
    public String delMoreUser(@RequestBody List<String> list){
        int i = userService.delMoreUser(list);
        if (i>0){
            return "success";
        }else{
            return "fail";
        }
    }
    /**
     * 用户登录操作
     */
    @RequestMapping(value = "login.do")
    public Object login(String name, String pwd) {
        Map<String,Object> map = new HashMap<>();
        User user = userService.login(name,pwd);
        if(user!=null){
            map.put("result","success");
            map.put("user",user);
        }else {
            map.put("result","fail");
        }
        return map;
    }
}
