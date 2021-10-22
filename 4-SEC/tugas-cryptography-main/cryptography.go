package main

import (
	"crypto/sha256"
	"fmt"
)

func main() {
	sum := sha256.Sum256([]byte("Message From Fadil"))
	fmt.Printf("%x", sum)
}
