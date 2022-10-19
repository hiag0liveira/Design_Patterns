
public class ExcelApplication extends Application{

	@Override
	public Document createDocument() {
		return new ExcelDocument();
	}	

}
