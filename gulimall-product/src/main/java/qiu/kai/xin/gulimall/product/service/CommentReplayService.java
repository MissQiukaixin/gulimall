package qiu.kai.xin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import qiu.kai.xin.common.utils.PageUtils;
import qiu.kai.xin.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author qiukaixin
 * @email 501411356@qq.com
 * @date 2021-09-15 20:10:32
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

