package com.qcb.controllers;

import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayOpenPublicTemplateMessageIndustryModifyRequest;
import com.alipay.api.response.AlipayOpenPublicTemplateMessageIndustryModifyResponse;
import com.qcb.entitys.User;
import com.qcb.serviceimpl.UserServiceImpl;
import com.qcb.services.IUserService;
import com.qcb.utils.AlipayTrade;


@Controller
public class ZfbpayController {
	@ResponseBody
    @RequestMapping(value ="views/hello0", produces = "application/json;charset=utf-8",method ={RequestMethod.POST})
    public ModelAndView hello0( HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		String result="";
		System.out.println(0);
		AlipayTrade trade=new AlipayTrade();
		try {
			result=trade.Pagepay(request);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.addObject("message",result);
    	mv.setViewName("index");
    	return mv;
    }
    @RequestMapping(value ="views/hello1", produces = "application/json;charset=utf-8",method ={RequestMethod.POST})
    public ModelAndView hello1( HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		String result="";
		System.out.println(1);
		AlipayTrade trade=new AlipayTrade();
		try {
			result=trade.Query(request);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.addObject("message",result);
    	mv.setViewName("index");
    	return mv;
    }
    @RequestMapping(value ="views/hello2", produces = "application/json;charset=utf-8",method ={RequestMethod.POST})
    public ModelAndView hello2( HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		String result="";
		System.out.println(2);
		AlipayTrade trade=new AlipayTrade();
		try {
			result=trade.Pagepay(request);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.addObject("message",result);
    	mv.setViewName("index");
    	return mv;
    }
    @RequestMapping(value ="views/hello3", produces = "application/json;charset=utf-8",method ={RequestMethod.POST})
    public ModelAndView hello3( HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		String result="";
		System.out.println(3);
		AlipayTrade trade=new AlipayTrade();
		try {
			result=trade.Pagepay(request);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AlipayApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.addObject("message",result);
    	mv.setViewName("index");
    	return mv;
    }
	
}
