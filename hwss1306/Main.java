package hwss1306;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("=============== MENU ==============");
            System.out.println("1. Thêm liên lạc");
            System.out.println("2. Xóa liên lạc theo số điện thoại");
            System.out.println("3. Tìm kiếm liên lạc");
            System.out.println("4. Hiển thị danh bạ");
            System.out.println("0. Thoát");
            System.out.println("===================================");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("new ID: ");
                    int id1 = Integer.parseInt(sc.nextLine());
                    System.out.print("new Name: ");
                    String name1 = sc.nextLine();
                    System.out.print("new Phone Number: ");
                    String phoneNumber = sc.nextLine();
                    if (manager.isPhoneExists(phoneNumber)) {
                        System.out.println("Số điện thoại đã tồn tại");
                        break;
                    }
                    manager.add(new Contact(id1, name1, phoneNumber));
                    System.out.println("Added!");
                    break;
                case 2:
                    System.out.print("Nhập số điện thoại cần xóa: ");
                    String phoneDel = sc.nextLine();
                    if (!manager.isPhoneExists(phoneDel)) {
                        System.out.println("Số điện thoại " + phoneDel + " không tồn tại");
                        break;
                    }
                    for (int i = 0; i < manager.list.size(); i++) {
                        if (manager.list.get(i).getPhoneNumber().equals(phoneDel)) {
                            manager.list.remove(i);
                            System.out.println("Xóa thành công");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập số điện thoại cần tìm: ");
                    String phoneNum = sc.nextLine();
                    manager.contains(phoneNum);
                    break;
                case 4:
                    manager.display();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
