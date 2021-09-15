package qiu.kai.xin.gulimall.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import qiu.kai.xin.gulimall.product.entity.BrandEntity;
import qiu.kai.xin.gulimall.product.service.BrandService;
import qiu.kai.xin.gulimall.product.service.impl.BrandServiceImpl;

import javax.annotation.Resource;

@SpringBootTest
class GulimallProductApplicationTests {

    @Resource
    private BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName("阿里云");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
