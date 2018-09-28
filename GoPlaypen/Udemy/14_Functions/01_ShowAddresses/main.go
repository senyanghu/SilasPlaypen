package main

import "fmt"

func main() {
	a := 34

	fmt.Println("a - ", a)
	fmt.Println("a's memory address - ", &a)
	fmt.Printf("%d \n", &a)

	var b *int = &a
	fmt.Println(b)
	fmt.Println(*b)

	*b = 43
	fmt.Println(a)
}
