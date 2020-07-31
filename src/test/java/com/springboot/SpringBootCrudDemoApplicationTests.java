package com.springboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.Utils.UUIDUtils;
import com.springboot.beans.Uu;
import com.springboot.mapper.UuMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringBootCrudDemoApplicationTests {

    @Resource
    UuMapper uuMapper;

    @Test
    void contextLoads() {
        int pageNum = 2;
        int pageSize = 5;
        IPage<Uu> uuIPage = uuMapper.selectPage(new Page<>(pageNum, pageSize), new QueryWrapper<Uu>());
        List<Uu> records = uuIPage.getRecords();
        System.out.println(records);
    }

    @Test
    void contextLoads1(){
        /*int i = uuMapper.deleteById(6);
        System.out.println(i);*/
        /*String name = "Ecy";
        String email = "Ecy@163.com";
        String id = UUIDUtils.getId();
        Uu uu = new Uu(id,name,email);
        int i = uuMapper.insert(uu);
        System.out.println(i);*/


        /*String uuid = "10";
        String name = "RR";
        String email = "rr@163,com";
        Uu uu = new Uu(uuid,name,email);
        int i = uuMapper.updateById(uu);
        System.out.println(i);*/



    }

}
