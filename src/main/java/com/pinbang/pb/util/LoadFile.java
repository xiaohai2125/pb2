package com.pinbang.pb.util;

import java.io.*;
import java.util.Date;

public class LoadFile {
    public static boolean JspToHtmlFile() {
        String s = "<img src=\'../static/img/timg.jpg\'/><p><h1>你好!!!</h1></p><p><h2>我好!!!</h2></p><p>大家好!!!</p>";
        String str = "";
        long beginDate = (new Date()).getTime();
        try {
            String tempStr = "";
            FileInputStream is = new FileInputStream("D:\\idea\\ideaworkspace\\bijia\\src\\main\\resources\\templates\\test.html");//读取模块文件
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while ((tempStr = br.readLine()) != null)
                str = str + tempStr ;
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        try {
            str = str.replaceAll("ABCD",s);
            File f = new File("D:\\idea\\ideaworkspace\\bijia\\src\\main\\resources\\templates\\test1.html");
            BufferedWriter o = new BufferedWriter(new FileWriter(f));
            o.write(str);
            o.close();
            System.out.println("共用时：" + ((new Date()).getTime() - beginDate) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public static boolean JspToHtmlFileByParam(String strs,int i) {
        String s = "<img src=\'../static/img/timg.jpg\'/><p><h1>你好!!!</h1></p><p><h2>我好!!!</h2></p><p>大家好!!!</p>";
        String str = "";
        long beginDate = (new Date()).getTime();
        try {
            String tempStr = "";
            FileInputStream is = new FileInputStream("D:\\idea\\ideaworkspace\\bijia\\src\\main\\resources\\templates\\test.html");//读取模块文件
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            while ((tempStr = br.readLine()) != null)
                str = str + tempStr ;
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        try {
            str = str.replaceAll("ABCD",strs);
            File f = new File("D:\\idea\\ideaworkspace\\bijia\\src\\main\\resources\\templates\\test"+i+".html");
            BufferedWriter o = new BufferedWriter(new FileWriter(f));
            o.write(str);
            o.close();
            System.out.println("共用时：" + ((new Date()).getTime() - beginDate) + "ms");
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(LoadFile.JspToHtmlFile());
    }
}
