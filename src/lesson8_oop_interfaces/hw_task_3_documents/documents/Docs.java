package lesson8_oop_interfaces.hw_task_3_documents.documents;

public interface Docs {
    void showInfo();

    int getNumber(); //required to check duplicates in register

    String getClassName(); //required to check duplicates in register
}