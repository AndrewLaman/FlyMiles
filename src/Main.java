public class Main {
    public static void main(String[] args) {

        // Стоимость билета в рублях
        int ticketPrice = 13676;

        // Количество рублей, необходимых для получения 1 мили
        int milesPerRubles = 20;

        // Рассчитываем количество бонусных миль
        int miles = ticketPrice / milesPerRubles;

        // Выводим количество бонусных миль
        System.out.println("Количество бонусных миль: " + miles);
    }
}