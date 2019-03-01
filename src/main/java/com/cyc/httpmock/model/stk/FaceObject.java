package com.cyc.httpmock.model.stk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 描述: .
 *
 * @author luhaiyou
 * @version 1.0
 * @date Created in 下午5:13 2018/10/11
 */
@Data
public class FaceObject {

  @JsonProperty(value = "FaceID")
  private String faceId;

  /** 1 自动采集 */
  @JsonProperty(value = "InfoKind")
  private Integer infoKind;

  @JsonProperty(value = "DeviceID")
  private String deviceId;

  @JsonProperty(value = "RightBtmY")
  private int rightBtmY;

  @JsonProperty(value = "RightBtmX")
  private int rightBtmX;

  @JsonProperty(value = "LeftTopY")
  private int leftTopY;

  @JsonProperty(value = "LeftTopX")
  private int leftTopX;

  @JsonProperty(value = "ShotTime")
  private String shotTime;

  @JsonProperty(value = "SourceID")
  private String sourceId;

  @JsonProperty(value = "IsSuspectedTerrorist")
  private int isSuspectedTerrorist;

  @JsonProperty(value = "IsCriminalInvolved")
  private int isCriminalInvolved;

  @JsonProperty(value = "IsDetainees")
  private int isDetainees;

  @JsonProperty(value = "isVictim")
  private int isVictim;

  @JsonProperty(value = "IsSuspiciousPerson")
  private int isSuspiciousPerson;

  @JsonProperty(value = "SubImageList")
  private SubImageList subImageList;
}
