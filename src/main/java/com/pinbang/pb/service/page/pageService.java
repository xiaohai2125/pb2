package com.pinbang.pb.service.page;

import com.pinbang.pb.entity.Nav;
import com.pinbang.pb.entity.Page;

import java.util.List;

/**
 * Created by Administrator on 2019/12/31 15:28
 */
public interface pageService {
    /**
     * 根据id查询所有页面
     * @param id
     * @return
     */
    public List<Page> findPageByparentid(long id);


    /**
     * 模糊查询
     * @param info
     * @return
     */
    public List<Page> findLike(String info);

    /**
     * 根据id逻辑删除
     * @param id
     * @return
     */
    public int isdeleteById(long id);

    /**
     * 添加一个页面
     * @param page
     * @return
     */
    public int addPage(Page page);

    /**
     * 编辑功能先进行根据id查找 放进富文当中  然后富文本的保存按钮放进数据库中
     * @param id
     * @return
     */
    public Page edit(long id);
    public List<Page> findAll();
}
