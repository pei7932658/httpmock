package com.cyc.httpmock.model.qinyang;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author chenyisheng
 * @Date 2018/11/22 10:38
 * @Description
 * @Version 1.0
 **/
@Data
@AllArgsConstructor(staticName = "of")
public class CustomMessage<T>{


    @ApiModelProperty(name = "code", notes = "请求响应码", dataType = "int")
    private int code;

    @ApiModelProperty(name = "msg", notes = "请求结果描述", dataType = "string")
    private String msg;

    @ApiModelProperty(name = "records", notes = "请求结果的返回数据", dataType = "json object")
    private T data;

    @ApiModelProperty(name = "faceId", notes = "请求结果的返回的faceId", dataType = "json object")
    private T faceId;
}
