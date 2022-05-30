#include <iostream>

using namespace std;

int main(){
    int mat[5][5];
    int cX=0,cY=0;
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            cin >> mat[i][j]; 
            if(mat[i][j] == 1){
                cY = i + 1;
                cX = j + 1;
            }
        }
    }        
    int mov=0;
    while(cX != 3){
        if(cX > 3) cX--;
        else cX++;     
        mov++;
    }
    while(cY != 3){
        if(cY > 3) cY--;
        else cY++;     
        mov++;
    }
    cout << mov << endl;
}
