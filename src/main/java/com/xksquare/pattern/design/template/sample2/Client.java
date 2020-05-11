package com.xksquare.pattern.design.template.sample2;

public class Client {

  public static void main(String[] args) {
    MailTemplate mailTemplate =
        new MailTemplate("ss$name$,$title$,$description$ sssssss", MailTemplateType.NORMAL);
    VariableContext context = new VariableContext();
    context.put("url", "www.baidu.com");
    context.put("title", "邮件模板");
    context.put("description", "使用Java模板方法写邮件模板发送!");
    Notification notification = mailTemplate.compose(context);
    System.out.println(notification);
  }

}
