import ru.netology.javaqa.javaqamvn.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int min = 200;
        int max = 300;

        int expected = 3;

        int actual = service.calculate(min, max);
        System.out.println("1.ExpectedCount: " + expected + " || " + "ActualCount: " + actual);


    }
}




