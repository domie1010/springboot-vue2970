package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiushuixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiushuixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiushuixinxiView;


/**
 * 酒水信息
 *
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
public interface JiushuixinxiService extends IService<JiushuixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiushuixinxiVO> selectListVO(Wrapper<JiushuixinxiEntity> wrapper);
   	
   	JiushuixinxiVO selectVO(@Param("ew") Wrapper<JiushuixinxiEntity> wrapper);
   	
   	List<JiushuixinxiView> selectListView(Wrapper<JiushuixinxiEntity> wrapper);
   	
   	JiushuixinxiView selectView(@Param("ew") Wrapper<JiushuixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiushuixinxiEntity> wrapper);
   	
}

