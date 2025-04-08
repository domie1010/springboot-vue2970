package com.dao;

import com.entity.JiushuixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiushuixinxiVO;
import com.entity.view.JiushuixinxiView;


/**
 * 酒水信息
 * 
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
public interface JiushuixinxiDao extends BaseMapper<JiushuixinxiEntity> {
	
	List<JiushuixinxiVO> selectListVO(@Param("ew") Wrapper<JiushuixinxiEntity> wrapper);
	
	JiushuixinxiVO selectVO(@Param("ew") Wrapper<JiushuixinxiEntity> wrapper);
	
	List<JiushuixinxiView> selectListView(@Param("ew") Wrapper<JiushuixinxiEntity> wrapper);

	List<JiushuixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiushuixinxiEntity> wrapper);
	
	JiushuixinxiView selectView(@Param("ew") Wrapper<JiushuixinxiEntity> wrapper);
	
}
