package com.jiuhua.datadictionary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 数据字典类型类 所有属性名全部小写
 * 
 * @author yangq
 */
@Entity
@Table(name = "tb_datadictionarytype")
public class DataDictionaryType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int    id;         // 主键
    @Column(name = "name")
    private String text;       // 类型名称
    private int    sequencenum; // 排序号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getSequencenum() {
        return sequencenum;
    }

    public void setSequencenum(int sequencenum) {
        this.sequencenum = sequencenum;
    }

}
