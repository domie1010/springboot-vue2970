package com.dao;

import com.entity.DiscussjiushuixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiushuixinxiVO;
import com.entity.view.DiscussjiushuixinxiView;


/**
 * 酒水信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-28 10:30:02
 */
public interface DiscussjiushuixinxiDao extends BaseMapper<DiscussjiushuixinxiEntity> {
	
	List<DiscussjiushuixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjiushuixinxiEntity> wrapper);
	
	DiscussjiushuixinxiVO selectVO(@Param("ew") Wrapper<DiscussjiushuixinxiEntity> wrapper);
	
	List<DiscussjiushuixinxiView> selectListView(@Param("ew") Wrapper<DiscussjiushuixinxiEntity> wrapper);

	List<DiscussjiushuixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiushuixinxiEntity> wrapper);
	
	DiscussjiushuixinxiView selectView(@Param("ew") Wrapper<DiscussjiushuixinxiEntity> wrapper);
	
}
