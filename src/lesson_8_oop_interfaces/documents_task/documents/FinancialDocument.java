package lesson_8_oop_interfaces.documents_task.documents;

import java.text.SimpleDateFormat;

public class FinancialDocument extends Document implements Docs {
    Double totalSumMonth;
    String departmentCode;

    public FinancialDocument(int documentNumber, String documentDate, Double totalSumMonth, String departmentCode) {
        super(documentNumber, documentDate);
        this.totalSumMonth = totalSumMonth;
        this.departmentCode = departmentCode;
    }

    @Override
    public void showInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Document number: " + documentNumber + ";\n" +
                "Document date: " + sdf.format(documentDate) + ";\n" +
                "Total month sum: " + totalSumMonth + ";\n" +
                "Department code: " + departmentCode + ";\n" +
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