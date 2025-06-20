package designPattern;

public class test {
	public static void main(String[] args)
	{
		DocumentFactory WordFactory = new WordDocumentFactory();
        document word= WordFactory.CreateDocument();
        word.read();
        DocumentFactory PdfFactory = new PdfDocumentFactory();
        document pdf= PdfFactory.CreateDocument();
        pdf.read();
        DocumentFactory ExcelFactory = new ExcelDocumentFactory();
        document excel= ExcelFactory.CreateDocument();
        pdf.read();
	}

}
