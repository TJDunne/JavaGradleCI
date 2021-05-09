package GradleDemo;

public class App{

    public String getGreeting(){
        return "hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

}