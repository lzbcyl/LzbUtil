package com.lzb.lzbutils.bean;

import lombok.Data;

/**
 * 基类
 * @param <T>
 */
@Data
public class BaseResult<T> {
    String message;
    String code;
    T data;
}
