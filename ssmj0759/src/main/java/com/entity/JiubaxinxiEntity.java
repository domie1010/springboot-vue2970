package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 酒吧信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
@TableName("jiubaxinxi")
public class JiubaxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiubaxinxiEntity() {
		
	}
	
	public JiubaxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 酒吧名称
	 */
					
	private String jiubamingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：酒吧名称
	 */
	public void setJiubamingcheng(String jiubamingcheng) {
		this.jiubamingcheng = jiubamingcheng;
	}
	/**
	 * 获取：酒吧名称
	 */
	public String getJiubamingcheng() {
		return jiubamingcheng;
	}
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
