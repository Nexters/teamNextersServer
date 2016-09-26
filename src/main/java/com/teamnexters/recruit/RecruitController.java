package com.teamnexters.recruit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
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
	private static String recurit_gener = null;
	private static String recruit_finalend = null;
	private static int target_date = 20160618;
	private static int target_final_date = 20160629;
	
	@RequestMapping("/recruit_init")
	public void Recruit_init() {
		recruit = null;
		recruit_end = null;
		recurit_gener = null;
		recruit_finalend = null;
	}
	
	@RequestMapping("/recruit_target")
	public void Recruit_target(@RequestParam(value="target") int intTarget){
		target_date = intTarget;
	}
	
	@RequestMapping("/recruit_file")
	public void Recruit_file() {
		String[] files = {"recruit_finalend","recruit_end", "recruit_gener", "recruit"};
		
		for(int i=0; i<files.length; i++) {
			System.out.println();
			System.out.println(files[i]);
			ClassLoader classLoader = getClass().getClassLoader();
			//File file = null;
			StringBuilder stringBuilder = new StringBuilder();
			System.out.println(classLoader.getResource("html/"+files[i]+".html").getPath());
			//file = new File(classLoader.getResource("html/"+files[i]+".html").getFile());

			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(classLoader.getResource("html/"+files[i]+".html").getPath()), "UTF-8"));
				while(true) {
					String line = br.readLine();
					if(line==null) break;
					stringBuilder.append(line).append("\n");
				}
				br.close();
				/*
				s = new Scanner(file);
			
				while (s.hasNextLine()) {
					String line = s.nextLine();
					stringBuilder.append(line).append("\n");
				}*/
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			
			System.out.println(stringBuilder.toString());
			
			//리크루트가 종료되었을 경우
			if("recruit_end".equals(files[i]))
				recruit_end = stringBuilder.toString();
			else if("recruit_gener".equals(files[i])) 
				recurit_gener = stringBuilder.toString();
			else if("recruit".equals(files[i]))
				recruit = stringBuilder.toString();
			
			//최종 종료되었을 경우
			else if("recruit_finalend".equals(files[i]))
				recruit_finalend = stringBuilder.toString();
			else
				System.out.println("Not Found");

			
		}
	}
	
	@RequestMapping("/recruit")
	public Map<String, Object> Recruit(@RequestParam(value="isTest", required=false) String strTestYN) {
		Map<String, Object> reqMap = new HashMap<String, Object>();
		boolean isEnd = false;
		boolean isFinalEnd = false;
		boolean isGener = false;
		String strHtml = "";
		
		
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		String nowStringDate = df.format(new Date());

		if(target_date <= Integer.parseInt(nowStringDate)){
			isEnd = true;
			strHtml = recruit_end;
		}
		
		if(target_final_date<=Integer.parseInt(nowStringDate)) {
			isFinalEnd=true;
			strHtml = recruit_finalend;
		}
		
		if(isEnd && isFinalEnd){
			isGener = true; 
			strHtml = recurit_gener;
		}
		
		if(!isEnd && !isFinalEnd) {
			strHtml = recruit;
		}
		
		reqMap.put("isFinalEnd", isFinalEnd);
		reqMap.put("isEnd", isEnd);
		reqMap.put("isGener", isGener);
		reqMap.put("html", strHtml);

				
		return JsonUtil.putSuccessJsonContainer(reqMap);
	}
}
