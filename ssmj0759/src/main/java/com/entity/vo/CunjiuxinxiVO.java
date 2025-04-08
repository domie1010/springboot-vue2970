package com.entity.vo;

import com.entity.CunjiuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 存酒信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
public class CunjiuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 酒水类型
	 */
	
	private String jiushuileixing;
		
	/**
	 * 净重量
	 */
	
	private String jingzhongliang;
		
	/**
	 * 存酒数量
	 */
	
	private String cunjiushuliang;
		
	/**
	 * 台位号
	 */
	
	private Integer taiweihao;
		
	/**
	 * 存酒日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date cunjiuriqi;
		
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
	 * 设置：存酒数量
	 */
	 
	public void setCunjiushuliang(String cunjiushuliang) {
		this.cunjiushuliang = cunjiushuliang;
	}
	
	/**
	 * 获取：存酒数量
	 */
	public String getCunjiushuliang() {
		return cunjiushuliang;
	}
				
	
	/**
	 * 设置：台位号
	 */
	 
	public void setTaiweihao(Integer taiweihao) {
		this.taiweihao = taiweihao;
	}
	
	/**
	 * 获取：台位号
	 */
	public Integer getTaiweihao() {
		return taiweihao;
	}
				
	
	/**
	 * 设置：存酒日期
	 */
	 
	public void setCunjiuriqi(Date cunjiuriqi) {
		this.cunjiuriqi = cunjiuriqi;
	}
	
	/**
	 * 获取：存酒日期
	 */
	public Date getCunjiuriqi() {
		return cunjiuriqi;
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
			
}
