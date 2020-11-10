package kr.co.gdu.cashapi.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExcelController {
	@GetMapping(path = "/cashListExcel", produces = "application/vnd.ms-excel") // produces : 파일 타입 .html .jsp .xls
	public String cashListExcel() {
		// CashListExcel.java의 @Component("cashListExcel")
		return "cashListExcel";
	}
}
