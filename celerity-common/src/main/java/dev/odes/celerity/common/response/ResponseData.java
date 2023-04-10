package dev.odes.celerity.common.response;


public class ResponseData {
  private Object data;
  private String message;
  private Integer code;
  private Boolean isOk;

  public ResponseData(Object data) {
    this.data = data;
    this.message = null;
    this.code = 200;
    this.isOk = true;
  }

  public ResponseData(String message) {
    this.data = null;
    this.message = message;
    this.code = 200;
    this.isOk = true;
  }

  public ResponseData(Object data, String message) {
    this.data = data;
    this.message = message;
    this.code = 200;
    this.isOk = true;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Boolean getOk() {
    return isOk;
  }

  public void setOk(Boolean ok) {
    isOk = ok;
  }
}
