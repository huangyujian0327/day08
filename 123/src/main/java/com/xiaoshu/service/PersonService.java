package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.PersonMapper;
import com.xiaoshu.entity.Person;
import com.xiaoshu.entity.PersonVo;

@Service
public class PersonService {

	@Autowired
	private PersonMapper personMapper;

	public PageInfo<PersonVo> findPersonPage(PersonVo personVo, Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<PersonVo> list = personMapper.findList(personVo);
		return new PageInfo<>(list);
	}
    public Person findByName(String name){
    	Person parm=new Person();
    	parm.setpName(name);
	return 	personMapper.selectOne(parm);
    }
	public void  updatePerson(Person person){
		personMapper.updateByPrimaryKeySelective(person);
		}
	public void addPerson(Person person){
		personMapper.insert(person);
	}
	public void delPerson(Integer id){
		personMapper.deleteByPrimaryKey(id);
	}
}
