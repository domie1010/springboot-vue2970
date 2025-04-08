package com.dao;

import com.entity.JiushuigoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiushuigoumaiVO;
import com.entity.view.JiushuigoumaiView;


/**
 * 酒水购买
 * 
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
public interface JiushuigoumaiDao extends BaseMapper<JiushuigoumaiEntity> {
	
	List<JiushuigoumaiVO> selectListVO(@Param("ew") Wrapper<JiushuigoumaiEntity> wrapper);
	
	JiushuigoumaiVO selectVO(@Param("ew") Wrapper<JiushuigoumaiEntity> wrapper);
	
	List<JiushuigoumaiView> selectListView(@Param("ew") Wrapper<JiushuigoumaiEntity> wrapper);

	List<JiushuigoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<JiushuigoumaiEntity> wrapper);
	
	JiushuigoumaiView selectView(@Param("ew") Wrapper<JiushuigoumaiEntity> wrapper);
	
}
