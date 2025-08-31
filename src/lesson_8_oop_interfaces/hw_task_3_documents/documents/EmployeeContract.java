package lesson_8_oop_interfaces.hw_task_3_documents.documents;

import java.util.Date;

public class EmployeeContract extends Document implements Docs {
    String employeeName;
    Date contactValidUntil;

    public EmployeeContract(int documentNumber, String documentDate, String employeeName, String contactValidUntil){
        super(documentNumber, documentDate);
        this.employeeName = employeeName;
        this.contactValidUntil = dateConverter(contactValidUntil);
    }

    @Override
    public void showInfo() {
        System.out.println("Document number: " + documentNumber + ";\n" +
                "Document date: " + sdf.format(documentDate) + ";\n" +
                "Employee name: " + employeeName + ";\n" +
                "End of the contract: " + sdf.format(contactValidUntil) + ";\n" +
                "-".repeat(40));
    }

    @Override
    public int getNumber() {
        return documentNumber;
    }

    @Override
    public String getClassName() {
        return getClass().getSimpleName();
    }
}