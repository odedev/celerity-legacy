package dev.odes.celerity.develop.generator;

import dev.odes.celerity.develop.constant.Constant;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.util.Properties;

public class VelocityInitializer {
  public static void init() {
    try {
      Properties properties = new Properties();
      // 加载classpath目录下的vm文件
      properties.setProperty("resource.loader.file.class", ClasspathResourceLoader.class.getName());
//      properties.setProperty(Velocity.RESOURCE_LOADER_PATHS, ClasspathResourceLoader.class.getName());
//      properties.setProperty(Velocity.FILE_RESOURCE_LOADER_PATH, ClasspathResourceLoader.class.getName());
      // 定义字符集
      properties.setProperty(Velocity.ENCODING_DEFAULT, Constant.TEMPLATE_ENCODING);
      properties.setProperty(Velocity.INPUT_ENCODING, Constant.TEMPLATE_ENCODING);
      properties.setProperty(Velocity.RUNTIME_LOG_NAME, "VelocityLog");

      // 初始化Velocity引擎，指定配置Properties
      Velocity.init(properties);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
