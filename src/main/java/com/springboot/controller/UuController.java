package com.springboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.Utils.UUIDUtils;
import com.springboot.beans.Uu;
import com.springboot.mapper.UuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
public class UuController {

    @Resource
    UuMapper uuMapper;

    @PostMapping("/session")
    @ResponseBody
    @CrossOrigin
    public Uu findById(@RequestBody HashMap<String,Object> map){
        String uuid = map.get("uuid").toString();
        Uu uu = uuMapper.selectById(uuid);
        System.out.println(uu);
        return uu;
    }

    @PostMapping("/uu")
    @ResponseBody
    @CrossOrigin
    public IPage<Uu> findAll(@RequestBody HashMap<String,Object> map){
        int pageNum = (int) map.get("pageNum");
        int pageSize = 5;
        IPage<Uu> uuIPage = uuMapper.selectPage(new Page<>(pageNum, pageSize), new QueryWrapper<Uu>());
        return uuIPage;
    }

    @PostMapping("/del")
    @ResponseBody
    @CrossOrigin
    public String delete(@RequestBody HashMap<String,Object> map){
        String number = map.get("uuid").toString();
        int i = uuMapper.deleteById(number);
        if (i == 1){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    @PostMapping("/add")
    @ResponseBody
    @CrossOrigin
    public String add(@RequestBody HashMap<String,Object> map){
        String name = map.get("name").toString();
        String email = map.get("email").toString();
        String id = UUIDUtils.getId();
        Uu uu = new Uu(id,name,email);
        int i = uuMapper.insert(uu);
        if (i == 1){
            return "添加成功";
        }else {
            return "添加失败";
        }
    }

    @PostMapping("/upd")
    @ResponseBody
    @CrossOrigin
    public String update(@RequestBody HashMap<String,Object> map){
        String uuid = map.get("uuid").toString();
        String name = map.get("name").toString();
        String email = map.get("email").toString();
        Uu uu = new Uu(uuid,name,email);
        int i = uuMapper.updateById(uu);
        if (i == 1){
            return "修改成功";
        }else {
            return "修改失败";
        }

    }
}
