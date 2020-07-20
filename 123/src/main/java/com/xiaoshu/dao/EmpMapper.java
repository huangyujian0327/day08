package com.xiaoshu.dao;

import java.util.List;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Emp;
import com.xiaoshu.entity.EmpVo;

public interface EmpMapper extends BaseMapper<Emp> {
    public List<EmpVo> findList(EmpVo empVo);
}