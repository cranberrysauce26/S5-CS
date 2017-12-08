#include <iostream>
#include <utility>


typedef std::pair<double,double> dd;

double term, ratio;

dd pow(int n) {
	dd x;
	if (n==1) x = {term, ratio};
	else if (n&1) {
		x = pow(n-1);
		x= dd(x.first*ratio+term, x.second*x.second*ratio);
	} else {
		x = pow(n/2);
		x= dd(x.first*(x.second+1), x.second*x.second);
	}
	printf("pow(%d) = (%lf, %lf)\n", n, x.first, x.second);
	return x;
}

int main() {
	term = 5.0, ratio = 3.0;
	int n = 2;
	printf("%lf\n", pow(n).first);
}