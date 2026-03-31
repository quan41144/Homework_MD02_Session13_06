package hwss1306;

import java.util.ArrayList;

public class ContactManager implements Manage<Contact> {
    ArrayList<Contact> list = new ArrayList<>();
    @Override
    public void add(Contact item) {
        list.add(item);
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }

    @Override
    public void contains(String phone) {
        boolean phoneExists = false;
        for (Contact item : list) {
            if (item.getPhoneNumber().contains(phone)) {
                System.out.println("Có tồn tại liên lạc");
                phoneExists = true;
                break;
            }
        }
        if (!phoneExists) {
            System.out.println("Không tồn tại");
        }
    }

    @Override
    public void display() {
        System.out.println("Contact Information:");
        for (Contact item : list) {
            System.out.println("ID: " + item.getId() + " Name: " + item.getName() + " Phone: " + item.getPhoneNumber());
        }
    }
    @Override
    public boolean isPhoneExists(String phoneNumber) {
        for (Contact item : list) {
            if (item.getPhoneNumber().equals(phoneNumber)) {
                return true;
            }
        }
        return false;
    }
}
