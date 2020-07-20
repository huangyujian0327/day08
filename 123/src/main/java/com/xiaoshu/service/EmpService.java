package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.EmpMapper;
import com.xiaoshu.entity.Emp;
import com.xiaoshu.entity.EmpVo;

@Service
public class EmpService {

	@Autowired
	private EmpMapper empMapper;

	public PageInfo<EmpVo> findPage(EmpVo empVo,Integer pageNum,Integer pageSize){
	   PageHelper.startPage(pageNum, pageSize);
	   List<EmpVo> list = empMapper.findList(empVo);
	   return new PageInfo<>(list);
	}
	public Emp findByName(String name){
		Emp param=new Emp();
		param.setTbEmpName(name);
		return empMapper.selectOne(param);
	}
	public List<EmpVo> findList(EmpVo empVo){
		return  empMapper.findList(empVo);
	}
	public  void updateEmp(Emp emp){
		empMapper.updateByPrimaryKeySelective(emp);
	}
	public  void addEmp(Emp emp){
		empMapper.insert(emp);
	}
	public void delEmp(Integer id){
		empMapper.deleteByPrimaryKey(id);
	}
}
