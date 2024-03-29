//package org.apache.rocketmq.console.config;
//
//import feign.Feign;
//import okhttp3.ConnectionPool;
//import org.apache.rocketmq.console.interceptor.OkHttpLogInterceptor;
//import org.springframework.boot.autoconfigure.AutoConfigureBefore;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.cloud.openfeign.FeignAutoConfiguration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.concurrent.TimeUnit;
//
///**
// * OkHttp配置
// *
// * @author daijiong
// * @version : FeignOkHttpConfig.java, v 0.1 2021/4/7 18:16 daijiong Exp $$
// */
//@Configuration
//@ConditionalOnClass(Feign.class)
//@AutoConfigureBefore(FeignAutoConfiguration.class)
//public class FeignOkHttpConfig {
//
//    @Bean
//    public okhttp3.OkHttpClient okHttpClient() {
//        return new okhttp3.OkHttpClient.Builder()
//                //设置连接超时
//                .connectTimeout(60, TimeUnit.SECONDS)
//                //设置读超时
//                .readTimeout(60, TimeUnit.SECONDS)
//                //设置写超时
//                .writeTimeout(120, TimeUnit.SECONDS)
//                //是否自动重连
//                .retryOnConnectionFailure(true).connectionPool(new ConnectionPool()).addInterceptor(new OkHttpLogInterceptor())
//                //构建OkHttpClient对象
//                .build();
//    }
//
////    @Bean
////    public Contract feignContract() {
////        return new feign.Contract.Default();
////    }
//}
