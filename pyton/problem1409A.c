#include<stdio.h>
#include<math.h>

int main() {
    int a, b, res, ans;
    scanf("%d %d", &a, &b);
    res = abs(a - b);
    ans = res % 10 == 0 ? res % 10 : (res % 10) + 1;
    printf("%d", ans);
}