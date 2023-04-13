package dev.odes.celerity.common.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class IDUtils {

  public static String getUUID() {
    String uuid = String.valueOf(UUID.randomUUID());
    return uuid.replaceAll("-", "");
  }

  public static List<String> getUUID(Integer number) {
    List<String> ids = new ArrayList<>();
    for (int i = 0; i < number; i++) {
      ids.add(getUUID());
    }
    return ids;
  }

}
