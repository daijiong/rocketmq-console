//package org.apache.rocketmq.console.config;
//
//import io.micrometer.core.instrument.MeterRegistry;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * 监控指标配置
// *
// * @author daijiong
// * @version : MethricsConfig.java, v 0.1 2021/3/24 15:13 daijiong Exp $$
// */
//@Configuration
//public class MetricsConfig {
//
//    @Bean
//    MeterRegistryCustomizer<MeterRegistry> configurer(
//            @Value("${spring.application.name}") String applicationName) {
//        return (registry) -> registry.config().commonTags("application", applicationName);
//    }
//}
