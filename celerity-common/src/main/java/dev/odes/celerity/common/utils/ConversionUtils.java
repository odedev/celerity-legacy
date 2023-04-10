package dev.odes.celerity.common.utils;


public class ConversionUtils {

  // byte[] 转16进制
  public static String bytesToHexString(byte[] src){
    if (src == null || src.length <= 0) {
      return null;
    }
    StringBuilder stringBuilder = new StringBuilder("");
    for (byte b : src) {
      int v = b & 0xFF;
      String hv = Integer.toHexString(v);
      if (hv.length() < 2) {
        stringBuilder.append(0);
      }
      stringBuilder.append(hv);
    }
    return stringBuilder.toString();
  }

  // 16进制字符串转byte[]
  public static byte[] hexStringToBytes(String hexString) {
    if (hexString == null || "".equals(hexString)) {
      return null;
    }
    hexString = hexString.toUpperCase();
    int length = hexString.length() / 2;
    char[] hexChars = hexString.toCharArray();
    byte[] d = new byte[length];
    for (int i = 0; i < length; i++) {
      int pos = i * 2;
      d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
    }
    return d;
  }

  private static byte charToByte(char c) {
    return (byte) "0123456789ABCDEF".indexOf(c);
  }


  static final byte[] HEX_TABLE = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
  static final char[] HEX_CHAR_TABLE = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

  // byte[] 转16进制
  public static String byte2HexString(byte[] data) {
    if (data == null || data.length == 0) {
      return null;
    }
    byte[] hex = new byte[data.length * 2];
    int index = 0;
    for (byte b : data) {
      int v = b & 255;
      hex[index++] = (byte) HEX_CHAR_TABLE[v >>> 4];
      hex[index++] = (byte) HEX_CHAR_TABLE[v & 15];
    }
    return new String(hex);
  }
  // 16进制转byte[]
  public static byte[] hex2Byte(String hexString) {
    if (hexString == null || hexString.length() == 0) {
      return null;
    }
    hexString = hexString.toUpperCase();
    if (hexString.length() % 2 != 0) {
      throw new RuntimeException();
    }

    byte[] data = new byte[hexString.length() / 2];
    char[] chars = hexString.toCharArray();

    for (int i = 0; i < hexString.length(); i += 2) {
      data[i / 2] = (byte) (HEX_TABLE[getHexCharValue(chars[i])] << 4 | HEX_TABLE[getHexCharValue(chars[i + 1])]);
    }
    return data;
  }

  private static int getHexCharValue(char c) {
    int index = 0;
    for (char c1 : HEX_CHAR_TABLE) {
      if (c == c1) {
        return index;
      }
      ++index;
    }
    return 0;
  }


  int[] bytes = {148, 180, 242, 180, 153, 72, 140, 216, 245, 232, 82, 235, 6, 196, 20, 215, 2, 40, 10, 2, 247, 15, 163, 201, 93, 203, 17, 142, 215, 6, 173, 89, 62, 90, 220, 77, 64, 34, 84, 18, 244, 42, 224, 43, 94, 135, 185, 165, 9, 247, 67, 247, 49, 7, 40, 10, 139, 92, 218, 182, 133, 235, 135, 230, 101, 165, 106, 0, 231, 54, 158, 102, 185, 101, 200, 61, 54, 182, 24, 203, 129, 94, 63, 135, 20, 136, 49, 248, 140, 193, 4, 84, 232, 224, 199, 180, 31};

  public String toHexString(int x){
    char[] arr = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'} ;
    StringBuilder builder = new StringBuilder();
    int y = x ;
    if(x < 0 ){
      y = -x ;
      builder.append("-0x");
    }
    else{
      builder.append("0x");
    }
    for(int i = 7 ; i >= 0 ; i -- ){
      int temp = (y >> (i * 4) & 0xf);//0-15，把移位后前面无用的的二进制数都转为0.
      builder.append(arr[temp]);
    }
    return builder.toString();
  }

  public static String encodeHexString(byte[] data) {
    StringBuilder sb = new StringBuilder();
    for (byte b : data) {
      sb.append(String.format("%02x", b));
    }

    return sb.toString();
  }

}
