package main

import (
	"crypto/aes"
	"crypto/cipher"
	"encoding/hex"
	"fmt"
)

func encrypt() {
	key := []byte("keygopostmediumkeygopostmediumke")
	plaintext := []byte("This is the plaintext to be encrypted")
	block, err := aes.NewCipher(key)
	if err != nil {
		panic(err.Error())
	}
	nonce := []byte("gopostmedium")
	aesgcm, err := cipher.NewGCM(block)
	if err != nil {
		panic(err.Error())
	}
	ciphertext := aesgcm.Seal(nil, nonce, plaintext, nil)
	fmt.Printf("Ciphertext: %x\n", ciphertext)
}
func decrypt() {
	key := []byte("keygopostmediumkeygopostmediumke")
	ciphertext, _ := hex.DecodeString("13ca135cef69048ae33a21f8f4d52360c3e2f640a73ba46d9633e0b092dec4931689cc0fa225cbc66eeb7d1e27472a494a0183d6b5")
	nonce := []byte("gopostmedium")
	block, err := aes.NewCipher(key)
	if err != nil {
		panic(err.Error())
	}
	aesgcm, err := cipher.NewGCM(block)
	if err != nil {
		panic(err.Error())
	}
	plaintext, err := aesgcm.Open(nil, nonce, ciphertext, nil)
	if err != nil {
		panic(err.Error())
	}
	fmt.Printf("Plaintext: %s\n", string(plaintext))
}
func main() {
	encrypt()
	decrypt()
}
