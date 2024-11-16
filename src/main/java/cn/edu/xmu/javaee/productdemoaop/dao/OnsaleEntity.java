package cn.edu.xmu.javaee.productdemoaop.dao;

import cn.edu.xmu.javaee.productdemoaop.dao.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Component
@Entity
@Table(name = "goods_onsale")
public class OnsaleEntity {

    @Id
    private Long id;

    private Long price;

    private LocalDateTime beginTime;

    private LocalDateTime endTime;

    private Integer quantity;

    private Integer maxQuantity;

    @ManyToOne
    private UserEntity creator;

    @ManyToOne
    private UserEntity modifier;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;
}
