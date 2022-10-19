
public class WordDocument extends Document {

	@Override
	public void open() {
			System.out.println("Open Word Document");
		
	}

	@Override
	public void close() {
		System.out.println("Close Word Document");
		
	}

	@Override
	public void save() {
		System.out.println("Save Word Document");
		
	}

	@Override
	public void revert() {
		System.out.println("Revert Word Document");
		
	}

}
