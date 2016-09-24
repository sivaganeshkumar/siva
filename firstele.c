#include <iostream>
#include <unordered_map>
#include <climits>
using namespace std;

int main() {

	// your code goes here
	unordered_map <int,int> map;
	int arr[] = {1,2,3,3,1};
	int size = sizeof(arr)/sizeof(arr[0]);
	int min_index = INT_MAX;
	int i;

	for (i=0; i< size; i++){
		if (!map.count(arr[i])){
		        // not found
			map[arr[i]] = i;
		}
		else {
			if (map[arr[i]] < min_index)
				min_index = map[arr[i]];
		}
	}

	cout << arr[min_index] << endl;
	return 0;
}
