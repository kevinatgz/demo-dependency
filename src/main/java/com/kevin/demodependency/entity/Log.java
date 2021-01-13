package com.kevin.demodependency.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Log implements Serializable {

    private Date createTime;

}
