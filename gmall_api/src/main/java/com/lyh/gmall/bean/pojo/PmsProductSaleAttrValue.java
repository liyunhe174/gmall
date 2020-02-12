package com.lyh.gmall.bean.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsProductSaleAttrValue implements Serializable {
    @Id
    @Column
    String id ;
    @Column
    String productId;
    @Column
    String saleAttrId;
    @Column
    String saleAttrValueName;
    @Transient
    String isChecked;
}
