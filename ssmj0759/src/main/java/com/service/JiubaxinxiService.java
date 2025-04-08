package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiubaxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiubaxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiubaxinxiView;


/**
 * 酒吧信息
 *
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
public interface JiubaxinxiService extends IService<JiubaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiubaxinxiVO> selectListVO(Wrapper<JiubaxinxiEntity> wrapper);
   	
   	JiubaxinxiVO selectVO(@Param("ew") Wrapper<JiubaxinxiEntity> wrapper);
   	
   	List<JiubaxinxiView> selectListView(Wrapper<JiubaxinxiEntity> wrapper);
   	
   	JiubaxinxiView selectView(@Param("ew") Wrapper<JiubaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiubaxinxiEntity> wrapper);
   	
}

