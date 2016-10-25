package uvod;

public class KontrolaToka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prviBroj = 0;
		if(prviBroj > 0)
			System.out.println("Broj je pozitivan!");
		else if(prviBroj == 0)
			System.out.println("Broj je nula!");
		else
			System.out.println("Broj je negativan!");

		System.out.println("pomocu while ispisati brojeve od 1 do 10");

		int i = 1;
		while (i<11){
			System.out.println(i);
			i++;
		}

		System.out.println("pomocu while od 8 do 3");
		i = 8;
		while(i>2){
			System.out.println(i);
			i--;
		}

		int faktorijel = 1;
		i = 5;
		while(i>0){
			faktorijel = faktorijel * i;
			i--;
		}
		System.out.println("5! = "+faktorijel);

		System.out.println("pomocu for ispisati od 8 do 3");
		for(int j=8;j>=3;j--)
			System.out.println(j);
		
		sabiranje(10, 20);
		System.out.println("Sabiranje "+sabiranje(10, 20));
		System.out.println("Povrsina kruga "+povrsina(10));
		konobar();
		System.out.println(konobarDonesi("NeS", "fAnTa"));
	}

	public static int sabiranje(int x,int y){
		return x + y;
	}
	
	public static double povrsina(int r){
		double povrsina = r * r * Math.PI;
		return povrsina;
	}
	
	
	public static void konobar(){
		System.out.println("Dobar dan, izvolite?");
	}
	public static double konobarDonesi(String kafa, String sok){
		double racun = 0;
		double nes = 129.99;
		double fanta = 150.99;
		
		if(kafa.equalsIgnoreCase("nes") && sok.equalsIgnoreCase("fanta")){
			System.out.println("U redu Vas racun ce iznositi: ");
			racun  = nes + fanta;
		}
		return racun;
	}

}
