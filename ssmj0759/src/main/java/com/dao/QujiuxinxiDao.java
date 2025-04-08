package com.dao;

import com.entity.QujiuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QujiuxinxiVO;
import com.entity.view.QujiuxinxiView;


/**
 * 取酒信息
 * 
 * @author 
 * @email 
 * @date 2021-05-28 10:30:02
 */
public interface QujiuxinxiDao extends BaseMapper<QujiuxinxiEntity> {
	
	List<QujiuxinxiVO> selectListVO(@Param("ew") Wrapper<QujiuxinxiEntity> wrapper);
	
	QujiuxinxiVO selectVO(@Param("ew") Wrapper<QujiuxinxiEntity> wrapper);
	
	List<QujiuxinxiView> selectListView(@Param("ew") Wrapper<QujiuxinxiEntity> wrapper);

	List<QujiuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QujiuxinxiEntity> wrapper);
	
	QujiuxinxiView selectView(@Param("ew") Wrapper<QujiuxinxiEntity> wrapper);
	
}
