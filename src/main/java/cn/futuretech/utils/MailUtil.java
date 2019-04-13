package cn.futuretech.utils;

/**
 * 邮件发送的工具类
 */
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.sun.mail.util.MailSSLSocketFactory;

public class MailUtil implements Runnable {
	/* =========收件人的信息========== */
	private String email;// 收件人邮箱
	private String code;// 激活码
	/* =========初始化=============== */

	public MailUtil(String email, String code) {
		this.email = email;
		this.code = code;
	}
	@Override
	public void run() {
		// 收件人电子邮箱

        // 发件人电子邮箱
        //String from = "sk308269317@gmail.com";

        // 指定发送邮件的主机为 localhost
        String host = "smtp.qq.com";

        // 获取系统属性
        Properties properties = System.getProperties();

        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", "587");
        

        properties.put("mail.smtp.auth", "true");
        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("1106769044@qq.com", "jklumrtajbndidaf"); //发件人邮件用户名、授权码
            }
        });

        try {
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 头部头字段
            message.setFrom(new InternetAddress("1106769044@qq.com"));

            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(email));

            // Set Subject: 头部头字段
            message.setSubject("验证码");

            // 设置消息体
            message.setText("您的验证码为: " + code);

            // 发送消息
            Transport.send(message);
            System.out.println("Sent message successfully....");
         
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
      
		
	}

	
}