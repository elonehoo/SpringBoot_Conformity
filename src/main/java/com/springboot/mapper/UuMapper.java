package com.springboot.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.springboot.beans.Uu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.RowBounds;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

@Mapper
public interface UuMapper extends BaseMapper<Uu> {


}
