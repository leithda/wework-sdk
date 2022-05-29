package cn.leithda.wework.sdk.utils;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * XML 工具类
 *
 * @author leithda
 * @since 2022/5/28
 */
public final class XmlUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(XmlUtils.class);

    private XmlUtils() {
    }

    /**
     * XML转换为Map（仅支持单层xml结构）
     *
     * @param xml xml
     * @return Map
     */
    public static Map<String, Object> xml2Map(final String xml) {
        Map<String, Object> map = new HashMap<>();

        try (InputStream inputStream = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8))) {
            SAXReader reader = new SAXReader();
            Document document = reader.read(inputStream);

            // 得到xml根元素
            org.dom4j.Element root = document.getRootElement();
            // 遍历
            @SuppressWarnings("unchecked")
            List<Element> elementList = root.elements();

            for (Element e : elementList) {
                map.put(StringUtils.lowerFirst(e.getName()), e.getText());
            }
        } catch (Exception e) {
            LOGGER.error("XmlUtils#parseXml", e);
        }
        return map;
    }

    /**
     * xml 转换为实体类（仅支持单层xml结构）
     *
     * @param xml    xml
     * @param tClass 实体类
     * @param <T>    实体类类型
     * @return 实体类对象
     */
    public static <T> T xml2Entity(final String xml, Class<T> tClass) {
        try {
            Map<String, Object> xmlMap = xml2Map(xml);
            String json = JsonUtils.toJson(xmlMap);
            return JsonUtils.toObject(json, tClass);
        } catch (Exception e) {
            LOGGER.error("XmlUtils#xml2Entity", e);
        }
        return null;
    }
}
