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
 * 酒水信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
@TableName("jiushuixinxi")
public class JiushuixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiushuixinxiEntity() {
		
	}
	
	public JiushuixinxiEntity(T t) {
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
	 * 酒水名称
	 */
					
	private String jiushuimingcheng;
	
	/**
	 * 酒水类型
	 */
					
	private String jiushuileixing;
	
	/**
	 * 净重量
	 */
					
	private String jingzhongliang;
	
	/**
	 * 酒水数量
	 */
					
	private Integer jiushuishuliang;
	
	/**
	 * 价格
	 */
					
	private Integer jiage;
	
	/**
	 * 供货地址
	 */
					
	private String gonghuodizhi;
	
	/**
	 * 出产日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chuchanriqi;
	
	/**
	 * 详情介绍
	 */
					
	private String xiangqingjieshao;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
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
	 * 设置：酒水名称
	 */
	public void setJiushuimingcheng(String jiushuimingcheng) {
		this.jiushuimingcheng = jiushuimingcheng;
	}
	/**
	 * 获取：酒水名称
	 */
	public String getJiushuimingcheng() {
		return jiushuimingcheng;
	}
	/**
	 * 设置：酒水类型
	 */
	public void setJiushuileixing(String jiushuileixing) {
		this.jiushuileixing = jiushuileixing;
	}
	/**
	 * 获取：酒水类型
	 */
	public String getJiushuileixing() {
		return jiushuileixing;
	}
	/**
	 * 设置：净重量
	 */
	public void setJingzhongliang(String jingzhongliang) {
		this.jingzhongliang = jingzhongliang;
	}
	/**
	 * 获取：净重量
	 */
	public String getJingzhongliang() {
		return jingzhongliang;
	}
	/**
	 * 设置：酒水数量
	 */
	public void setJiushuishuliang(Integer jiushuishuliang) {
		this.jiushuishuliang = jiushuishuliang;
	}
	/**
	 * 获取：酒水数量
	 */
	public Integer getJiushuishuliang() {
		return jiushuishuliang;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
	/**
	 * 设置：供货地址
	 */
	public void setGonghuodizhi(String gonghuodizhi) {
		this.gonghuodizhi = gonghuodizhi;
	}
	/**
	 * 获取：供货地址
	 */
	public String getGonghuodizhi() {
		return gonghuodizhi;
	}
	/**
	 * 设置：出产日期
	 */
	public void setChuchanriqi(Date chuchanriqi) {
		this.chuchanriqi = chuchanriqi;
	}
	/**
	 * 获取：出产日期
	 */
	public Date getChuchanriqi() {
		return chuchanriqi;
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
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
