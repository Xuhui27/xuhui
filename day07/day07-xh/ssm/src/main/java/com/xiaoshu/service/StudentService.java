package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.StudentMapper;
import com.xiaoshu.dao.TeacherMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.StudentVo;
import com.xiaoshu.entity.Teacher;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class StudentService {

	@Autowired
	private	StudentMapper sm;
	@Autowired
	private	TeacherMapper tm;

	public PageInfo<StudentVo> findUserPage(StudentVo vo, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<StudentVo> list = sm.findAll(vo);
		PageInfo<StudentVo> info = new PageInfo<>(list);
		return info;
	}

	public Student existUserWithUserName(String sname) {
		// TODO Auto-generated method stub
		Student record = new Student();
		record.setSname(sname);
		return sm.selectOne(record);
	}

	public void updateUser(Student student) {
		// TODO Auto-generated method stub
		sm.updateByPrimaryKeySelective(student);
	}

	public void addUser(Student student) {
		// TODO Auto-generated method stub
		sm.insert(student);
	}

	public List<Teacher> selectAll() {
		// TODO Auto-generated method stub
		return tm.selectAll();
	}

	public void deleteUser(int parseInt) {
		// TODO Auto-generated method stub
		sm.deleteByPrimaryKey(parseInt);
	}

	public List<StudentVo> echarts() {
		// TODO Auto-generated method stub
		return sm.echarts();
	}


}
