package com.tieto.anuja.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tieto.anuja.bean.Emp;
import com.tieto.anuja.dao.EmpDao;
@Controller
public class EmpController {
    @Autowired
	EmpDao dao;
	@RequestMapping("/empform")
	public ModelAndView showform(){
		return new ModelAndView("empform","command",new Emp());
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") Emp emp){
			/*if(dao.save(emp)==5)
			{
				System.out.println("bonus is added");
				return new ModelAndView("redirect:/viewemp");
			}*/
		dao.save(emp);
		dao.update1(emp);
		return new ModelAndView("redirect:/viewemp");
		}
	
	
	@RequestMapping("/loginform")
	public ModelAndView showloginform(){
		return new ModelAndView("loginform","command",new Emp());
	}
	
	@RequestMapping(value="/Submit",method = RequestMethod.POST)
	public ModelAndView Submit(@ModelAttribute("emp") Emp emp){
		if(dao.Submit(emp)==2)
			{
			return new ModelAndView("redirect:/loginform");
			}
		else
		{
			return new ModelAndView("redirect:/loginsuccess");
		}
			
	}
	
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){
		String message="User is successfully Registered...";
		return new ModelAndView("viewemp","message",message);
	}
	
	@RequestMapping("/loginsuccess")
	public ModelAndView loginsuccess(){
		return new ModelAndView("loginsuccess","command",new Emp());
	}
	@RequestMapping("/loginfailure")
	public ModelAndView loginfailure(){
		return new ModelAndView("loginfailure","command",new Emp());
	}
}