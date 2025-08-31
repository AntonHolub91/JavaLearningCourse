package lesson_8_oop_interfaces.documents_task;

import lesson_8_oop_interfaces.documents_task.documents.Docs;
import lesson_8_oop_interfaces.documents_task.documents.EmployeeContract;
import lesson_8_oop_interfaces.documents_task.documents.FinancialDocument;
import lesson_8_oop_interfaces.documents_task.documents.SupplyContract;
import lesson_8_oop_interfaces.documents_task.register.Register;

public class MyMain {
    public static void main(String[] args) {
        Register register = new Register();
        Docs doc1 = new EmployeeContract(1, "2025-08-31",
                "John Snow", "2026-08-31");
        register.saveDocument(doc1);
        register.showAllDocuments();

        Docs doc2 = new FinancialDocument(3, "2024-05-21",
                10000.99, "PFB-01");
        register.saveDocument(doc2);
        register.showAllDocuments();

        Docs doc3 = new SupplyContract(3, "2022-01-01",
                "Chair", 999);
        register.saveDocument(doc3);
        register.showAllDocuments();

        Docs doc4 = new SupplyContract(3, "2021-09-21",
                "Table", 100);

        register.saveDocument(doc4);
        register.showAllDocuments();
    }
}