package com.changgou.service;

import com.changgou.goods.pojo.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Yang
 * @Description:
 * @Date: Created in 下午12:45 14/11/2021
 * @Modified By:
 */

public interface BrandService {
    List<Brand> findAll();
}
