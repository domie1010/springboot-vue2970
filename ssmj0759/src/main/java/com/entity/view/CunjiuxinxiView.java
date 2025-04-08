package com.entity.view;

import com.entity.CunjiuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 存酒信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
@TableName("cunjiuxinxi")
public class CunjiuxinxiView  extends CunjiuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CunjiuxinxiView(){
	}
 
 	public CunjiuxinxiView(CunjiuxinxiEntity cunjiuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, cunjiuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
