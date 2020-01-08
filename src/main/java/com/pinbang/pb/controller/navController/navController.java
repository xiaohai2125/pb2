package com.pinbang.pb.controller.navController;

import com.pinbang.pb.entity.Nav;
import com.pinbang.pb.service.nav.navService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/12/30 17:21
 */
@RestController
@RequestMapping("nav")
public class navController {
@Resource
    navService ns;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("findAll")
public Object AllNav(){
    Map<String,Object> map=new HashMap<>();
    int count=ns.findAllcount();
    List<Nav> list =new ArrayList();
    list=ns.findAllNav();
    map.put("code",0);
    map.put("msg","");
    map.put("count",count);
    map.put("data",list);
    return map;
}

    /**
     *  查询一级导航栏
     * @return
     */
    @RequestMapping("findfirst")
    public Object findFirstNav(){
    List<Nav> navList=ns.findFirstNav();
    return navList;
}

    /**
     *根据id查询二级导航
     * @param id
     * @return
     */
    @RequestMapping("navbyid")
    public Object findNavByid(long id){
    List<Nav> navList =ns.findSecondNavById(id);
    return navList;
}

    /**
     * 添加一条导航
     * @param nav
     * @return
     */
    @RequestMapping("addNav")
    public Object addNav(Nav nav){
    int cnt=0;
    cnt=ns.addNav(nav);
    if (cnt>0)
    return "success";
    else
        return "false";
}

@RequestMapping("deletenav")
public  Object isdelete(long id){
        int cnt=0;
        cnt=ns.deleteNavByid(id);
        if (cnt>0)
        return "success";
        else
            return "false";
}
    /**
     * 更新一条数据
     * @param nav
     * @return
     */
    @RequestMapping("updateNav")
public Object updateNav( Nav nav){
    String result =ns.UpdateNav(nav);
        System.out.println(result);
return result;
}
}
