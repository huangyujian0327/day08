package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Company;
import com.xiaoshu.entity.CompanyExample;
import com.xiaoshu.entity.Dept;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper extends BaseMapper<Company> {
	
	List<Company> findAll();
  
}