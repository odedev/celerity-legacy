package dev.odes.celerity.common.response;

public class ResponseError {
  private String title;
  private String message;
  private Integer status;
  private Boolean isOk;
  private Object error;

  public ResponseError(Object error) {
    this.setTitle("");
    this.setMessage("");
    this.setStatus(400);
    this.setIsOk(false);
    this.setError(error);
  }

  public ResponseError(String title, String message) {
    this.setTitle(title);
    this.setMessage(message);
    this.setStatus(400);
    this.setIsOk(false);
    this.setError(null);
  }

  public ResponseError(String title, String message, Object error) {
    this.setTitle(title);
    this.setMessage(message);
    this.setStatus(400);
    this.setIsOk(false);
    this.setError(error);
  }

  public ResponseError(String title, String message, Integer status) {
    this.setTitle(title);
    this.setMessage(message);
    this.setStatus(status);
    this.setIsOk(false);
    this.setError(null);
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

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Boolean getIsOk() {
    return isOk;
  }

  public void setIsOk(Boolean ok) {
    isOk = ok;
  }

  public Object getError() {
    return error;
  }

  public void setError(Object error) {
    this.error = error;
  }
}
