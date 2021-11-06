package main

import (
	"crypto/rand"
	"crypto/rsa"
	"crypto/sha256"
	"fmt"
	"io"
	"os"
)

// RSA
const (
	rsaKeySize = 2048
)

type keypair struct {
	priv *rsa.PrivateKey
	pub  *rsa.PublicKey
}

var kp keypair
var ciphertext, signedMessage []byte
var rng io.Reader

func generateKeypair() error {
	var err error
	kp.priv, err = rsa.GenerateKey(rand.Reader, rsaKeySize)
	if err != nil {
		return err
	}
	kp.pub = &kp.priv.PublicKey
	return nil
}
func encrypt() {
	var err error
	secretMessage := []byte("This is the plaintext to be encrypted")
	label := []byte("mediumpost")
	ciphertext, err = rsa.EncryptOAEP(sha256.New(), rng, kp.pub, secretMessage, label)
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error from encryption: %s\n", err)
		return
	}
	// Since encryption is a randomized function, ciphertext will be
	// different each time.
	fmt.Printf("Ciphertext: %x\n", ciphertext)
}
func decrypt() {
	label := []byte("mediumpost")
	plaintext, err := rsa.DecryptOAEP(sha256.New(), rng, kp.priv, ciphertext, label)
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error from decryption: %s\n", err)
		return
	}
	fmt.Printf("Plaintext: %s\n", string(plaintext))
}
func sign() {
	var err error
	message := []byte("This is the plaintext to be signed")
	signedMessage, err = rsa.EncryptPKCS1v15(rng, kp.pub, message)
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error from encryption: %s\n", err)
		return
	}
	fmt.Printf("Signed Message: %x\n", signedMessage)
}
func verify() {
	msgVerified, err := rsa.DecryptPKCS1v15(rng, kp.priv, signedMessage)
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error from decryption: %s\n", err)
		return
	}
	fmt.Printf("Verified Message: %s\n", string(msgVerified))
}
func main() {
	// crypto/rand.Reader is a good source of entropy for randomizing
	// encryption function.
	rng = rand.Reader
	// generates pair of keys
	generateKeypair()
	// encrypt message
	encrypt()
	// decrypt message
	decrypt()
	// sign message
	sign()
	// verify message
	verify()
}
