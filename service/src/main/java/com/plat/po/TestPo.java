package com.plat.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author haibin.tang
 * @create 2018-04-27 上午9:16
 **/
@Data
@Entity
@Table(name = "plat_test")
public class TestPo {
    @Id
    private String id;
    private String name;
}
