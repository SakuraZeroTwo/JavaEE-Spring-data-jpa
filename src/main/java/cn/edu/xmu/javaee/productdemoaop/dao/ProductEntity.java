package cn.edu.xmu.javaee.productdemoaop.dao;

import cn.edu.xmu.javaee.productdemoaop.dao.OnsaleEntity;
import cn.edu.xmu.javaee.productdemoaop.dao.ProductEntity;
import cn.edu.xmu.javaee.productdemoaop.dao.UserEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Component
@Entity
@Table(name = "goods_product")
public class ProductEntity {

    private static final Logger logger = LoggerFactory.getLogger(ProductEntity.class);

    /**
     * 代理对象
     */
    @Id
    private Long id;

    @Column(name = "shop_id")
    private Long shopId;

    @Column(name = "goods_id")
    private Long goodsId;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "template_id")
    private Long templateId;

    private String skuSn;

    private String name;

    private Long originalPrice;

    private Long weight;

    private String barcode;

    private String unit;

    @Column(name = "creator_id")
    private Long creatorId;

    @Column(name = "creator_name")
    private String creatorName;

    @Column(name = "modifier_id")
    private Long modifierId;

    @Column(name = "modifier_name")
    private String modifierName;

    private String originPlace;

    private Integer commissionRatio;

    private Long freeThreshold;

    private byte status;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    @Builder

    public ProductEntity(Long id, String skuSn, String name, Long originalPrice, Long weight, String barcode, String unit, String originPlace, Integer commissionRatio, Long freeThreshold, byte status, LocalDateTime gmtCreate, LocalDateTime gmtModified) {
        this.id = id;
        this.skuSn = skuSn;
        this.name = name;
        this.originalPrice = originalPrice;
        this.weight = weight;
        this.barcode = barcode;
        this.unit = unit;
        this.originPlace = originPlace;
        this.commissionRatio = commissionRatio;
        this.freeThreshold = freeThreshold;
        this.status = status;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }
}
