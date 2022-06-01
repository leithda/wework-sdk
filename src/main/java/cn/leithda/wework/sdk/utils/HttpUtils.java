package cn.leithda.wework.sdk.utils;

import okhttp3.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;

/**
 * Http 工具类
 *
 * @author leithda
 */
public final class HttpUtils {

    private static final OkHttpClient client = new OkHttpClient();

    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");

    public static final String LINE_END = "\r\n";

    /**
     * GET
     *
     * @param url URL
     * @return 响应
     * @throws IOException          通讯异常
     * @throws NullPointerException 响应异常
     */
    public static String get(String url) throws IOException, NullPointerException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        }
    }

    /**
     * GET
     *
     * @param url URL
     * @return 响应
     * @throws IOException          通讯异常
     * @throws NullPointerException 响应异常
     */
    public static byte[] byteGet(String url) throws IOException, NullPointerException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).bytes();
        }
    }

    /**
     * POST
     *
     * @param url  url
     * @param json postbody 数据
     * @return 响应
     * @throws IOException          通讯异常
     * @throws NullPointerException 响应异常
     */
    public static String post(String url, String json) throws IOException, NullPointerException {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        }
    }

    /**
     * 上传企业微信资源
     *
     * @param url      请求
     * @param fileName 文件名称
     * @param bytes    文件内容
     * @return 响应
     * @throws IOException          通讯异常
     * @throws NullPointerException 响应异常
     */
    public static String uploadWeworkSource(String url, String fileName, byte[] bytes) throws IOException, NullPointerException {
        String boundary = "----WeworkFormBoundary----";
        String requestBody = LINE_END
                + "--" + boundary + LINE_END
                + "Content-Disposition: from-data; name=\"media\"; filename=\"" + fileName + "\"" + LINE_END
                + "Content-Type: application/octet-stream " + LINE_END + LINE_END;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(requestBody.getBytes());
        if (Objects.nonNull(bytes)) {
            bos.write(bytes, 0, bytes.length);
        }
        bos.write((LINE_END + "--" + boundary + "--" + LINE_END).getBytes());

        Request request = new Request.Builder()
                .url(url)
                .addHeader("Content-Type", "multipart/form-data; boundary=" + boundary)
                .post(RequestBody.create(bos.toByteArray()))
                .build();

        try (Response response = client.newCall(request).execute()) {
            return Objects.requireNonNull(response.body()).string();
        }
    }

}
