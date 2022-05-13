package com.tmp1;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class xml {
    public static void XmlWrite(String filename)
    {
        try {
            File file = new File(filename);
            JAXBContext context = JAXBContext.newInstance(student.class);
            Marshaller marshaller = context.createMarshaller();
            student student2 = new student(22, "student_name");
            marshaller.marshal(student2, file);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
    public static void XmlRead(String filename)
    {   System.out.println("Информация из XML-файла:");
        try {
            File file = new File(filename);
            JAXBContext context = JAXBContext.newInstance(student.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            student student3 = (student) unmarshaller.unmarshal(file);
            System.out.println(student3);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }}
}
