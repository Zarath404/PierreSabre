package histoire;

import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		
		Commerçant marco = new Commerçant("Marco", 50);

		Yakuza yaku = new Yakuza("Yaku Le Noir", 30, "Warsong", "Whisky");
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, tiens, ne serai-ce pas  un faible marchant qui passe par là ?");
		yaku.extorquer(marco);
}
	}