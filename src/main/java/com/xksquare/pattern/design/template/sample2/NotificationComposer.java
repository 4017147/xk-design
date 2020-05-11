package com.xksquare.pattern.design.template.sample2;

import java.util.List;

import org.stringtemplate.v4.ST;

public abstract class NotificationComposer {

  private static final char BEGIN_VARIABLE = '$';
  
  private static final char END_VARIABLE = '$';

  protected String template;

  public NotificationComposer(String template, VariableContext context) {
    this.template = template;
    setup(context);
  }

  protected void setup(VariableContext context) {}

  public Notification compose() {
    String from = this.renderFrom();
    String to = this.renderTo();
    String subject = this.renderSubject();
    String body = this.renderBody();
    return new Notification(from, to, subject, body);
  }


  public abstract String renderFrom();

  public abstract String renderTo();

  public abstract String renderSubject();

  private String renderBody() {
    List<TemplateVariable> variables = registerVariables();
    ST st = new ST(template, BEGIN_VARIABLE, END_VARIABLE);
    for (TemplateVariable variable : variables) {
      st.add(variable.name(), variable.value());
    }
    return st.render();
  }

  public abstract List<TemplateVariable> registerVariables();
}
