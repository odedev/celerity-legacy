package dev.odes.celerity.app.main.config;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.support.config.FastJsonConfig;
import com.alibaba.fastjson2.support.spring6.http.converter.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;

/**
 * package: dev.odes.celerity.app.main.config
 * class: WebMvcConfigurer
 * date: 2023/4/24 23:49
 * version: 1.0.0
 * description:
 */
@Configuration
@EnableWebMvc
public class WebConfigurer implements WebMvcConfigurer {

  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    WebMvcConfigurer.super.configureMessageConverters(converters);
    FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
    //自定义配置...
    FastJsonConfig config = new FastJsonConfig();
    config.setDateFormat("yyyy-MM-dd HH:mm:ss");
    config.setReaderFeatures(JSONReader.Feature.FieldBased, JSONReader.Feature.SupportArrayToBean);
    config.setWriterFeatures(JSONWriter.Feature.WriteMapNullValue, JSONWriter.Feature.PrettyFormat);
    converter.setFastJsonConfig(config);
    converter.setDefaultCharset(StandardCharsets.UTF_8);
    converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));
    converters.add(0, converter);
  }
}
