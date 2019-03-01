package com.cyc.httpmock.model.stk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 描述: .
 *
 * @author luhaiyou
 * @version 1.0
 * @date Created in 下午5:20 2018/10/11
 */
@Data
public class SubImageInfo {

  /** 12 人脸 */
  @JsonProperty(value = "Type")
  private String type;

  @JsonProperty(value = "StoragePath")
  private String storagePath;

  @JsonProperty(value = "DeviceID")
  private String deviceId;

  @JsonProperty(value = "ImageID")
  private String imageId;

  @JsonProperty(value = "EventSort")
  private Integer eventSort;

  @JsonProperty(value = "Height")
  private Integer height = 0;

  @JsonProperty(value = "Width")
  private Integer width = 0;

  @JsonProperty(value = "ShotTime")
  private String shotTime;

  @JsonProperty(value = "FileFormat")
  private String fileFormat;

  @JsonProperty(value = "Similaritydegree")
  private Float similaritydegree;

  @JsonProperty(value = "Data")
  private String data;
}
