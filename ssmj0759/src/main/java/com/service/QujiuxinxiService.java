package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QujiuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QujiuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QujiuxinxiView;


/**
 * 取酒信息
 *
 * @author 
 * @email 
 * @date 2021-05-28 10:30:02
 */
public interface QujiuxinxiService extends IService<QujiuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QujiuxinxiVO> selectListVO(Wrapper<QujiuxinxiEntity> wrapper);
   	
   	QujiuxinxiVO selectVO(@Param("ew") Wrapper<QujiuxinxiEntity> wrapper);
   	
   	List<QujiuxinxiView> selectListView(Wrapper<QujiuxinxiEntity> wrapper);
   	
   	QujiuxinxiView selectView(@Param("ew") Wrapper<QujiuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QujiuxinxiEntity> wrapper);
   	
}

