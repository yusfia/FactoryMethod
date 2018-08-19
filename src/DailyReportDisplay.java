
public class DailyReportDisplay extends DisplayService{

	@Override
	protected XMLParser getParser() {
		return new DailyReport();
	}
	
}
