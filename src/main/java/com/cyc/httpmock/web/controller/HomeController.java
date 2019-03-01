package com.cyc.httpmock.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.cyc.httpmock.model.nvzhiyun.ThirdAlarmResponse;
import com.cyc.httpmock.model.qinyang.*;
import com.cyc.httpmock.model.stk.FaceListObjectWrapper;
import com.cyc.httpmock.model.weishu.WeiShuWarningModel;
import com.cyc.httpmock.utils.FaceAppContextUtils;
import com.cyc.httpmock.utils.HttpMockFileUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@RestController
@RequestMapping("/")
@Slf4j
public class HomeController {

    @Value("${httpmock.map.file.absolute.path}")
    private String fileName;

    @Value("${httpmock.map.file.encoding}")
    private String fileEncoding;
    @Value("${httpmock.map.file.split}")
    private String fileSplit;

    @RequestMapping(value = "/httpmock", method = {RequestMethod.GET, RequestMethod.POST})
    public @ResponseBody
    Object httpmock(HttpServletResponse response) {
        HttpServletRequest request = FaceAppContextUtils.getCurrentRequest();
        String urlKey = (String) request.getAttribute("urlKey");
        log.info("您发起 的请求为:{}", urlKey);
        Map<String, String[]> parameterMap = request.getParameterMap();
        log.info("您发起 的请求 参数有:{}", JSONObject.toJSONString(parameterMap));
        for (Entry<String, String[]> entry : parameterMap.entrySet()) {
            String name = entry.getKey();
            String[] value = entry.getValue();
            log.info("参数名:{},参数值:{}", name, Arrays.toString(value));
        }
        /**
         * 读取配置
         */
        log.info("读取配置begin...");
        String result = HttpMockFileUtils.getFile2String(urlKey, fileName, fileEncoding, fileSplit);
        //避免restTemplate和httpClient 调用返回404
        response.setStatus(200);
        response.setContentLength(result.length());
        return result;
    }

    //bee go scheduler
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String mock() {
        System.out.println("come in");
        return "{\"success\":true,\"message\":\"message is ok\",\"content\":\"this is conetent\",\"status\":\"COMPLETED\"}";
    }


    @RequestMapping(value = "/szsj", method = {RequestMethod.GET})
    public String szsj() {
        return "mock test";
    }

    @RequestMapping(value = "/api/getNewsList", method = {RequestMethod.GET})
    public String getNewsList() {
        return "mock test";
    }

    /**
     * 这个请求可以下定制化，根据参数返回不同值
     *
     * @param paramsType
     * @return
     */
    @RequestMapping(value = "/dzh/szsj", method = RequestMethod.GET)
    public String szsj(@RequestParam(value = "type", required = false, defaultValue = "1") String paramsType) {
        String result = "{'MSG':'请求成功!','STATUS':'200','DATA':{'SFZH':'130125198811153544','XM':'赵娟'}}";
        if ("1".equals(paramsType)) {
            result = "{'MSG':'请求成功!','STATUS':'200','DATA':{'SFZH':'1','XM':'张三'}}";
        } else if ("2".equals(paramsType)) {
            result = "{'MSG':'请求成功!','STATUS':'200','DATA':{'SFZH':'2','XM':'李四'}}";
        } else {
            result = "{'MSG':'无结果!','STATUS':'201'}";
        }

        return result;
    }


    @RequestMapping(value = "/dzh/alarm/data", method = RequestMethod.POST)
    public String recivePost(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "IdCard") String IdCard, @RequestParam(value = "gender") String gender) {
        System.out.println(name);
        System.out.println(IdCard);
        System.out.println(gender);
        return "{code:'200',msg:'成功'}";
    }

    @RequestMapping(value = "/dzh/alarm/data", method = RequestMethod.GET)
    public String reciveGet(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "IdCard") String IdCard, @RequestParam(value = "gender") String gender) {
        System.out.println(name);
        System.out.println(IdCard);
        System.out.println(gender);
        return "{code:'200',msg:'成功'}";
    }

    @RequestMapping(value = "/VIID/Faces", method = RequestMethod.POST)
    public String stkFaces(@RequestBody FaceListObjectWrapper faceListObjectWrapper) {
        System.out.println(faceListObjectWrapper);
        return "{code:'200',msg:'成功'}";
    }

    @RequestMapping(value = "/save/warnings", method = RequestMethod.POST)
    public String getWeiShuWarning(@RequestBody List<WeiShuWarningModel> data) {
        System.out.println(data);
        return "{code:'200',msg:'成功'}";
    }

    /**对接青羊项目 start**/
    @RequestMapping(value = "/fsap/login", method = RequestMethod.POST)
    public String getQingyangLogin(@RequestBody ThirdLoginRequest req) {
        System.out.println(req.getUser());
        System.out.println(req.getPassword());

        ThirdLoginResult result = ThirdLoginResult.of("token");
        CustomMessage customMessage = CustomMessage.of(0, "登录成功", ThirdLoginResult.of("token"), null);
        return JSONObject.toJSONString(customMessage);
    }

    @RequestMapping(value = "/fsap/alarm", method = RequestMethod.POST)
    public String getQingyangAlarm(@RequestHeader("X-Authorization") String token, @RequestBody ThirdAlarmRequest req) {
        System.out.println(token);
        System.out.println(req);
        CustomMessage customMessage = CustomMessage.of(0, "报警接收到成功", ThirdLoginResult.of("token"), null);
        return JSONObject.toJSONString(customMessage);
    }

    @RequestMapping(value = "/repository/updatePush", method = RequestMethod.POST)
    public String getQingyang(@RequestHeader("X-Authorization") String token, @RequestBody List<ThirdAlbumCountRequest> data) {
        System.out.println(token);
        System.out.println(data);
        CustomMessage customMessage = CustomMessage.of(0, "更新成功", ThirdLoginResult.of("token"), null);
        return JSONObject.toJSONString(customMessage);
    }
    /**对接青羊项目 end**/

    //视侦汉口洞鉴对接绿之云
    @RequestMapping(value = "/dynamicface_receive", method = RequestMethod.POST)
    public String getNvZhiYunAlarm( @RequestBody com.cyc.httpmock.model.nvzhiyun.ThirdAlarmRequest req) {
        System.out.println(req);
        ThirdAlarmResponse customMessage = ThirdAlarmResponse.of(req.getFaceDynamicId(), "0", "成功");
        return JSONObject.toJSONString(customMessage);
    }
}
