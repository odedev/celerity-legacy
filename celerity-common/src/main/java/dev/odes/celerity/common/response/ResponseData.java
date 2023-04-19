package dev.odes.celerity.common.response;


public class ResponseData {
  private String title;
  private String message;
  private Integer code;
  private Boolean isOk;
  private Object data;

  public ResponseData(Object data) {
    this.setTitle("");
    this.setMessage("");
    this.setCode(200);
    this.setIsOk(true);
    this.setData(data);
  }

  public ResponseData(String title, String message) {
    this.setTitle(title);
    this.setMessage(message);
    this.setCode(200);
    this.setIsOk(true);
    this.setData(null);
  }

  public ResponseData(String title, String message, Object data) {
    this.setTitle(title);
    this.setMessage(message);
    this.setCode(200);
    this.setIsOk(true);
    this.setData(data);
  }

  public ResponseData(String title, String message, Integer code) {
    this.setTitle(title);
    this.setMessage(message);
    this.setCode(code);
    this.setIsOk(true);
    this.setData(null);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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

  public Boolean getIsOk() {
    return isOk;
  }

  public void setIsOk(Boolean ok) {
    isOk = ok;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }
}
