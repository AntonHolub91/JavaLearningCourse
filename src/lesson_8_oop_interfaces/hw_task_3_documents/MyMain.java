package lesson_8_oop_interfaces.hw_task_3_documents;

import lesson_8_oop_interfaces.hw_task_3_documents.documents.Docs;
import lesson_8_oop_interfaces.hw_task_3_documents.documents.EmployeeContract;
import lesson_8_oop_interfaces.hw_task_3_documents.documents.FinancialDocument;
import lesson_8_oop_interfaces.hw_task_3_documents.documents.SupplyContract;
import lesson_8_oop_interfaces.hw_task_3_documents.register.Register;

public class MyMain {
    public static void main(String[] args) {
        Register register = new Register();
        Docs doc1 = new EmployeeContract(1, "2025-08-31",
                "John Snow", "2026-08-31");
        register.saveDocument(doc1);
        register.showAllDocuments();

        Docs doc2 = new FinancialDocument(2, "2024-05-21",
                10000.99, "PFB-01");
        register.saveDocument(doc2);
        register.showAllDocuments();

        Docs doc3 = new SupplyContract(3, "2022-01-01",
                "Chair", 999);
        register.saveDocument(doc3);
        register.showAllDocuments();

        Docs doc4 = new SupplyContract(4, "2021-09-21",
                "Table", 100);

        register.saveDocument(doc4);
        register.showAllDocuments();
    }
}