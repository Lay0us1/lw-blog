package cn.kevinlu98.mapper;

import cn.kevinlu98.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: Mr丶冷文
 * Date: 2022/10/6 22:04
 * Email: kevinlu98@qq.com
 * Description:
 */
public interface CategoryMapper extends JpaRepository<Category, Integer> {
}
