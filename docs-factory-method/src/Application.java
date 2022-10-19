
public abstract class Application {
	
	public abstract Document createDocument();
	
	public void newDocument() {
		Document d = createDocument();
		d.open();
		d.close();
		d.save();
		d.revert();
	}
	
}
