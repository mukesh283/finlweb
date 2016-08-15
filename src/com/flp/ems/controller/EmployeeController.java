package com.flp.ems.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flp.ems.bean.EmployeeBean;
import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeService;

/**
 * @author Dinesh Rajput
 *
 */
@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("command") EmployeeBean employeeBean, 
			BindingResult result) {
		Employee employee = prepareModel(employeeBean);
		employeeService.addEmployee(employee);
		return new ModelAndView("redirect:/add.html");
	}

	@RequestMapping(value="/employees", method = RequestMethod.GET)
	public ModelAndView listEmployees() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		return new ModelAndView("employeesList", model);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addEmployee(@ModelAttribute("command")  EmployeeBean employeeBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		return new ModelAndView("addEmployee", model);
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView editEmployee(@ModelAttribute("command")  EmployeeBean employeeBean,
			BindingResult result) {
		employeeService.deleteEmployee(prepareModel(employeeBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employee", null);
		model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		return new ModelAndView("addEmployee", model);
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@ModelAttribute("command")  EmployeeBean employeeBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("employee", prepareEmployeeBean(employeeService.getEmployee(employeeBean.getId())));
		model.put("employees",  prepareListofBean(employeeService.listEmployeess()));
		return new ModelAndView("addEmployee", model);
	}
	
	private Employee prepareModel(EmployeeBean employeeBean){
		Employee employee = new Employee();
		employee.setEmpAddress(employeeBean.getAddress());
		employee.setKinid(employeeBean.getKin_id());
		employee.setEmpName(employeeBean.getName());
		employee.setPhone_no(employeeBean.getPhone_no());
		employee.setEmailid(employeeBean.getEmail_id());
		employee.setDob(employeeBean.getDOB());
		employee.setDoj(employeeBean.getDOJ());
		employee.setDepartment_id(employeeBean.getDepartmentid());
		employee.setProject_id(employeeBean.getProjectid());
		employee.setRoles_id(employeeBean.getRolesid());
		employee.setEmpId(employeeBean.getId());
		employeeBean.setId(null);
		return employee;
	}
	
	private List<EmployeeBean> prepareListofBean(List<Employee> employees){
		List<EmployeeBean> beans = null;
		if(employees != null && !employees.isEmpty()){
			beans = new ArrayList<EmployeeBean>();
			EmployeeBean bean = null;
			for(Employee employee : employees){
				bean = new EmployeeBean();
				bean.setName(employee.getEmpName());
				bean.setId(employee.getEmpId());
				bean.setAddress(employee.getEmpAddress());
				bean.setEmail_id(employee.getEmailid());
				bean.setPhone_no(employee.getPhone_no());
				bean.setDOB(employee.getDob());
				bean.setDOB(employee.getDob());
				bean.setKin_id(employee.getKinid());
				bean.setDepartmentid(employee.getDepartment_id());
				bean.setProjectid(employee.getProject_id());
				bean.setRolesid(employee.getRoles_id());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private EmployeeBean prepareEmployeeBean(Employee employee){
		EmployeeBean bean = new EmployeeBean();
		bean.setName(employee.getEmpName());
		bean.setId(employee.getEmpId());
		bean.setAddress(employee.getEmpAddress());
		bean.setEmail_id(employee.getEmailid());
		bean.setPhone_no(employee.getPhone_no());
		bean.setDOB(employee.getDob());
		bean.setDOB(employee.getDob());
		bean.setKin_id(employee.getKinid());
		bean.setDepartmentid(employee.getDepartment_id());
		bean.setProjectid(employee.getProject_id());
		bean.setRolesid(employee.getRoles_id());		
		return bean;
	}
}
