package app;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();
        String[] data = provider.getData();
        Corrector corrector = new Corrector();
        String result = corrector.handleData(data);

        getOutput(result);
    }
    private static void getOutput(String output) {
        System.out.println(output);
    }
}
