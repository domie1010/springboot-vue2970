package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiushuigoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiushuigoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiushuigoumaiView;


/**
 * 酒水购买
 *
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
public interface JiushuigoumaiService extends IService<JiushuigoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiushuigoumaiVO> selectListVO(Wrapper<JiushuigoumaiEntity> wrapper);
   	
   	JiushuigoumaiVO selectVO(@Param("ew") Wrapper<JiushuigoumaiEntity> wrapper);
   	
   	List<JiushuigoumaiView> selectListView(Wrapper<JiushuigoumaiEntity> wrapper);
   	
   	JiushuigoumaiView selectView(@Param("ew") Wrapper<JiushuigoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiushuigoumaiEntity> wrapper);
   	
}

