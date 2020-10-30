package org.piangles.backbone.services.crypto;

public interface CryptoService
{
	public static final String NAME = CryptoService.class.getSimpleName();
	
	public String encrypt(String toBeEncrypted) throws CryptoException;
	public String decrypt(String toBeDecrypted) throws CryptoException;
}
