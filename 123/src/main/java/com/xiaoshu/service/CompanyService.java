package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaoshu.dao.CompanyMapper;
import com.xiaoshu.entity.Company;

@Service 
public class CompanyService {

	@Autowired
	private  	CompanyMapper companyMapper;
	public List<Company> findAll(){
	  return companyMapper.findAll();
	}
	}
	

