package kr.co.gdu.cashapi.restcontroller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.gdu.cashapi.service.CashStatsService;

@RestController
public class CashStatsRestController {
	@Autowired CashStatsService cashStatsService;
	
	@GetMapping("/totalOfMonthByYear")
	public Map<String, Object> totalOfMonthByYear() {
		Map<String, Object> map = cashStatsService.getTotalOfMonthByYear();
		// @RestController때문에 리턴객체를 JSON 문자열로 변경
		return map; 
	}
}
