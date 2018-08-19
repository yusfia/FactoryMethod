
public abstract class DisplayService {
	public void display() {
		XMLParser xmlParser = getParser();
		String message = xmlParser.parse();
		System.out.println(message);
	}
	
	protected abstract XMLParser getParser();
}
