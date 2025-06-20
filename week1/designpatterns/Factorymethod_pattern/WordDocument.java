package designPattern;

class WordDocument implements document {
	public void read()
	{
		System.out.println("reading Word document");
	}
}
class PdfDocument implements document{
	public void read()
	{
		System.out.println("reading Pdf document");	
	}
}
 class ExcelDocument implements document{
	public void read()
	{
		System.out.println("reading Excel document");	
	}
}
 abstract class DocumentFactory{
	public abstract document CreateDocument();
}
class WordDocumentFactory extends DocumentFactory{
	public document CreateDocument() {
	        return new WordDocument();
	    }
}
class PdfDocumentFactory extends DocumentFactory{
	public document CreateDocument() {
	        return new PdfDocument();
	    }
}
class ExcelDocumentFactory extends DocumentFactory{
	public document CreateDocument() {
	        return new ExcelDocument();
	    }
}
	
	
