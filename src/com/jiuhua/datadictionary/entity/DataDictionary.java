package com.jiuhua.datadictionary.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 数据字典类 所有属性名全部小写
 * 
 * @author yangq
 */
@Entity
@Table(name = "tb_datadictionary")
public class DataDictionary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int    id;         // 主键
    private String type;       // 类型
    private String name;       // 名称
    private String value;      // 值
    private String status;     // 状态 0停用/1启用
    private int    sequencenum; // 排序号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSequencenum() {
        return sequencenum;
    }

    public void setSequencenum(int sequencenum) {
        this.sequencenum = sequencenum;
    }

}
