package com.TBD.backbone.services.crypto;

public interface CryptoService
{
	public String encrypt(String toBeEncrypted) throws CryptoException;
	public String decrypt(String toBeDecrypted) throws CryptoException;
}
