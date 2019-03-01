package com.cyc.httpmock.model.nvzhiyun;

import lombok.Data;

@Data
public class ThirdAlarmRequest {

    /**
     * 摄像头ID
     */
    private String cameraID;

    /**
     * 摄像头名称
     */
    private String cameraName;

    /**
     * 摄像头地址
     */
    private String cameraAddress;

    /**
     * 经度
     */
    private String cameraLongitude;

    /**
     * 纬度
     */
    private String cameraLatitude;

    /**
     * 人脸库编码
     */
    private String repositoryID;

    /**
     * 人脸库名称：无传为空串
     */
    private String repositoryName;

    /**
     * 姓名：无空串
     */
    private String personName;

    /**
     * 证件号码：无空串
     */
    private String personIdCard;

    /**
     * 入库照片
     */
    private String faceImageUrl;

    /**
     * 报警相似度 1-100
     */
    private String similarity;

    /**
     * 报警人脸
     */
    private String keyFaceImageUrl;

    /**
     * 报警全景图
     */
    private String pictureUrl;

    /**
     * 报警时间时间戳
     */
    private String timestampBegin;

    /**
     * 平台验证编码
     */
    private String tokenId;

    /**
     * 是否报警，0 代表不是，1 代表是
     */
    private String isAlarm;

    /**
     * 数据唯一 id
     */
    private String faceDynamicId;
}
