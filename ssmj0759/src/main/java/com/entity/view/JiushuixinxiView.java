package com.entity.view;

import com.entity.JiushuixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 酒水信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
@TableName("jiushuixinxi")
public class JiushuixinxiView  extends JiushuixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiushuixinxiView(){
	}
 
 	public JiushuixinxiView(JiushuixinxiEntity jiushuixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiushuixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
