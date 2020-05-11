package com.xksquare.pattern.design.template.sample2;

public enum MailTemplateType {
  
  NORMAL {
    public NotificationComposer composer(String template, VariableContext context) {
      return new NormalNotificationComposer(template, context);
    }
  };

  abstract NotificationComposer composer(String template, VariableContext context);


}
