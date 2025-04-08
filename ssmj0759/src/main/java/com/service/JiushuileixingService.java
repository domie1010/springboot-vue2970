package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiushuileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiushuileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiushuileixingView;


/**
 * 酒水类型
 *
 * @author 
 * @email 
 * @date 2021-05-28 10:30:02
 */
public interface JiushuileixingService extends IService<JiushuileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiushuileixingVO> selectListVO(Wrapper<JiushuileixingEntity> wrapper);
   	
   	JiushuileixingVO selectVO(@Param("ew") Wrapper<JiushuileixingEntity> wrapper);
   	
   	List<JiushuileixingView> selectListView(Wrapper<JiushuileixingEntity> wrapper);
   	
   	JiushuileixingView selectView(@Param("ew") Wrapper<JiushuileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiushuileixingEntity> wrapper);
   	
}

