package dev.odes.celerity.generator.template;

import org.apache.velocity.app.Velocity;

import java.util.Properties;

/**
 * package: dev.odes.celerity.generator.template
 * class: VelocityInitializer
 * date: 2023/3/30 21:40
 * version: 1.0.0
 * description:
 */
public class VelocityInitializer {
  private static final String ENCODING = "UTF8";

  public static void init() {
    try {
      Properties properties = new Properties();
      // 加载classpath目录下的vm文件
      properties.setProperty("resource.loader.file.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
      // 定义字符集
      properties.setProperty(Velocity.INPUT_ENCODING, ENCODING);
      properties.setProperty(Velocity.RUNTIME_LOG_NAME, "VelocityLog");

      // 初始化Velocity引擎，指定配置Properties
      Velocity.init(properties);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
