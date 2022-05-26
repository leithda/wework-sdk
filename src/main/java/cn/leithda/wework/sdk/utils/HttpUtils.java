package cn.leithda.wework.sdk.utils;

import okhttp3.*;

import java.io.IOException;

/**
 * Http 工具类
 */
public final class HttpUtils {

    private static final OkHttpClient client = new OkHttpClient();

    public static final MediaType JSON
            = MediaType.get("application/json; charset=utf-8");

    /**
     * GET
     *
     * @param url URL
     * @return 响应
     * @throws IOException 异常
     */
    public static String get(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    /**
     * POST
     *
     * @param url  url
     * @param json postbody 数据
     * @return 响应
     * @throws IOException 异常
     */
    public static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

}
