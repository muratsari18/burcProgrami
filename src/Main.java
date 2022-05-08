import java.util.Scanner;

public class BurcProgrami {
    public static void main(String[] args) {
        int month, day;
        String burc = " ";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Dogdunuz ay : ");
        month = input.nextInt();

        System.out.print("Dogdunuz Gun : ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if ((day >= 1) && (day <= 31))
                    if (day < 22)
                        burc = "Oglak Burcu";
                    else
                        burc = "Kova Burcu";
                else
                    isError = true;
                break;
            case 2:
                if ((day >= 1) && (day <= 29))
                    if (day <= 19)
                        burc = "Kova Burcu";
                    else
                        burc = "Balik Burcu";
                else
                    isError = true;
                break;
            case 3:
                if ((day >= 1) && (day <= 31))
                    if (day <= 20)
                        burc = "Balik Burcu";
                    else
                        burc = "Koc Burcu";
                else
                    isError = true;
                break;
            case 4:
                if ((day >= 1) && (day <= 30))
                    if (day <= 20)
                        burc = "Koc Burcu";
                    else
                        burc = "Boga Burcu";
                else
                    isError = true;
                break;
            case 5:
                if ((day >= 1) && (day <= 31))
                    if (day <= 20)
                        burc = "Boga Burcu";
                    else
                        burc = "İkizler Burcu";
                else
                    isError = true;
                break;
            case 6:
                if ((day >= 1) && (day <= 30))
                    if (day <= 22)
                        burc = "İkizler Burcu";
                    else
                        burc = "Yengec Burcu";
                else
                    isError = true;
                break;
            case 7:
                if ((day >= 1) && (day <= 31))
                    if (day <= 22)
                        burc = "Yengec Burcu";
                    else
                        burc = "Aslan Burcu";
                else
                    isError = true;
                break;
            case 8:
                if ((day >= 1) && (day <= 30))
                    if (day <= 22)
                        burc = "Aslan Burcu";
                    else
                        burc = "Başak Burcu";
                else
                    isError = true;
                break;
            case 9:
                if ((day >= 1) && (day <= 31))
                    if (day <= 22)
                        burc = "Basak Burcu";
                    else
                        burc = "Terazi Burcu";
                else
                    isError = true;
                break;
            case 10:
                if ((day >= 1) && (day <= 30))
                    if (day <= 22)
                        burc = "Terazi Burcu";
                    else
                        burc = " Akrep Burcu";
                else
                    isError = true;
                break;
            case 11:
                if ((day >= 1) && (day <= 31))
                    if (day <= 21)
                        burc = "Akrep Burcu";
                    else
                        burc = "Yay Burcu";
                else
                    isError = true;
                break;
            case 12:
                if ((day >= 1) && (day <= 30))
                    if (day <= 21)
                        burc = "Yay Burcu";
                    else
                        burc = "Oglak Burcu";
                else
                    isError = true;
                break;
            default:
                isError = true;

        }
        if (isError)
            System.out.println("Yanlis bir tarih girdiniz");
        else
            System.out.println("Merhaba sizin burcunuz : " + burc);

    }
}
