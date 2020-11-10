package kr.co.gdu.cashapi.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsView;

@Component("cashListExcel") // CashListExcel cashListExcel = new CashListExcel();
public class CashListExcel extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// 리스트를 가지고와 엑셀파일 생성
		
		// 응답 body의 내용을 파일로 전송(cash_list.xls)
		response.setHeader("Content-Disposition", "attachment; filename=\"cash_list.xls\"");
		// 매개변수로 입력받은 Workbook(엑셀파일객체)에 첫번째 Sheet를 접근
		Sheet sheet = workbook.createSheet("sheet1");
		Row row0 = sheet.createRow(0);
		Cell cell0 = row0.createCell(0);
		cell0.setCellValue("이름");
		Cell cell1 = row0.createCell(1);
		cell1.setCellValue("Goodee");
	}
	
}
