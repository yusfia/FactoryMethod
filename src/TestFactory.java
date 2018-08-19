
public class TestFactory {

	public static void main(String[] args) {
		DisplayService service;
		
		service = new DailyReportDisplay();
		service.display();
		
		service = new MonthlyReportDisplay();
		service.display();
		
		service = new YearlyReportDisplay();
		service.display();
	}
	
}
