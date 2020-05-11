package com.xksquare.pattern.design.template.sample2;

import java.util.ArrayList;
import java.util.List;

public class NormalNotificationComposer extends NotificationComposer {

  private String url;

  private String title;

  private String description;

  public NormalNotificationComposer(String template, VariableContext context) {
    super(template, context);
  }


  @Override
  protected void setup(VariableContext context) {
    this.url = context.get("url");
    this.title = context.get("title");
    this.description = context.get("description");
  }

  @Override
  public String renderFrom() {
    return "294384335@qq.com";
  }

  @Override
  public String renderTo() {
    return "4017147@qq.com";
  }

  @Override
  public String renderSubject() {
    return "mail 发生通知测试";
  }

  @Override
  public List<TemplateVariable> registerVariables() {
    List<TemplateVariable> variables = new ArrayList<>();
    variables.add(TemplateVariable.with("url", this.url));
    variables.add(TemplateVariable.with("title", this.title));
    variables.add(TemplateVariable.with("description", this.description));
    return variables;
  }



}
