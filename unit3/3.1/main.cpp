#include <cstdio>

int fact(int n) {
	printf("n = %d\n", n);
	return n==0 ? 1 : n * fact(n-1);
}

int main() {
	printf("%d\n", fact(1e6));
}