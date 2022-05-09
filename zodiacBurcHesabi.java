import java.util.Scanner;
public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int dogumyili,zodiac=0;
        String burc= " ";
        boolean isError=false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please write your Birthday year: ");
        dogumyili= scan.nextInt();
        if (dogumyili>=1920 && dogumyili<=2022)
                zodiac =dogumyili%12;
        else
            isError=true;

        switch (zodiac){
            case 0:
                burc="Maymun";
                break;
            case 1:
                burc="Horoz";
                break;
            case 2:
                burc="Köpek";
                break;
            case 3:
                burc="Domuz";
                break;
            case 4:
                burc="Fare";
                break;
            case 5:
                burc="Okuz";
                break;
            case 6:
                burc="Kaplan";
                break;
            case 7:
                burc="Tavsan";
                break;
            case 8:
                burc="Ejderha";
                break;
            case 9:
                burc="Yılan";
                break;
            case 10:
                burc="At";
                break;
            case 11:
                burc="Koyun";
                break;
            default:
                isError=true;

        }
        if (isError)
            System.out.println("Please enter a valid Birthday Year between 1920-2022");
        else
            System.out.println("Your zodiac sign is : " + burc);
    }
}
