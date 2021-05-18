package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello world!";
	}
	@RequestMapping("/inha")
	public String inha(String param) {
		return param+"inha.ac.kr";
	}
	@RequestMapping("/name")
	public String name(String id) {
		return "당신의 학번은 "+id+"입니다.";
	}
	@RequestMapping("/num")
	public String num(String n) {
		return n+"*"+1+"="+Integer.parseInt(n)*1+" "
				+n+"*"+2+"="+Integer.parseInt(n)*2+" "
				+n+"*"+3+"="+Integer.parseInt(n)*3+" "
				+n+"*"+4+"="+Integer.parseInt(n)*4+" "
				+n+"*"+5+"="+Integer.parseInt(n)*5+" "
				+n+"*"+6+"="+Integer.parseInt(n)*6+" "
				+n+"*"+7+"="+Integer.parseInt(n)*7+" "
				+n+"*"+8+"="+Integer.parseInt(n)*8+" "
				+n+"*"+9+"="+Integer.parseInt(n)*9+" ";

	}
	
}
