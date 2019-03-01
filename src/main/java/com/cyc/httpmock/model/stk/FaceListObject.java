package com.cyc.httpmock.model.stk;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;


@Data
public class FaceListObject {
  @JsonProperty(value = "FaceObject")
  private List<Face> FaceObject;
}
