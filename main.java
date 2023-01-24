import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String userName, passWord;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0){
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parılanız :");
            passWord = input.nextLine();
            if (userName.equals("Tunahan Erden") && passWord.equals("12345")){
                System.out.println("Hoşgeldiniz!");
                do {
                    System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz!");
                    System.out.println("1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgula \n"+"4-Çıkış Yap");
                    select= input.nextInt();
                    if (select ==1){
                        System.out.println("Para Miktarı : ");
                        int prize = input.nextInt();
                        balance += prize;
                    }else if (select ==2){
                        System.out.println("Para Miktarı :");
                        int price = input.nextInt();
                        if (price > balance){
                            System.out.println("Bakiye Yetersiz");
                        }
                    }else if (select == 3){
                        System.out.println("Bakiyeniz : " +balance);
                    }
                } while (select !=4);
                System.out.println("Yine Bekleriz!");
                break;
            }else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı ve Şifre Tekrar Deneyini");
                if (right == 0){
                    System.out.println("Kartınız Bloke Olmuştur Lütfen Bankanızla İletişime Geçiniz.");
                }else {
                    System.out.println("Kalan Hakkınız : "+ right);
                }

            }
        }

        }
    }




