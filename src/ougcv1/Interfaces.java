package ougcv1;

interface PeutMarcher {
	/* public abstract */ void marche();
}

interface PeutSauter {
	/* public abstract */ void saute();
}

abstract class GameEntity {

}

class Terrain extends GameEntity {

}

class Player extends GameEntity implements PeutMarcher, PeutSauter {
	@Override
	public void marche() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saute() {
		// TODO Auto-generated method stub
	}
}

class NPC extends GameEntity implements PeutMarcher {
	@Override
	public void marche() {
		// TODO Auto-generated method stub
	}
}

public class Interfaces {
	public static void main(String[] args) {

		PeutSauter s = (PeutSauter) new NPC();

		PeutMarcher[] marcheurs = { new Player(), new NPC() };

		for (PeutMarcher marcheur : marcheurs) {
			marcheur.marche();
			if (marcheur instanceof PeutSauter) {
				((PeutSauter) marcheur).saute();
			}
		}

	}
}
