package ua.lviv.lgs.minimum;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;


public class ApplicationAnotation {

	public static void main(String[] args) throws Exception {
		getAnnotatedFieldsAndValues(car.class);
	}	
		
	
	public static void getAnnotatedFieldsAndValues(Class<?> customClass) throws Exception {
			Field[] fields =customClass.getDeclaredFields();
			
			File file = new File("Annotation.txt");
			OutputStream fOS = new FileOutputStream(file);
			ObjectOutputStream oOS = new ObjectOutputStream(fOS);
		
			
			for (int i = 0; i < fields.length; i++) {
				Field field = fields[i];
				if (field.getAnnotation(CarModels.class) instanceof CarModels) {
					String str=field.getType().getSimpleName()+"  "+field.getName()+"  annotation value = "+field.getAnnotation(CarModels.class).value()+System.getProperty("line.separator");
					oOS.writeUTF(str);
				}
			}
			oOS.close();
			fOS.close();
		}
	

}
