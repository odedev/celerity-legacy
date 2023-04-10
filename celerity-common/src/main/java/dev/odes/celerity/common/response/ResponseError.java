package dev.odes.celerity.common.response;

public class ResponseError {
  private Object error;
  private String message;
  private Integer code;
  private Boolean isOk;

  public ResponseError(Object error) {
    this.error = error;
    this.message = null;
    this.code = 400;
    this.isOk = false;
  }

  public ResponseError(String message) {
    this.error = null;
    this.message = message;
    this.code = 400;
    this.isOk = false;
  }

  public ResponseError(Object error, String message) {
    this.error = error;
    this.message = message;
    this.code = 400;
    this.isOk = false;
  }

  public Object getError() {
    return error;
  }

  public void setError(Object error) {
    this.error = error;
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
