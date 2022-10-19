
public class ExcelDocument extends Document {

	@Override
	public void open() {
		System.out.println("Open Excel Document");
		
	}

	@Override
	public void close() {
		System.out.println("Close Excel Document");
		
	}

	@Override
	public void save() {
		System.out.println("Save Excel Document");
		
	}

	@Override
	public void revert() {
		System.out.println("Revert Excel Document");
		
	}

}
