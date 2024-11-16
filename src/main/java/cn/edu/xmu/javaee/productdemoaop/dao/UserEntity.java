package cn.edu.xmu.javaee.productdemoaop.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Component
@Entity
@Table(name = "goods_onsale")
public class UserEntity {

    @Id
    private Long id;
    @Column(name = "creator_name")
    private String name;

}
