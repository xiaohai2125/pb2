package com.pinbang.pb.service.nav;

import com.pinbang.pb.entity.Nav;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/12/27 20:24
 */

public interface navService {
    /**
     * 查询一级标题
     * @return
     */
    public List<Nav> findFirstNav();

    /**
     * 根据一级导航id查询出二级导航
     * @param id
     * @return
     */
    public List<Nav> findSecondNavById(long id);

    /**
     * 查询所有导航栏
     * @return
     */
    public List<Nav> findAllNav();

    /**
     * 查询所有条数
     * @return
     */
    public int findAllcount();
     /**
     * 添加一条导航
     * @param nav
     * @return
     */
    public int addNav(Nav nav);

    /**
     * 根据id删除导航
     * @param id
     * @return
     */
    public int deleteNavByid(long id);

    /**
     * 更新导航栏
     * @param nav
     * @return
     */
    public String UpdateNav(Nav nav);
    
}
