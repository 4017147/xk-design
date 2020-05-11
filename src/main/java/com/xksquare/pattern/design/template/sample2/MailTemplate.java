package com.xksquare.pattern.design.template.sample2;

import java.util.UUID;

public class MailTemplate {

  private String templateId;

  private String template;

  private MailTemplateType templateType;

  public MailTemplate(String template, MailTemplateType templateType) {
    super();
    this.templateId = UUID.randomUUID().toString();
    this.template = template;
    this.templateType = templateType;
  }

  public Notification compose(VariableContext context) {
    NotificationComposer composer = templateType.composer(template, context);
    return composer.compose();
  }



}
