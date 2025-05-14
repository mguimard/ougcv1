package ougcv1;

abstract class EnfantException extends Exception {
}

class EnfantPasContentException extends EnfantException {
}

class EnfantMaladeException extends EnfantException {
}

class EnfantAFaimException extends EnfantException {
}

public class ExceptionsHeritage {

	static void allerBosser() throws EnfantException {
		if (Math.random() > 0.5)
			throw new EnfantMaladeException();
		if (Math.random() > 0.5)
			throw new EnfantPasContentException();
		if (Math.random() > 0.5)
			throw new EnfantAFaimException();

		System.out.println("Aller au boulot");
	}

	public static void main(String[] args) {
		/*
		 * try { allerBosser(); } catch (EnfantException e) {
		 * 
		 * } catch (EnfantPasContentException e) {
		 * 
		 * }
		 */
		try {
			allerBosser();
		} catch (EnfantMaladeException e) {
			// medecin
		} catch (EnfantPasContentException | EnfantAFaimException e) {
			//
		} catch (EnfantException e) {
			// should not happen
		}

		try {
			allerBosser();
		} catch (EnfantException e) {
			if (e instanceof EnfantMaladeException) {
				// medecin
			} else if (e instanceof EnfantPasContentException) {
				// ...
			}
		}

	}

}
