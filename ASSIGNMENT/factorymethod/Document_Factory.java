/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author HP
 */
public class Document_Factory 
{
     static Document getFile(int choice)
     {
         return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }

    /**
     *
     * @param FileType
     * @return
     */
    public static Document getfile(int FileType)
    { 
        // int FileType;
		/*if(FileType == null)
		{ 
			return null; 
		} 
		if(FileType.equalsIgnoreCase("EXCELFILE"))
		{ 
			return new ExcelFile(); 
		} 
		else if(FileType.equalsIgnoreCase("WORDFILE"))
		{ 
			return new WordFile(); 
		}
		else if(FileType.equalsIgnoreCase("PDFFILE"))
		{ 
			return new PdfFile(); 
		}
		/*else if(FileType.equalsIgnoreCase("TEXTFILE"))
		{ 
			return new TextFile(); 
		}*/
        if(FileType == 1)
        {
            return new Excel_File();
        } 
     /*   else if(FileType == 2)
        {
            return  new Word_File();
        }
        else if(FileType == 3)
        {
            return new Pdf_File();
        }*/
        else 
        { 
            return null;
         }
                
		//return null; 
	} 

    static Document getFile(String excelfile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
