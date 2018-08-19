
public class MonthlyReportDisplay extends DisplayService{

	@Override
	protected XMLParser getParser() {
		return new MonthlyReport();
	}
	
}
