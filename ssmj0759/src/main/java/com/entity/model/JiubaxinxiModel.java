package com.entity.model;

import com.entity.JiubaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 酒吧信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
public class JiubaxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 酒吧地址
	 */
	
	private String jiubadizhi;
		
	/**
	 * 规模
	 */
	
	private String guimo;
		
	/**
	 * 创立日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangliriqi;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 详情介绍
	 */
	
	private String xiangqingjieshao;
		
	/**
	 * 背景图片
	 */
	
	private String beijingtupian;
				
	
	/**
	 * 设置：酒吧地址
	 */
	 
	public void setJiubadizhi(String jiubadizhi) {
		this.jiubadizhi = jiubadizhi;
	}
	
	/**
	 * 获取：酒吧地址
	 */
	public String getJiubadizhi() {
		return jiubadizhi;
	}
				
	
	/**
	 * 设置：规模
	 */
	 
	public void setGuimo(String guimo) {
		this.guimo = guimo;
	}
	
	/**
	 * 获取：规模
	 */
	public String getGuimo() {
		return guimo;
	}
				
	
	/**
	 * 设置：创立日期
	 */
	 
	public void setChuangliriqi(Date chuangliriqi) {
		this.chuangliriqi = chuangliriqi;
	}
	
	/**
	 * 获取：创立日期
	 */
	public Date getChuangliriqi() {
		return chuangliriqi;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：详情介绍
	 */
	 
	public void setXiangqingjieshao(String xiangqingjieshao) {
		this.xiangqingjieshao = xiangqingjieshao;
	}
	
	/**
	 * 获取：详情介绍
	 */
	public String getXiangqingjieshao() {
		return xiangqingjieshao;
	}
				
	
	/**
	 * 设置：背景图片
	 */
	 
	public void setBeijingtupian(String beijingtupian) {
		this.beijingtupian = beijingtupian;
	}
	
	/**
	 * 获取：背景图片
	 */
	public String getBeijingtupian() {
		return beijingtupian;
	}
			
}
