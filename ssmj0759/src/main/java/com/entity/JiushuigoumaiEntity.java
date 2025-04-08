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
 * 酒水购买
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
@TableName("jiushuigoumai")
public class JiushuigoumaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiushuigoumaiEntity() {
		
	}
	
	public JiushuigoumaiEntity(T t) {
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
	 * 总价
	 */
					
	private String zongjia;
	
	/**
	 * 购买时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date goumaishijian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：总价
	 */
	public void setZongjia(String zongjia) {
		this.zongjia = zongjia;
	}
	/**
	 * 获取：总价
	 */
	public String getZongjia() {
		return zongjia;
	}
	/**
	 * 设置：购买时间
	 */
	public void setGoumaishijian(Date goumaishijian) {
		this.goumaishijian = goumaishijian;
	}
	/**
	 * 获取：购买时间
	 */
	public Date getGoumaishijian() {
		return goumaishijian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
