package qiu.kai.xin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import qiu.kai.xin.common.utils.PageUtils;
import qiu.kai.xin.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author qiukaixin
 * @email 501411356@qq.com
 * @date 2021-09-13 21:21:50
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

