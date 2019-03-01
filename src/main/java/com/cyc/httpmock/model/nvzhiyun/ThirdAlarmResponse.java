package com.cyc.httpmock.model.nvzhiyun;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author:peiliang
 * @Description:
 * @Date:2019/1/17 10:42
 * @Modified By:
 */
@Data
@AllArgsConstructor(staticName = "of")
public class ThirdAlarmResponse implements Serializable{
    /**
     * 推送过来的数据中的faceDynamicId字段值
     */
    private String id;

    /**
     * 0成功，其它失败
     */
    private String code;

    /**
     * 消息
     */
    private String message;
}
