package com.cyc.httpmock.model.stk;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;


@Data
public class Face extends FaceObject{
    private static final long serialVersionUID = 8442399048030749071L;

    // 人脸id
    @ApiModelProperty(value = "人脸id", required = true)
    @JsonProperty(value = "FaceID")
    private String faceId;

    // 信息类型 0:其他,1:自动采集,2:人工采集,
    @ApiModelProperty(value = "人工采集还是自动采集", required = true)
    @JsonProperty(value = "InfoKind")
    private Integer infoKind;

    // 来源标识
    @ApiModelProperty(value = "来源标识", required = false)
    @JsonProperty(value = "SourceID")
    private String sourceId;

    // 设备编码
    @ApiModelProperty(value = "设备编码", required = false)
    @JsonProperty(value = "DeviceID")
    private String deviceId;

    // 左上角 X 坐标
    @ApiModelProperty(value = "左上角 X 坐标", required = false)
    @JsonProperty(value = "LeftTopX")
    private int leftTopX;

    // 左上角 Y 坐标
    @ApiModelProperty(value = "左上角 Y 坐标", required = false)
    @JsonProperty(value = "LeftTopY")
    private int leftTopY;

    // 右下角 X 坐标
    @ApiModelProperty(value = "右下角 X 坐标", required = false)
    @JsonProperty(value = "RightBtmX")
    private int rightBtmX;

    // 右下角 Y 坐标
    @ApiModelProperty(value = "右下角 Y 坐标", required = false)
    @JsonProperty(value = "RightBtmY")
    private int rightBtmY;

    // 位置标记时间
    @ApiModelProperty(value = "位置标记时间", required = false)
    @JsonProperty(value = "LocationMarkTime")
    @JsonFormat(pattern="yyyyMMddHHmmss")
    private Date locationMarkTime;

    // 人脸出现时间
    @ApiModelProperty(value = "人脸出现时间", required = false)
    @JsonProperty(value = "FaceAppearTime")
    @JsonFormat(pattern="yyyyMMddHHmmss")
    private Date faceAppearTime;

    // 人脸消失出现
    @ApiModelProperty(value = "人脸消失出现", required = false)
    @JsonProperty(value = "FaceDisAppearTime")
    @JsonFormat(pattern="yyyyMMddHHmmss")
    private Date faceDisAppearTime;

    // 证件类型 111:身份证,114:军官证,123:警官证,414:普通护照,
    @ApiModelProperty(value = "证件类型 111:身份证,114:军官证,123:警官证,414:普通护照,", required = false)
    @JsonProperty(value = "IDType")
    private String idType;

    // 证件号
    @ApiModelProperty(value = "证件号", required = false)
    @JsonProperty(value = "IDNumber")
    private String idNumber;

    // 姓名
    @ApiModelProperty(value = "姓名", required = false)
    @JsonProperty(value = "Name")
    private String name;

    // 曾用名
    @ApiModelProperty(value = "曾用名", required = false)
    @JsonProperty(value = "UsedName")
    private String usedName;

    // 绰号
    @ApiModelProperty(value = "绰号", required = false)
    @JsonProperty(value = "Alias")
    private String alias;

    // 性别 0:未知的性别,1:男性,2:女性,9:未说明的性别
    @ApiModelProperty(value = "性别 0:未知的性别,1:男性,2:女性,9:未说明的性别", required = false)
    @JsonProperty(value = "GenderCode")
    private String genderCode;

    // 最大可能年龄
    @ApiModelProperty(value = "最大可能年龄", required = false)
    @JsonProperty(value = "AgeUpLimit")
    private int ageUpLimit;

    // 最小可能年龄
    @ApiModelProperty(value = "最小可能年龄", required = false)
    @JsonProperty(value = "AgeLowerLimit")
    private int ageLowerLimit;

    // 民族代码
    @ApiModelProperty(value = "民族代码", required = false)
    @JsonProperty(value = "EthicCode")
    private String ethicCode;

    // 国籍代码
    @ApiModelProperty(value = "国籍代码", required = false)
    @JsonProperty(value = "NationalityCode")
    private String nationalityCode;

    // 籍贯省市县代码
    @ApiModelProperty(value = "籍贯省市县代码", required = false)
    @JsonProperty(value = "NativeCityCode")
    private String nativeCityCode;

    // 居住地行政划分
    @ApiModelProperty(value = "居住地行政区划", required = false)
    @JsonProperty(value = "ResidenceAdminDivision")
    private String residenceAdminDivision;

    // 汉语口音代码
    @ApiModelProperty(value = "汉语口音代码", required = false)
    @JsonProperty(value = "ChineseAccentCode")
    private String chineseAccentCode;

    // 职业类别代码
    @ApiModelProperty(value = "职业类别代码", required = false)
    @JsonProperty(value = "JobCategory")
    private String jobCategory;

    // 同行人脸数
    @ApiModelProperty(value = "同行人脸数", required = false)
    @JsonProperty(value = "AccompanyNumber")
    private Integer accompanyNumber;

    // 肤色
    @ApiModelProperty(value = "肤色", required = false)
    @JsonProperty(value = "SkinColor")
    private String skinColor;

    // 发型
    @ApiModelProperty(value = "发型", required = false)
    @JsonProperty(value = "HairStyle")
    private String hairStyle;

    // 发色
    @ApiModelProperty(value = "发色", required = false)
    @JsonProperty(value = "HairColor")
    private String hairColor;

    // 脸型
    @ApiModelProperty(value = "脸型", required = false)
    @JsonProperty(value = "FaceStyle")
    private String faceStyle;

    // 脸部特征
    @ApiModelProperty(value = "脸部特征", required = false)
    @JsonProperty(value = "FacialFeature")
    private String facialFeature;

    // 体貌特征
    @ApiModelProperty(value = "体貌特征", required = false)
    @JsonProperty(value = "PhysicalFeature")
    private String physicalFeature;

    // 口罩颜色
    @ApiModelProperty(value = "口罩颜色", required = false)
    @JsonProperty(value = "RespiratorColor")
    private String respiratorColor;

    // 帽子款式
    @ApiModelProperty(value = "帽子款式", required = false)
    @JsonProperty(value = "CapStyle")
    private String capStyle;

    // 帽子颜色
    @ApiModelProperty(value = "帽子颜色", required = false)
    @JsonProperty(value = "CapColor")
    private String capColor;

    // 眼镜款式
    @ApiModelProperty(value = "眼镜款式", required = false)
    @JsonProperty(value = "GlassStyle")
    private String glassStyle;

    // 眼镜颜色
    @ApiModelProperty(value = "眼镜颜色", required = false)
    @JsonProperty(value = "GlassColor")
    private String glassColor;

    // 是否驾驶员 0:否,1:是,2:不确定,
    @ApiModelProperty(value = "是否驾驶员 0:否,1:是,2:不确定,", required = false)
    @JsonProperty(value = "IsDriver")
    private Integer driver = 2;

    // 是否涉外人员 0:否,1是:,2:不确定,
    @ApiModelProperty(value = "是否涉外人员 0:否,1是:,2:不确定,", required = false)
    @JsonProperty(value = "IsForeigner")
    private Integer foreigner = 2;

    // 护照证件种类
    @ApiModelProperty(value = "护照证件种类", required = false)
    @JsonProperty(value = "PassportType")
    private String passportType;

    // 出入境人员类别代码
    @ApiModelProperty(value = "出入境人员类别代码", required = false)
    @JsonProperty(value = "ImmigrantTypeCode")
    private String immigrantTypeCode;

    // 是否涉恐人员 0:否,1是:,2:不确定
    @ApiModelProperty(value = "是否涉恐人员 0:否,1是:,2:不确定", required = true)
    @JsonProperty(value = "IsSuspectedTerrorist")
    private Integer suspectedTerrorist = 2;

    // 涉恐人员编号
    @ApiModelProperty(value = "涉恐人员编号", required = false)
    @JsonProperty(value = "SuspectedTerroristNumber")
    private String suspectedTerroristNumber;

    // 是否涉案人员 0:否,1是:,2:不确定,
    @ApiModelProperty(value = "是否涉案人员 0:否,1是:,2:不确定,", required = true)
    @JsonProperty(value = "IsCriminalInvolved")
    private Integer criminalInvolved = 2;

    // 涉案人员专长代码
    @ApiModelProperty(value = "涉案人员专长代码", required = false)
    @JsonProperty(value = "CriminalInvolvedSpecilisationCode")
    private String criminalInvolvedSpecilisationCode;

    // 体表特殊标记
    @ApiModelProperty(value = "体表特殊标记", required = false)
    @JsonProperty(value = "BodySpeciallMark")
    private String bodySpeciallMark;

    // 作案手段
    @ApiModelProperty(value = "作案手段", required = false)
    @JsonProperty(value = "CrimeMethod")
    private String crimeMethod;

    // 作案特点代码
    @ApiModelProperty(value = "作案特点代码", required = false)
    @JsonProperty(value = "CrimeCharacterCode")
    private String crimeCharacterCode;

    // 在逃人员编号
    @ApiModelProperty(value = "在逃人员编号", required = false)
    @JsonProperty(value = "EscapedCriminalNumber")
    private String escapedCriminalNumber;

    // 是否在押人员 0:否,1:是,2:不确定,
    @ApiModelProperty(value = "是否在押人员 0:否,1:是,2:不确定,", required = false)
    @JsonProperty(value = "IsDetainees")
    private Integer detainees = 2;

    // 看守所编码
    @ApiModelProperty(value = "看守所编码", required = false)
    @JsonProperty(value = "DetentionHouseCode")
    private String detentionHouseCode;

    // 在押人员身份
    @ApiModelProperty(value = "在押人员身份", required = false)
    @JsonProperty(value = "DetaineesIdentity")
    private String detaineesIdentity;

    // 在押人员特殊身份
    @ApiModelProperty(value = "在押人员特殊身份", required = false)
    @JsonProperty(value = "DetaineesSpecialIdentity")
    private String detaineesSpecialIdentity;

    // 成员类型代码
    @ApiModelProperty(value = "成员类型代码", required = false)
    @JsonProperty(value = "MemberTypeCode")
    private String memberTypeCode;

    // 是否被害人 0:否,1是:,2:不确定
    @ApiModelProperty(value = "是否被害人 0:否,1是:,2:不确定", required = true)
    @JsonProperty(value = "IsVictim")
    private Integer victim = 2;

    // 被害人种类
    @ApiModelProperty(value = "被害人种类", required = false)
    @JsonProperty(value = "VictimType")
    private String victimType;

    // 受伤害程度
    @ApiModelProperty(value = "受伤害程度", required = false)
    @JsonProperty(value = "InjuredDegree")
    private String injuredDegree;

    // 尸体状况代码
    @ApiModelProperty(value = "尸体状况代码", required = false)
    @JsonProperty(value = "CorpseConditionCode")
    private String corpseConditionCode;

    // 是否可疑人 0:否,1是:,2:不确定
    @ApiModelProperty(value = "是否可疑人 0:否,1是:,2:不确定", required = true)
    @JsonProperty(value = "IsSuspiciousPerson")
    private Integer suspiciousPerson = 2;

    /**
     * 姿态分布1：平视； 2：微仰； 3：微俯； 4：左微侧脸； 5： 左斜侧脸； 6：左全侧脸； 7：右微侧脸； 8：右 斜侧脸； 9：右全侧脸
     */
    @ApiModelProperty(
            value = "姿态分布1：平视； 2：微仰； 3：微俯； 4：左微侧脸； 5： 左斜侧脸； 6：左全侧脸； 7：右微侧脸； 8：右 斜侧脸； 9：右全侧脸",
            required = false)
    @JsonProperty(value = "Attitude")
    private Integer attitude;

    // 相似度[0,1]
    @ApiModelProperty(value = "相似度[0,1]", required = false)
    @JsonProperty(value = "Similaritydegree")
    private Double similarityDegree;

    /**
     * 眉形1：上扬眉； 2：一字眉； 3：八字眉； 4：淡眉 毛 5：浓眉毛； 6：弯眉； 7：细眉； 8：短眉毛； 9：特殊眉； * 有多个特征时用英文半角分 号” ;” 分隔
     */
    @ApiModelProperty(
            value = " 眉形1：上扬眉； 2：一字眉； 3：八字眉； 4：淡眉 毛 5：浓眉毛； 6：弯眉； 7：细眉； 8：短眉毛； 9：特殊眉；     * 有多个特征时用英文半角分 号” ;” 分隔",
            required = false)
    @JsonProperty(value = "EyebrowStyle")
    private String eyebrowStyle;

    /**
     * 鼻形1：普通鼻； 2：扁鼻子； 3：尖鼻子； 4：朝天 鼻； 5：鹰钩鼻； 6：蒜头鼻； 7：宽鼻子； 8： 小鼻子； 9：露孔鼻； 10：特殊鼻； 有多个特 征时用英文半角分号”;”分隔
     */
    @ApiModelProperty(
            value = " 鼻形1：普通鼻； 2：扁鼻子； 3：尖鼻子； 4：朝天 鼻； 5：鹰钩鼻； 6：蒜头鼻； 7：宽鼻子； 8： 小鼻子； 9：露孔鼻； 10：特殊鼻； 有多个特 征时用英文半角分号”;”分隔",
            required = false)
    @JsonProperty(value = "NoseStyle")
    private String noseStyle;

    /**
     * 胡型1：一字胡； 2：八字胡； 3：淡胡子； 4：络腮 胡； 5：山羊胡； 6：花白胡； 7：一点胡
     */
    @ApiModelProperty(value = "胡型1：一字胡； 2：八字胡； 3：淡胡子； 4：络腮 胡； 5：山羊胡； 6：花白胡； 7：一点胡", required = false)
    @JsonProperty(value = "MustacheStyle")
    private String mustacheStyle;

    /**
     * 嘴唇 1：常见嘴； 2：厚嘴唇； 3：薄嘴唇； 4：厚嘴 巴； 5：上翘嘴； 6：下撇嘴； 7：凸嘴； 8：凹 嘴； 9：露齿嘴； 10：小嘴； 有多个特征时用 英文半角分号” ;” 分隔
     */
    @ApiModelProperty(value = "嘴唇 1：常见嘴； 2：厚嘴唇； 3：薄嘴唇； 4：厚嘴 巴； 5：上翘嘴； 6：下撇嘴； 7：凸嘴； 8：凹 嘴； 9：露齿嘴；\n"
            + "   * 10：小嘴； 有多个特征时用 英文半角分号” ;” 分隔", required = false)
    @JsonProperty(value = "LipStyle")
    private String lipStyle;

    /**
     * 皱纹眼袋 1：抬头纹； 2：左眼角纹； 3：右眼角纹； 4： 眉间纹； 5：左眼纹； 6：右眼纹； 7：眼袋； 8： 左笑纹； 9：右笑纹； 10：鼻间纹；
     * 11：左瘦纹；12：右瘦纹；有多个特征时用英文半角分 号” ;” 分隔
     */
    @ApiModelProperty(
            value = "皱纹眼袋 1：抬头纹； 2：左眼角纹； 3：右眼角纹； 4： 眉间纹； 5：左眼纹； 6：右眼纹； 7：眼袋； 8： 左笑纹； 9：右笑纹；\n"
                    + "   * 10：鼻间纹； 11：左瘦纹；12：右瘦纹；有多个特征时用英文半角分 号” ;” 分隔",
            required = false)
    @JsonProperty(value = "WrinklePouch")
    private String wrinklePouch;

    /**
     * 痤疮色斑 1：痤疮（单）； 2：痤疮（少）； 3：痤疮（多）； 4：雀斑（稀）； 5：雀斑（少）； 6：雀斑（多）； 7：色斑； 有多个特征时用英文半角分号” ;” 分隔
     */
    @ApiModelProperty(value = "痤疮色斑 1：痤疮（单）； 2：痤疮（少）； 3：痤疮（多）； 4：雀斑（稀）； 5：雀斑（少）； 6：雀斑（多）； 7：色斑；\n"
            + "   * 有多个特征时用英文半角分号” ;” 分隔", required = false)
    @JsonProperty(value = "AcneStain")
    private String acneStain;

    /**
     * 黑痣胎记 1：痣（小）； 2：痣（中）； 3：痣（大）； 4：黑 痣（小）； 5：黑痣（中）； 6：黑痣（大）； 7： 胎记； 有多个特征时用英文半角分号” ;” 分 隔
     */
    @ApiModelProperty(
            value = "黑痣胎记 1：痣（小）； 2：痣（中）； 3：痣（大）； 4：黑 痣（小）； 5：黑痣（中）； 6：黑痣（大）； 7： 胎记;有多个特征时用英文半角分号” ;” 分 隔",
            required = false)
    @JsonProperty(value = "FreckleBirthmark")
    private String freckleBirthmark;

    /**
     * 疤痕酒窝 1：疤痕； 2：酒窝左； 3：酒窝右； 有多个特 征时用英文半角分号” ;” 分隔
     */
    @ApiModelProperty(value = "疤痕酒窝 1：疤痕； 2：酒窝左； 3：酒窝右； 有多个特 征时用英文半角分号” ;” 分隔", required = false)
    @JsonProperty(value = "ScarDimple")
    private String scarDimple;

    /**
     * 其他特征 1：酒渣鼻（小）； 2：酒渣鼻（大）； 3：酒渣鼻 （重）； 4：招风耳左； 5：招风耳右； 6：大耳 朵左； 7：大耳朵右； 8：粗糙皮肤； 9：白癜风
     * 小；10：白癜风中；11：白癜风大； 有多个特征时用英文半角分号” ;” 分隔
     */
    @ApiModelProperty(value = "其他特征 1：酒渣鼻（小）； 2：酒渣鼻（大）； 3：酒渣鼻 （重）； 4：招风耳左； 5：招风耳右； 6：大耳 朵左； 7：大耳朵右；\n"
            + "   * 8：粗糙皮肤； 9：白癜风 小；10：白癜风中；11：白癜风大； 有多个特征时用英文半角分号” ;” 分隔", required = false)
    @JsonProperty(value = "OtherFeature")
    private String otherFeature;

    // 图像列表
    // TODO 这个和1400标准有出入
    @ApiModelProperty(value = "图像列表", required = false)
    @JsonProperty(value = "SubImageList")
    // private SubImageList imageList;
    private SubImageList subImageList;

    // 拍摄时间
//  @ApiModelProperty(value = "拍摄时间", required = true)
//  @JsonProperty(value = "ShotTime", format = "yyyyMMddHHmmss")
//  @JsonFormat(pattern="yyyyMMddHHmmss")
//  private Date shotTime;

    // 特征值列表
    // @ApiModelProperty(value = "特征值列表", required = false)
    // @JsonProperty(value = "FeatureList")
    // private FeatureList featureList;

    // 厂家标签
//  @ApiModelProperty(value = "厂家标识", required = false)
//  @JsonProperty(value = "FactoryLogo")
//  private String factoryLogo;

    // 聚类分组标签
//  @ApiModelProperty(value = "聚类分组标签", required = false)
//  @JsonProperty(value = "Mark")
//  private String mark;

    // 位置标记时间
//  @ApiModelProperty(value = "标记时间", required = false)
//  @JsonProperty(value = "MarkTime", format = "yyyyMMddHHmmss")
//  @JsonFormat(pattern="yyyyMMddHHmmss")
//  private Date markTime;

    // 算法厂商
//  @ApiModelProperty(value = "算法厂家，1旷视，2云从，3依图", required = false)
//  @JsonProperty(value = "MarkSource")
//  private String markSource = "1";

    // 人脸质量分数
//  @ApiModelProperty(value = "人脸质量分，0-100", required = false)
//  @JsonProperty(value = "FaceScore")
//  private Integer faceScore;

    // 附属物
//  @ApiModelProperty(value = "附属物", required = false)
//  @JsonProperty(value = "Appendant")
//  private String appendant;

    // 归属分类标签标识 库id??
//  @ApiModelProperty(value = "归属分类标签标识", required = false)
//  @JsonProperty(value = "LabFrom")
//  private String tabId;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Face other = (Face) obj;
        if (faceId == null) {
            if (other.faceId != null)
                return false;
        } else if (!faceId.equals(other.faceId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((faceId == null) ? 0 : faceId.hashCode());
        return result;
    }
}
