package com.pinbang.pb;

import com.pinbang.pb.entity.Log;
import com.pinbang.pb.entity.Nav;
import com.pinbang.pb.entity.Page;
import com.pinbang.pb.mapper.LogMapper;
import com.pinbang.pb.service.log.impl.logServiceImpl;
import com.pinbang.pb.service.log.logService;
import com.pinbang.pb.service.nav.impl.navServiceImpl;
import com.pinbang.pb.service.nav.navService;
import com.pinbang.pb.service.page.pageService;
import com.pinbang.pb.util.MD5;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = PbApplication.class)
class PbApplicationTests {

@Resource logService logService;
@Resource navService ns;
@Resource
pageService ps;
	@Test
	public void test1(){
		/*String a="123456";
		System.out.println(MD5.getMD5(a));*/
List<Page> pageList=ps.findAll();
		for (Page p:pageList
				) {
			System.out.println(p.getContent());
		}
	/*List<Page> pageList=ps.findPageByparentid((long)3);
		for (Page p:pageList
			 ) {
			System.out.println(p.getTitle());
		}*/
		/*List<Nav> l=ns.findAllNav();
		for (Nav n:l
			 ) {
			System.out.println(n.getnTitle());
		}*/
	/*List<Log> logList=logService.selectByContent("海");
		for (Log l:logList
			 ) {
			System.out.println(l.getContent());

		}*/
	}

	void contextLoads() {
	}

}
