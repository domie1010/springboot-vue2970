package com.dao;

import com.entity.JiushuileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiushuileixingVO;
import com.entity.view.JiushuileixingView;


/**
 * 酒水类型
 * 
 * @author 
 * @email 
 * @date 2021-05-28 10:30:02
 */
public interface JiushuileixingDao extends BaseMapper<JiushuileixingEntity> {
	
	List<JiushuileixingVO> selectListVO(@Param("ew") Wrapper<JiushuileixingEntity> wrapper);
	
	JiushuileixingVO selectVO(@Param("ew") Wrapper<JiushuileixingEntity> wrapper);
	
	List<JiushuileixingView> selectListView(@Param("ew") Wrapper<JiushuileixingEntity> wrapper);

	List<JiushuileixingView> selectListView(Pagination page,@Param("ew") Wrapper<JiushuileixingEntity> wrapper);
	
	JiushuileixingView selectView(@Param("ew") Wrapper<JiushuileixingEntity> wrapper);
	
}
