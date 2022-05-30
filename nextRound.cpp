#include <iostream>
#include <vector>
using namespace std;
int main(){
    int n,k,ans=0;
    cin >> n >> k;
    vector<int> a(n,0);
    for(int i=0; i<n; i++){
        cin >> a[i];
    }
    for(int i=0; i<n; i++){
        if(a[i]>0 && a[i]>=a[k-1]){
            ans++;
        }
    }
    cout << ans << endl;
    return 0;
}