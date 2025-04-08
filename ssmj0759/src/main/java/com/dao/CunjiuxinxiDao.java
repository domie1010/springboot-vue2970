package com.dao;

import com.entity.CunjiuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CunjiuxinxiVO;
import com.entity.view.CunjiuxinxiView;


/**
 * 存酒信息
 * 
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
public interface CunjiuxinxiDao extends BaseMapper<CunjiuxinxiEntity> {
	
	List<CunjiuxinxiVO> selectListVO(@Param("ew") Wrapper<CunjiuxinxiEntity> wrapper);
	
	CunjiuxinxiVO selectVO(@Param("ew") Wrapper<CunjiuxinxiEntity> wrapper);
	
	List<CunjiuxinxiView> selectListView(@Param("ew") Wrapper<CunjiuxinxiEntity> wrapper);

	List<CunjiuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CunjiuxinxiEntity> wrapper);
	
	CunjiuxinxiView selectView(@Param("ew") Wrapper<CunjiuxinxiEntity> wrapper);
	
}
