package cn.leithda.wework.sdk.utils;

/**
 * 字符串工具类
 *
 * @author leithda
 */
public class StringUtils extends org.springframework.util.StringUtils {

    /**
     * 判断字符串非空
     *
     * @param str 字符串
     * @return true=字符串非空，false=字符串为空
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 判断字符串是否为空
     *
     * @param str 字符串
     * @return true=字符串为空
     */
    public static boolean isEmpty(String str) {
        return !hasLength(str);
    }

    /**
     * 首字母小写
     *
     * @param str 字符串
     * @return 首字母小写字符串
     */
    public static String lowerFirst(String str) {
        char[] chars = str.toCharArray();
        if (chars[0] >= 'A' && chars[0] <= 'Z') {
            chars[0] += 32;
        }
        return String.valueOf(chars);
    }

}
