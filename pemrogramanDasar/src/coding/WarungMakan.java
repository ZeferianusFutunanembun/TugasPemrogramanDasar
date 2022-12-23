package coding;

import java.util.Scanner;

public class WarungMakan {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		mieGoreng mieG = new mieGoreng ();
		mieKari mieK = new mieKari ();
		mieSoto mieS = new mieSoto ();
		
		do {
		
		System.out.println("Warung Makan");
		System.out.println("Rindu Nasi");
		System.out.println("---------------");
		System.out.println("1. Nasi Goreng");
		System.out.println("2. Nasi Uduk");
		System.out.println("3. Nasi Kuning");
		System.out.println("4. Nasi Kucing");
		System.out.println("5. Nasi Orak-arik");
		System.out.println("6. Nasi Magelangan");
		System.out.println("7. Keluar");
		System.out.println("----------------");
		System.out.print("Pilih [1-7] : ");
		pilihan = input.nextInt();
		
		
		switch(pilihan) {
		
		case 1 :
			System.out.print("Nasi Goreng, beli berapa porsi =");
			mieG.jumlah1 = input.nextInt();
			
			System.out.println("Nasi Goreng yang anda pesan seharga = Rp. " + mieG.getTotal1() + "\n" );
			break;
			
		case 2 :
			System.out.print("Nasi Uduk, beli berapa porsi =");
			mieK.jumlah2 = input.nextInt ();
			System.out.println("Nasi uduk yang anda pesan seharga = Rp. " + mieK.getTotal2() + "\n");
			break;
			
		case 3 :
			System.out.print("Nasi Kuning, beli berapa porsi =");
			mieS.jumlah3 = input.nextInt ();
			System.out.println("Nasi Kuning yang anda pesan seharga = Rp. " + mieS.getTotal3 () + "\n");
			break;
			
			
		case 7 :
			System.out.print("Pesanan Selesai, Sistem Keluar");
			System.exit(0);
			
		default :
			System.out.print("Pilihan yang anda masukkan salah!!!");
		}
		} while(pilihan < 7 && pilihan >=1);

		input.close();
		
	}

}
