package org.apache.rocketmq.console.interceptor;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.io.IOException;

/**
 * OkHttp日志拦截器
 *
 * @author daijiong
 * @version : OkHttpLogInterceptor.java, v 0.1 2021/4/7 18:18 daijiong Exp $$
 */
@Slf4j
public class OkHttpLogInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        //这个chain里面包含了request和response，所以你要什么都可以从这里拿
        Request request = chain.request();
        //请求发起的时间
        long t1 = System.nanoTime();
        log.info(String.format("【feign】【发送请求】地址：%s%n请求头：%s%n请求体：%s", request.url(), request.headers(), request.body()));
        Response response = chain.proceed(request);
        //收到响应的时间
        long t2 = System.nanoTime();
        //这里不能直接使用response.body().string()的方式输出日志
        //因为response.body().string()之后，response中的流会被关闭，程序会报错，我们需要创建出一个新的response给应用层处理
        ResponseBody responseBody = response.peekBody(1024 * 1024);
        log.info(String.format("【feign】【接收响应】地址：%s%n返回数据:%s%n耗时：%.1fms", response.request().url(), responseBody.string(), (t2 - t1) / 1e6d));
        return response;
    }
}
