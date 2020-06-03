// Package twofer implements a solution to the exercism TwoFer problem
package twofer

import "fmt"

// ShareWith return "One for {name}, one for me." string if name is not an empty string
// otherwise it will return "One for you, one for me."
func ShareWith(name string) string {
	if name != "" {
		return fmt.Sprintf("One for %s, one for me.", name)
	}
	return "One for you, one for me."
}
