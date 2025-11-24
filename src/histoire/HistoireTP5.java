package histoire;

import personnages.*;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commerçant marco = new Commerçant("Marco", 20);
		Commerçant chonin = new Commerçant("Chonin", 40);
		Commerçant kumi = new Commerçant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", 30, "Warsong", "whisky");
		Ronin roro = new Ronin("Roro", 60, "shochu");
		
		marco.direBonjour();
		chonin.direBonjour();
		kumi.direBonjour();
		yaku.direBonjour();
		roro.direBonjour();
		marco.faireConnaissance(roro);
		marco.faireConnaissance(kumi);
		marco.faireConnaissance(chonin);
		marco.faireConnaissance(yaku);
		marco.listerConnaissance();
		yaku.listerConnaissance();
		Samouraï akimoto = new Samouraï("Akimoto", 80, "saké", "Miyamoto");
		akimoto.faireConnaissance(marco);
		akimoto.listerConnaissance();
	}
}