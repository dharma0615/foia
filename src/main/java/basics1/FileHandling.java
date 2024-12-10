package basics1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class FileHandling {

	public static void main(String[] args) {
		
		m2_prop();
		m3_prop();
		
	}
	
	public static void m3_prop() {
		try {
			FileReader fw=new FileReader("C:\\Users\\dm031472\\git\\foia\\db.properties");
			Properties pro=new Properties();
			pro.load(fw);
			System.out.println(pro.getProperty("Url"));
			Set<Entry<Object,Object>> data=pro.entrySet();
			for(Entry<Object,Object> k:data) {
				System.out.println(k.getKey()+"========="+k.getValue());
			}
			Set<Object> keys=pro.keySet();
			for(Object k1:keys) {
				System.out.println(k1+"===ssss=="+pro.getProperty((String) k1));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void m2_prop() {
		
		File file=new File("db.properties");
		if(!(file.exists())){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Properties prop=new Properties();
		
		prop.setProperty("Url", "https://myownlearning.com");
		prop.setProperty("Name", "Dharma");
		
		try {
			FileWriter fw=new FileWriter(file);
			prop.store(fw, "New Prop file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void fipMmethod() {

		// TODO Auto-generated method stub
		FileInputStream fip=null;
		try {
		fip=new FileInputStream("C:\\Users\\dm031472\\Desktop\\New Text Document.txt");
		int i=0;
		while((i=fip.read())!=-1) {
		System.out.print((char)i);
		}
		fip.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
	System.out.println("File Input Stream Done");
	}
	}


}

