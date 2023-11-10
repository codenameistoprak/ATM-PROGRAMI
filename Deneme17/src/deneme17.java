import java.util.Scanner;

public class deneme17 {
	public static void main(String[]args){
		
		//ATM PROGRAMI (WHILE DÖNGÜSÜ İLE ÇALIŞAN)
		
		Scanner scanner = new Scanner(System.in);
		String islemler = "1. Bakiye Sorgulama\n"
							+ "2. Para Çekme\n"
							+ "3. Para Yatırma\n"
							+ "Çıkış için p'ye basınız...";
							
		System.out.println("**************************");
		System.out.println(islemler);
		System.out.println("**************************");
		
		int bakiye = 2000;
		
		while(true) {
			System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
			String islem = scanner.nextLine();
			if(islem.equals("p")) {
				System.out.println("Çıkış yapılıyor...");
				break;
			}
			else if(islem.equals("1")) {
				System.out.println("Bakiyeniz: "+ bakiye);
				
			}
			else if(islem.equals("2")) {
					System.out.println("Çekmek istediğiniz tutarı giriniz: ");
					int tutar = scanner.nextInt();
					scanner.nextLine();
				
				if(tutar>bakiye) {
					System.out.println("Yeterli bakiyeniz yok..");
					System.out.println("Bakiyeniz: "+ bakiye);
				}
				else if(tutar<=bakiye) {
					System.out.println("Kalan bakiyeniz: "+ (bakiye-=tutar));
					
					}
			}			
			else if(islem.equals("3")) {
				System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
				int tutar = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Yeni Bakiyeniz: "+ (bakiye+=tutar));
				
			}
		
		}
	       scanner.close();
	}
	
}		
		
		
		
		
	


