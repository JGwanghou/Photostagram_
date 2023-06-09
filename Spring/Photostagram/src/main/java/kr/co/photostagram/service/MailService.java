package kr.co.photostagram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Message.RecipientType;

import java.util.Random;

@Service
public class MailService {

    @Autowired
    private JavaMailSender emailSender;
    public int ePw;

    // 6자리 랜덤 코드 생성
    public static int createKey() {
        Random r = new Random();
        int checkNum = r.nextInt(888888) + 111111;
        System.out.println("인증번호 : " + checkNum);
        return checkNum;
    }

    // 이메일 양식
    private MimeMessage createMessage(String to)throws Exception{
        ePw = createKey();
        System.out.println("보내는 대상 : "+ to);
        System.out.println("인증 번호 : "+ePw);
        MimeMessage message = emailSender.createMimeMessage();

        message.addRecipients(RecipientType.TO, to); // 보내는 대상
        message.setSubject("Photostagram 이메일 인증"); // 제목

        String msgg="";
        msgg+= "<div style='margin:20px;'>";
        msgg+= "<h1> Photostagram </h1>";
        msgg+= "<br>";
        msgg+= "<p>아래 코드를 복사해 입력해주세요<p>";
        msgg+= "<br>";
        msgg+= "<p>감사합니다.<p>";
        msgg+= "<br>";
        msgg+= "<div align='center' style='border:1px solid black; font-family:verdana';>";
        msgg+= "<h3 style='color:blue;'>회원가입 인증 코드입니다.</h3>";
        msgg+= "<div style='font-size:130%'>";
        msgg+= "CODE : <strong>";
        msgg+= ePw+"</strong><div><br/> ";
        msgg+= "</div>";
        message.setText(msgg, "utf-8", "html");//내용
        message.setFrom(new InternetAddress("wlsdndi2328@gmail.com","photostagram"));//보내는 사람

        return message;
    }

    // 이메일 코드 보내는 메서드
    public int sendEmail(String to) throws Exception{
        MimeMessage message = createMessage(to);
        try{
            emailSender.send(message);
        }catch(MailException es){
            es.printStackTrace();
            throw new IllegalArgumentException();
        }
        return ePw;
    }

    //////////////////////////////////////



}
