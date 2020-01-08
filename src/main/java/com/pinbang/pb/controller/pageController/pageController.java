package com.pinbang.pb.controller.pageController;

import com.pinbang.pb.entity.Page;
import com.pinbang.pb.service.page.pageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2020/1/3 9:31
 */
@RestController
@RequestMapping("page")
public class pageController {
@Resource
private pageService ps;
@RequestMapping("findAll")
    public List<Page> findAll(){
    return null;
    }
    @RequestMapping("findpage")
    public Object findPageByparentid(@RequestParam(value = "id",defaultValue = "0") long id,@RequestParam(value = "keyWords",defaultValue = "") String keyWords){
        List<Page> pages=null;
        System.out.println(keyWords);
        System.out.println(id);
        if (!("".equals(keyWords))) {
            pages = ps.findLike(keyWords);
            System.out.println("实现重载查");
        }
   else if (id!=0){
        pages =ps.findPageByparentid(id);
        System.out.println("实现id查");
    }
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pages.size());
        map.put("data",pages);
        return map;
    }
    @RequestMapping("updatepage")
    public Object update(Page page){
    int cnt=ps.addPage(page);
    if (cnt>0)
    return "success";
    else
        return "error";
    }
    @RequestMapping("addpage")
    public Object addPage(Page page){
    int cnt=ps.addPage(page);
    if (cnt>0)
        return "success";
    else
    return "error";
    }
    @RequestMapping("deletepage")
    public Object delete(long id){
        int cnt=ps.isdeleteById(id);
        if (cnt>0)
            return "success";
        else
            return "error";
    }
    @RequestMapping( "uploadFile.do")
    public Object uploadFile(@Param("file")MultipartFile file) {
        //本地使用,上传位置
        String rootPath ="C://logs//";
        //文件的完整名称,如spring.jpeg
        String filename = file.getOriginalFilename();
        //文件名,如spring
        String name = filename.substring(0,filename.indexOf("."));
        //文件后缀,如.jpeg
        String suffix = filename.substring(filename.lastIndexOf("."));
        //目标文件
        File descFile = new File(rootPath+File.separator+File.separator+filename);
        int i = 1;
        //若文件存在重命名
        String newFilename = filename;
        while(descFile.exists()) {
            newFilename = name+"("+i+")"+suffix;
            String parentPath = descFile.getParent();
            descFile = new File(parentPath+File.separator+newFilename);
            i++;
        }
        //判断目标文件所在的目录是否存在
        if(!descFile.getParentFile().exists()) {
            //如果目标文件所在的目录不存在，则创建父目录
            descFile.getParentFile().mkdirs();
        }
        //将内存中的数据写入磁盘
        try {
            file.transferTo(descFile);
        } catch (Exception e) {
            e.printStackTrace();

        }
        //完整的url
        String fileUrl =  "http://localhost:8080/img/"+newFilename;
        //System.out.println(fileUrl);
        String[] data = { fileUrl };

        Map<String,Object> map = new HashMap<String,Object>();
        Map<String,Object> map2 = new HashMap<String,Object>();
        map.put("code",0);//0表示成功，1失败
        map.put("msg","上传成功");//提示消息

        map2.put("src",fileUrl);//图片url
        map2.put("title","图片丢失");//图片名称，这个会显示在输入框里
        map.put("data",map2);
        return map;


    }
}
