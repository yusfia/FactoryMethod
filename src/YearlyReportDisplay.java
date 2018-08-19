
public class YearlyReportDisplay extends DisplayService{

	@Override
	protected XMLParser getParser() {
		return new YearlyReport();
	}
	
}
