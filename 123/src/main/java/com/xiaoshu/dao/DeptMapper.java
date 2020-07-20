package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Dept;
import com.xiaoshu.entity.DeptExample;
import java.util.List;

import javax.xml.registry.infomodel.LocalizedString;

import org.apache.ibatis.annotations.Param;

public interface DeptMapper extends BaseMapper<Dept> {
    
	public List<Dept> findDept(Dept dept);
}