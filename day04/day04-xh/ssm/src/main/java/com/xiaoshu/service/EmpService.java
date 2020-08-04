package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.EmpMapper;
import com.xiaoshu.entity.Emp;
import com.xiaoshu.entity.User;
import com.xiaoshu.vo.EmpVo;

@Service
public class EmpService {

	@Autowired
	EmpMapper empMapper;

	

	// 新增
	public void addUser(Emp t) throws Exception {
		empMapper.insert(t);
	};

	// 修改
	public void updateUser(Emp t) throws Exception {
		empMapper.updateByPrimaryKeySelective(t);
	};

	// 删除
	public void deleteUser(Integer id) throws Exception {
		empMapper.deleteByPrimaryKey(id);
	};

	

	

	public PageInfo<EmpVo> findUserPage(Emp emp, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<EmpVo> empList = empMapper.findAll(emp);
		PageInfo<EmpVo> pageInfo = new PageInfo<EmpVo>(empList);
		return pageInfo;
	}


}
