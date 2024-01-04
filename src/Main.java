import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);

        firstMenu();
        boolean isVeg;
       int option= sc.nextInt();
       if(option == 1)
           isVeg= true;
       else
           isVeg= false;

        secondMenu();
        boolean isRegular;
        int option2= sc.nextInt();
        if(option2 == 1)
            isRegular= true;
        else
            isRegular= false;

        Pizza p= new Pizza(isVeg);
        DeluxePizza dp = new DeluxePizza(isVeg);
        thirdMenu();
        int option3= sc.nextInt();
        if(option3 == 1)
            if(isRegular)
              p.addExtraCheese();
        else
            dp.addExtraCheese();

        fourthMenu();
        int option4= sc.nextInt();
         if(option4 == 1)
         {
             if(isRegular)
                 p.addExtraToppings();
             else
                 dp.addExtraToppings();
         }

         fifthMenu();
         int option5 = sc.nextInt();
         if(option5 == 1)
             if(isRegular)
                p.addTakeAway();
              else
                  dp.addTakeAway();

         finalMenu();
        int choice =sc.nextInt();
        switch(choice)
        {

            case 1: {
                if(isRegular)
                    System.out.println(p.getBill());
                else
                    System.out.println(dp.getBill());
                break;
            }
            case 2: {
                firstMenu();
                break;
            }
            case 3:
            {
                secondMenu();
                break;
            }
            case 4: {
                thirdMenu();
                break;

            }
            case 5:
            {  fourthMenu();
                break;
            }
            case 6:
            {  fifthMenu();
                break;
            }
            case 7:
            {
                finalMenu();
                break;
            }
            default:
                System.out.println(" sorry wrong choice!");


        }

    }
    private static void firstMenu()
    {
        System.out.println("Here's The First Menu:");
        System.out.println("1. veg");
        System.out.println("2. Non-veg");
        System.out.println("Your Choice Please: ");
    }
    private static void secondMenu()
    {
        System.out.println("Here's The Second Menu:");
        System.out.println("1. Regular");
        System.out.println("2. Deluxe");
        System.out.println("Your Choice Please: ");
    }

    private static void thirdMenu() {
        System.out.println("Here's The Third Menu: ");
        System.out.println("1. Extra Cheese");
        System.out.println("Your Choice Please! ");

    }
    private static void fourthMenu()
    {
        System.out.println("1. Extra Toppings");
        System.out.println("Your Choice Please! ");
    }
    private static void fifthMenu()
    {
        System.out.println("1. PaperBag");
        System.out.println("Your Choice Please! ");
    }
    private static void finalMenu()
    {
        System.out.println("1. bill");
        System.out.println("2. Show The First Menu Again");
        System.out.println("3. Show The Second Menu Again");
        System.out.println("4. Show The Third Menu Again");
        System.out.println("5. Show The Fourth Menu Again");
        System.out.println("6. Show The Fifth Menu Again");
        System.out.println("7. Show The Final Menu Again");

        System.out.println("Your Choice Please! ");
    }
}