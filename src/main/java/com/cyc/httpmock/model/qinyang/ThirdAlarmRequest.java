package com.cyc.httpmock.model.qinyang;

import lombok.Data;

@Data
public class ThirdAlarmRequest {

    /**
     *  报警时间
     */
    private String alarmTime;

    /**
     * 摄像头ID
     */
    private String deviceId;

    /**
     * 证件类型
     */
    private String cardType;

    /**
     * 姓名
     */
    private String name;

    /**
     * 证件号码
     */
    private String cardNo;

    /**
     * 报警相似度 1-100
     */
    private String score;

    /**
     * 报警人脸（Base64编码）
     */
    private String captureFace;

    /**
     * 报警全景图（Base64编码）
     */
    private String capturePanorama;

    /**
     * 黑名单库对照id
     */
    private String repositoryCode;

    /**
     * 标准对比图（底库图的base64编码）
     */
    private String contrastDiagrama;

    /**
     * 各厂商系统布控人员id
     */
    private String faceId;
}
