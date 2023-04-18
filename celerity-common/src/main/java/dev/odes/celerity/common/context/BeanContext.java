package dev.odes.celerity.common.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * package: dev.odes.celerity.common.context
 * class: BeanContext
 * date: 2023/4/18 22:17
 * version: 1.0.0
 * description:
 */
@Component
public class BeanContext implements ApplicationContextAware {
  private static ApplicationContext applicationContext;
  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    if (BeanContext.applicationContext == null) {
      BeanContext.applicationContext = applicationContext;
    }
  }

  public static ApplicationContext getApplicationContext() {
    return applicationContext;
  }

  public static Object getBean(String name) {
    try {
      return getApplicationContext().getBean(name);
    } catch (BeansException e) {
      return null;
    }
  }

  public static <T> T getBean(Class<T> clazz) {
    try {
      return getApplicationContext().<T>getBean(clazz);
    } catch (BeansException e) {
      return null;
    }
  }

  public static <T> T getBean(String name, Class<T> clazz) {
    try{
      return getApplicationContext().getBean(name, clazz);
    }
    catch (Exception e){
      return null;
    }
  }
}
