package com.teamnexters.mail;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teamnexters.util.JsonUtil;

@RestController
public class MailController {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@RequestMapping("/contact")
	public Map<String, Object> requestContact(@RequestParam("replyto") String strReplyto
											, @RequestParam("msg") String strMsg
											, @RequestParam("name") String strName
											, @RequestParam(value="phone", required=false) String strPhone) {
		Map<String, Object> reqMap = new HashMap<String, Object>();
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo("teamnexters@gmail.com");
		mailMessage.setReplyTo(strReplyto);
		mailMessage.setFrom(strReplyto);
		mailMessage.setSubject("[CONTACT] "+strName+"님의 문의 요청입니다.");
		mailMessage.setText("연락처 : "+strPhone+"\n\n문의사항 : "+strMsg);
		javaMailSender.send(mailMessage);
		
		return JsonUtil.putSuccessJsonContainer(reqMap);
		
	}
}
