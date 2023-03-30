package dev.odes.celerity.common.utils;

import java.util.UUID;

public class IDUtils {

  public static String getUUID() {
    String uuid = String.valueOf(UUID.randomUUID());
    return uuid.replaceAll("-", "");
  }

}
