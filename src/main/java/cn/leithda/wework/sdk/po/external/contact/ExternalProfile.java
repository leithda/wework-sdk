package cn.leithda.wework.sdk.po.external.contact;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * 客户对外信息
 *
 * @author leithda
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class ExternalProfile {
    /**
     * 属性列表，目前支持文本、网页、小程序三种类型
     */
    private List<ExternalAttr> external_attr;

    public List<ExternalAttr> getExternal_attr() {
        return external_attr;
    }

    public void setExternal_attr(List<ExternalAttr> external_attr) {
        this.external_attr = external_attr;
    }
}
