package com.cyc.httpmock.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HttpMockFileUtils {

  public static void main(String[] args) throws Exception {
    String file2String = getFile2String("/platform/api/blacklist/count", "E:\\httpmock\\", "GBK", "txt");
    log.info("file2String:{}", file2String);
  }

  private static Gson gson = new GsonBuilder().create();

  public static String getFile2String(String urlKey, String fileName, String fileEncoding, String fileSplit) {

    // 将urlKey转换成 -
    /// platform/api/blacklist/count --> platform-api-blacklist-count
    String result = "";
    if (StringUtils.isBlank(urlKey)) {
      return "请求地址可能不太友好,换个url吧!";
    }
    try {
      //
      urlKey = StringUtils.substringAfter(urlKey, "/");
      urlKey = StringUtils.replace(urlKey, "/", "-");
      String absoluteFileName = fileName + urlKey + "." + fileSplit;
      log.info("准备读取文件:{}", absoluteFileName);
      result = FileUtils.readFileToString(new File(absoluteFileName), fileEncoding);
      // 去除字符串中的空格\t、回车\n、换行符\r、制表符\t
      // Pattern p = Pattern.compile("\\s*|\t|\r|\n");
      // Matcher m = p.matcher(result);
      // result = m.replaceAll("");
      result=isJSON(result);
      
    } catch (IOException e) {
      log.error("读取文件异常:{}", e);
      return "读取文件异常:{}" + e.getMessage();
    }
    log.info("响应结果为:{}", result);
    return result;
  }

  /**
   * Google Gson
   * 
   * @param jsonInString
   * @return
   */
  public final static String isJSON(String jsonInString) {
    try {
      JSONObject parseObject = JSONObject.parseObject(jsonInString);
      return JSONObject.toJSONString(parseObject);
    } catch (Exception ex) {
      try {
        JSONArray parseArray = JSONObject.parseArray(jsonInString);
        return JSONObject.toJSONString(parseArray);
      } catch (Exception ex1) {
        return jsonInString;
      }
    }
  }

}
