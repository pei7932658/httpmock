package com.cyc.httpmock.model.stk;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 描述: .
 *
 * @author luhaiyou
 * @version 1.0
 * @date Created in 下午6:45 2018/10/11
 */
@Data
public class SubImageList {
  @JsonProperty(value = "SubImageInfoObject")
  private List<SubImageInfo> SubImageInfoObject;
}
