package com.cyc.httpmock.model.qinyang;

/**
 * @Author:peiliang
 * @Description:
 * @Date:2019/1/10 14:46
 * @Modified By:
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author peiliang
 * @Description : 底库统计信息请求参数
 * @Date 2019/1/9 17:36
 * @Param
 * @Return
 */
@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class ThirdAlbumCountRequest {

    /**
     * 底库名称
     */
    private String name;

    /**
     * 我们的底库ID
     */
    private String repositoryCode;

    /**
     * 底库人像数量
     */
    private String count;

    /**
     * 更新时间(yyyy-MM-dd HH:mm:ss)
     */
    private String updateDate;
}
