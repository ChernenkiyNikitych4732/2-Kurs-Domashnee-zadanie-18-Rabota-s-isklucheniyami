public class Main {
    public static void main (String[] args) {
            try {

                UserValidator.validateUser("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");

                System.out.println("Данные корректные");

            } catch (WrongLoginException | WrongPasswordException e) {

                System.out.println("Введены некорректные данные");

            }
        }
    }