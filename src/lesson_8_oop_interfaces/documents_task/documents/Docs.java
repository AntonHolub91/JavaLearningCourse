package lesson_8_oop_interfaces.documents_task.documents;

public interface Docs {
    void showInfo();

    int getNumber(); //required to check duplicates in register

    String getClassName(); //required to check duplicates in register
}