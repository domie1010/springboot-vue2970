package com.dao;

import com.entity.JiubaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiubaxinxiVO;
import com.entity.view.JiubaxinxiView;


/**
 * 酒吧信息
 * 
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
public interface JiubaxinxiDao extends BaseMapper<JiubaxinxiEntity> {
	
	List<JiubaxinxiVO> selectListVO(@Param("ew") Wrapper<JiubaxinxiEntity> wrapper);
	
	JiubaxinxiVO selectVO(@Param("ew") Wrapper<JiubaxinxiEntity> wrapper);
	
	List<JiubaxinxiView> selectListView(@Param("ew") Wrapper<JiubaxinxiEntity> wrapper);

	List<JiubaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiubaxinxiEntity> wrapper);
	
	JiubaxinxiView selectView(@Param("ew") Wrapper<JiubaxinxiEntity> wrapper);
	
}
