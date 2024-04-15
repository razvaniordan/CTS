package ro.ase.cts.composite;

public class Ex1 {

	public static void main(String[] args) {
		// Creating files
		File file1 = new File("File1.txt");
		File file2 = new File("File2.docx");
		File file3 = new File("File3.pdf");
		// Creating the root directory
		Directory rootDirectory = new Directory("RootDirectory");
		
		// Adding files to the root directory
		rootDirectory.addItem(file1);
		rootDirectory.addItem(file2);
		
		// Creating a sub-directory
		Directory subDirectory = new Directory("SubDirectory");
		
		// Adding a file to the sub-directory
		subDirectory.addItem(file3);
		
		// Adding the sub-directory to the root directory
		rootDirectory.addItem(subDirectory);
		
		// Printing the contents of the root directory
		rootDirectory.printName();
	}

}
