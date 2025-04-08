package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CunjiuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CunjiuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CunjiuxinxiView;


/**
 * 存酒信息
 *
 * @author 
 * @email 
 * @date 2021-05-28 10:30:01
 */
public interface CunjiuxinxiService extends IService<CunjiuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CunjiuxinxiVO> selectListVO(Wrapper<CunjiuxinxiEntity> wrapper);
   	
   	CunjiuxinxiVO selectVO(@Param("ew") Wrapper<CunjiuxinxiEntity> wrapper);
   	
   	List<CunjiuxinxiView> selectListView(Wrapper<CunjiuxinxiEntity> wrapper);
   	
   	CunjiuxinxiView selectView(@Param("ew") Wrapper<CunjiuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CunjiuxinxiEntity> wrapper);
   	
}

