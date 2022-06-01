package cn.leithda.wework.sdk.service.media;

import cn.leithda.wework.sdk.enums.MediaTypeEnum;
import cn.leithda.wework.sdk.po.media.UploadImageResponse;
import cn.leithda.wework.sdk.po.media.UploadResponse;
import cn.leithda.wework.sdk.service.BaseWeworkService;
import cn.leithda.wework.sdk.utils.HttpUtils;
import cn.leithda.wework.sdk.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

/**
 * 素材管理
 *
 * @author leithda
 * @since 2022/6/1
 */
@Service
public class WeworkMediaService extends BaseWeworkService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WeworkMediaService.class);
    /**
     * 上传临时素材
     */
    public static final String UPLOAD_URL = "https://qyapi.weixin.qq.com/cgi-bin/media/upload?access_token=%s&type=%s";
    /**
     * 上传图片
     */
    public static final String UPLOAD_IMAGE_URL = "https://qyapi.weixin.qq.com/cgi-bin/media/uploadimg?access_token=%s";


    /**
     * 上传临时素材
     *
     * @param corpId    企业ID
     * @param mediaType 媒体类型 {@link MediaTypeEnum}
     * @param fileName  文件名称
     * @param fileUrl   文件地址
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90253">上传临时素材</a>
     */
    public UploadResponse upload(String corpId, MediaTypeEnum mediaType, String fileName, String fileUrl) {
        try {
            String accessToken = getAccessToken(getSecretType(), corpId, null, false);
            String url = String.format(UPLOAD_URL, accessToken, mediaType.getType());
            byte[] bytes = HttpUtils.byteGet(fileUrl);
            String responseText = HttpUtils.uploadWeworkSource(url, fileName, bytes);
            return JsonUtils.toObject(responseText, UploadResponse.class);
        } catch (Exception e) {
            LOGGER.error("upload", e);
        }
        return null;
    }

    /**
     * 上传图片
     *
     * @param corpId   企业ID
     * @param fileName 文件名称
     * @param fileUrl  文件地址
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90256">上传图片</a>
     */
    public UploadImageResponse uploadImage(String corpId, String fileName, String fileUrl) {
        try {
            String accessToken = getAccessToken(getSecretType(), corpId, null, false);
            String url = String.format(UPLOAD_IMAGE_URL, accessToken);
            byte[] bytes = HttpUtils.byteGet(fileUrl);
            String responseText = HttpUtils.uploadWeworkSource(url, fileName, bytes);
            return JsonUtils.toObject(responseText, UploadImageResponse.class);
        } catch (Exception e) {
            LOGGER.error("uploadImage", e);
        }
        return null;
    }


    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }
}
