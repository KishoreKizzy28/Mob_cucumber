package Com.helper;

public class File_Reader_Manager {
	

	public static File_Reader_Manager getInstanceFrm() {
		File_Reader_Manager frm = new File_Reader_Manager();
		return frm;
	}
	
	public Configuration_reader getInstanceCR() throws Throwable {
		Configuration_reader reader = new Configuration_reader(); 
		return reader;
	}
	
	
private File_Reader_Manager() {
		
	}

}
