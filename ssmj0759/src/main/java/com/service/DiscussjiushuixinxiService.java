package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiushuixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiushuixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiushuixinxiView;


/**
 * 酒水信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-28 10:30:02
 */
public interface DiscussjiushuixinxiService extends IService<DiscussjiushuixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiushuixinxiVO> selectListVO(Wrapper<DiscussjiushuixinxiEntity> wrapper);
   	
   	DiscussjiushuixinxiVO selectVO(@Param("ew") Wrapper<DiscussjiushuixinxiEntity> wrapper);
   	
   	List<DiscussjiushuixinxiView> selectListView(Wrapper<DiscussjiushuixinxiEntity> wrapper);
   	
   	DiscussjiushuixinxiView selectView(@Param("ew") Wrapper<DiscussjiushuixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiushuixinxiEntity> wrapper);
   	
}

