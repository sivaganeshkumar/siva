#include <iostream>
using namespace std;
int path(int m, int n)
{
if (m == 1 || n == 1)
		return 1;
		else if (m<0 && n<0)
		return 0;
return path(m-1, n) + path(m, n-1);
}
void main()
{
	cout << path(-4, -4);
	}
