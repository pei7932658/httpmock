package com.cyc.httpmock.model.stk;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;


@Data
public class FaceListObjectWrapper implements Serializable {

  private static final long serialVersionUID = 1540496670985428472L;

  //springMvc 默认只能注入小写开头的属性
  @JsonProperty(value = "FaceListObject")
  private FaceListObject FaceListObject;
}
