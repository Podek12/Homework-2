//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ticketPrice = 23_345;
        int bonuses = 20;
        int bonusMile = ticketPrice / bonuses;

        System.out.println("Ваш бонусный счёт составит " + bonusMile + " бонусных миль, при покупке билета стоимостью " + ticketPrice + " руб.,");
    }
}