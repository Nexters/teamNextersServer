package com.teamnexters.recruit;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teamnexters.util.JsonUtil;

@RestController
public class RecruitController {
	private Scanner s;
	private static String recruit = null;
	private static String recruit_end = null;
	private static int target_date = 20160618;
	private static int target_final_date = 20160629;
	
	@RequestMapping("/recruit_init")
	public void Recruit_init() {
		recruit = null;
		recruit_end = null;
	}
	
	@RequestMapping("/recruit_target")
	public void Recruit_target(@RequestParam(value="target") int intTarget){
		target_date = intTarget;
	}
	
	@RequestMapping("/recruit")
	public Map<String, Object> Recruit(@RequestParam(value="isTest", required=false) String strTestYN) {
		Map<String, Object> reqMap = new HashMap<String, Object>();
		boolean isEnd = false;
		boolean isFinalEnd = false;

		ClassLoader classLoader = getClass().getClassLoader();
		File file = null;
		StringBuilder stringBuilder = new StringBuilder();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		String nowStringDate = df.format(new Date());

		if(target_date <= Integer.parseInt(nowStringDate))
			isEnd = true;
		
		if(target_final_date<=Integer.parseInt(nowStringDate))
			isFinalEnd=true;
		
		reqMap.put("isFinalEnd", isFinalEnd);
		reqMap.put("isEnd", isEnd);
		
		try {
			if((strTestYN != null &&"Y".equals(strTestYN)) ||  isEnd) {
				if(recruit_end != null) {
					reqMap.put("html", recruit_end);
					return JsonUtil.putSuccessJsonContainer(reqMap);
				}
				file = new File(classLoader.getResource("html/recruit_end.html").getFile());
			} else {
				if(recruit != null) {
					reqMap.put("html", recruit);
					return JsonUtil.putSuccessJsonContainer(reqMap);
				}
				file = new File(classLoader.getResource("html/recruit.html").getFile());
			}

			s = new Scanner(file);

			while (s.hasNextLine()) {
				String line = s.nextLine();
				stringBuilder.append(line).append("\n");
			}
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
		if((strTestYN != null &&"Y".equals(strTestYN)) ||  isEnd) {
			recruit_end = stringBuilder.toString();
		} else {
			recruit = stringBuilder.toString();
		}
		
		reqMap.put("html", stringBuilder.toString());
		
		return JsonUtil.putSuccessJsonContainer(reqMap);
	}
}
