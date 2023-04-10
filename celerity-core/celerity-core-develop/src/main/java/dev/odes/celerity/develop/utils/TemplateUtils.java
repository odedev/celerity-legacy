package dev.odes.celerity.develop.utils;

import dev.odes.celerity.develop.constant.TemplateConstant;

import java.io.File;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class TemplateUtils {
  public static final Map<String, String> TEMPLATE_FILE = new HashMap<>(
    Map.ofEntries(
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_ENTITY, getVMPath("entity.java.vm")),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_MODEL, getVMPath("model.java.vm")),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_METADATA, getVMPath("metadata.java.vm")),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_CONTROLLER, getVMPath("controller.java.vm")),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_SERVICE, getVMPath("service.java.vm")),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_REPOSITORY, getVMPath("repository.java.vm")),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_PERSISTENCE, getVMPath("persistence.java.vm")),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_MAPPER, getVMPath("mapper.java.vm"))
    )
  );

  public static final Map<String, String> TARGET_DIR = new HashMap<>(
    Map.ofEntries(
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_ENTITY, "entity"),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_MODEL, "model"),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_METADATA, "metadata"),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_CONTROLLER, "controller"),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_SERVICE, "service"),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_REPOSITORY, "repository"),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_PERSISTENCE, "persistence"),
      new AbstractMap.SimpleEntry<>(TemplateConstant.TARGET_MAPPER, "mapper")
    )
  );

  public static Map<String, String> getTemplateFile() {
    return TEMPLATE_FILE;
  }

  public static Map<String, String> getTargetDir() {
    return TARGET_DIR;
  }

  public static String getVMPath(String fileName) {
    return TemplateConstant.TEMPLATE_DIR + File.separator + fileName;
  }

  public static String getFilePath(String entityCode, String fileName) {
    return TemplateConstant.ROOT_PATH + File.separator + TemplateConstant.DOMAIN_PATH + File.separator + entityCode.toLowerCase() + File.separator + entityCode + fileName;
  }

}
