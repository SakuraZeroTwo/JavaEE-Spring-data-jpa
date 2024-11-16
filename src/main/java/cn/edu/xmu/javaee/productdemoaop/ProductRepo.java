package cn.edu.xmu.javaee.productdemoaop;

import cn.edu.xmu.javaee.productdemoaop.dao.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import jakarta.persistence.QueryHint;
import org.springframework.data.jpa.repository.QueryHints;
import org.apache.ibatis.annotations.Param;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {
    @Query("SELECT p FROM ProductEntity p WHERE p.name = :name")
    List<ProductEntity> findAllByName(String name);

    @Query("SELECT p from ProductEntity p where p.goodsId=:goodsId AND p.id <> :id")
    @QueryHints(@QueryHint(name = "org.hibernate.readOnly",value = "true"))
    List<ProductEntity> findOtherProducts(@Param("goodsId") Long goodsId, @Param("id") Long id);
}
