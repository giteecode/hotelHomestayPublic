package com.cl.dao;

import com.cl.entity.KefangleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.KefangleixingView;


/**
 * 客房类型
 * 
 * @author 
 * @email 
 * @date 2024-03-12 18:45:45
 */
public interface KefangleixingDao extends BaseMapper<KefangleixingEntity> {
	
	List<KefangleixingView> selectListView(@Param("ew") Wrapper<KefangleixingEntity> wrapper);

	List<KefangleixingView> selectListView(Pagination page,@Param("ew") Wrapper<KefangleixingEntity> wrapper);
	
	KefangleixingView selectView(@Param("ew") Wrapper<KefangleixingEntity> wrapper);
	

}
