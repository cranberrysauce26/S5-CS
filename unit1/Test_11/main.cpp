#include <cstdio>

int main() {
    freopen("data.txt", "w", stdout);
    for (int i = 0; i < 1e9; ++i) printf("%d", i%10);
    return 0;
}