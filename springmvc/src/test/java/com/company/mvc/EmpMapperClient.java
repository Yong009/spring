package com.company.mvc;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.mvc.emp.EmpVO;
import com.company.mvc.emp.mapper.DeptVO;
import com.company.mvc.emp.mapper.EmpDAO;
import com.company.mvc.emp.mapper.EmpMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class EmpMapperClient {
	
	@Autowired EmpMapper empMapper;	
	@Autowired EmpDAO dao;
	
	@Test
	public void getEmpList() {
		List<DeptVO> list = empMapper.getDeptList();
		for(DeptVO dept : list) {
			System.out.println("부서:" + dept.getDepartmentName());
			for(EmpVO emp : dept.getEmps()) {
				System.out.println("\t"+ emp.getEmployeeId()+"_"+emp.getFirstName());
			}
		}
	}
	
	
	
	
	public void deptDelete() {
		DeptVO vo = new DeptVO();
		vo.setDepartmentIds(Arrays.asList("300","310"));
		empMapper.deptDelete(vo);
	}
	
	
	public void 사원전체조회() {
		EmpVO vo = new EmpVO();
		vo.setDepartmentId("50");
		vo.setFirstName("vin");
		List<EmpVO> list = empMapper.getEmpListVO(vo);
		System.out.println(list.get(0));
	}
	
	
	
	public void DAO사원전체조회() {   // map 카멜케이스 적용 안됨.
		List<Map<String, Object>> list = dao.getEmpList();
		System.out.println("First_name="+list.get(0).get("firstName"));
	}
	
	
	public void DAO사원조회() {
		List<Map<String, Object>> list = empMapper.getEmpList();
		System.out.println(list.get(0));
	}
	
}
