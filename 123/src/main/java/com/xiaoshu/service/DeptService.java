package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.DeptMapper;
import com.xiaoshu.entity.Dept;
import com.xiaoshu.entity.DeptVo;

@Service
public class DeptService {

	@Autowired
	DeptMapper deptMapper;
	
	public List<Dept> findAll(){
		return deptMapper.selectAll();
	}
	public PageInfo<Dept> findPage(DeptVo deptVo, Integer pageSize, Integer pageNum, String ordername, String order) {
		PageHelper.startPage(pageNum, pageSize);
		ordername = StringUtil.isNotEmpty(ordername)?ordername:"id";
		order = StringUtil.isNotEmpty(order)?order:"desc";
		deptVo.setOrderByClause(ordername+" "+order);
		/*List<Dept> list = deptMapper.select(dept);*/
		List<Dept> list = deptMapper.findDept(deptVo);
		return new PageInfo<>(list);
	}
	/*public PageInfo<Dept> findPage(DeptVo deptVo,String ordername,String order,Integer pageSize,Integer pageNum){
		
	}*/
	public Dept findByName(String name){
		Dept dept =new Dept();
		dept.setName(name);
		return deptMapper.selectOne(dept);		
	}
	public void  addDept(Dept dept){
		deptMapper.insert(dept);
	}
	public void updateDept(Dept dept){
		deptMapper.updateByPrimaryKeySelective(dept);
	}
	public void delDept(Integer id){
		deptMapper.deleteByPrimaryKey(id);
	}
	

}
