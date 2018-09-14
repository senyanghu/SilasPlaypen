package main

import "fmt"

func main() {
	a := 10
	b := "golang"
	c := 4.17
	d := true

	// can check go fmt package to view more flag types
	fmt.Printf("%v %T\n", a, a)
	fmt.Printf("%v %T\n", b, b)
	fmt.Printf("%v %T\n", c, c)
	fmt.Printf("%v %T\n", d, d)
}
