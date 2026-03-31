package hwss1306;

public interface Manage<T> {
    void add(T item);
    void remove(int index);
    void contains(String phone);
    void display();
    boolean isPhoneExists(String phone);
}
