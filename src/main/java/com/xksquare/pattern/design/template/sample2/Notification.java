package com.xksquare.pattern.design.template.sample2;

import java.io.Serializable;

public class Notification implements Serializable {

  private String from;
  private String to;
  private String subject;
  private String body;

  public Notification(String from, String to, String subject, String body) {
    this.from = from;
    this.to = to;
    this.subject = subject;
    this.body = body;
  }

  @Override
  public String toString() {
    return "Notification [from=" + from + ", to=" + to + ", subject=" + subject + ", body=" + body
        + "]";
  }

}
