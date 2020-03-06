package com.spring.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;
import com.spring.dao.UserDAO;
import com.spring.domain.Account;

@Controller
@RequestMapping("/Account")
public class UserController {
	@Autowired
	private UserDAO dao;

	@RequestMapping("/")
	public String showIndexPage() {
		return "index";

	}

	@RequestMapping("/upload")
	public String viewUpload() {
		return "upload-customer";

	}

	@RequestMapping(value="/doUpload",method = RequestMethod.POST)
	public ModelAndView insertCustomers(@RequestParam CommonsMultipartFile[] fileUpload, HttpSession session) throws Exception {
		ModelAndView mv = new ModelAndView("insert");
		if (fileUpload != null ) {
            
			for (CommonsMultipartFile aFile : fileUpload){
                
                 
                Account account=new Account();
                //account.setId(aFile.getBytes());
                account.setAccountNo(aFile.getOriginalFilename());
                account.setAccountType(aFile.getOriginalFilename());
                account.setSecurityNumber(aFile.getOriginalFilename());
                //account.setCreated(aFile.getContentType());
                //account.setBalance(aFile.getResource());
                dao.createCheckingAccount(account);              
            
        }
			mv.addObject("message","Customer uploaded successfully");
			
		}
		else {
			mv.addObject("message","Customers doesn,t upload successfully");
			
		}

		return mv;
	}
	
	}
