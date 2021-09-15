package qiu.kai.xin.gulimall.product.dao;

import qiu.kai.xin.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author qiukaixin
 * @email 501411356@qq.com
 * @date 2021-09-15 20:10:32
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
