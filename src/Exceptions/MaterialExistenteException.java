package Exceptions;

@SuppressWarnings("serial")
public class MaterialExistenteException extends Exception {

	public MaterialExistenteException() {
		super("Esse material j� existe. N�o � poss�vel inser�-lo no reposit�rio.");
	}
}