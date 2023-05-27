package homework;

public class TestClass {

    public static void main(String[] args) {

        Phones allPhones[] = Phones.values();

        for (Phones p :
                allPhones) {
            System.out.println(p);
        }

    }

    enum Phones {
        ERICSSON, NOKIA, HTC, HUAWEI
    }
}
