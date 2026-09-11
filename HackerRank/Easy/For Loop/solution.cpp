// HackerRank Problem: For Loop
// Link: https://www.hackerrank.com/challenges/c-tutorial-for-loop/problem
// Difficulty: Easy
// Language: cpp

#include <iostream>
#include <cstdio>
using namespace std;

int main() 
{
    // string arr[9]={"one","two","three","four","five","six","seven","eight","nine"};
    // int a,b;
    // cin>>a>>b;
    
    // for(int i=a;i<=b;i++)
    // {
    //     if(i<=9)
    //     {
    //         cout<<arr[i-1]<<endl;
    //         if(i%2==0)
    //         {
    //             cout<<"even";
    //         }
    //         else 
    //         {
    //             cout<<"odd";
    //         }
    //     }
        
        
    // }
//     return 0;
// }       
    
    
    
    int x,y;
        cin>>x>>y;
        string arr[9]={"one","two","three","four","five","six","seven","eight","nine"};
        for(int i=x;i<=y;i++){
                if(i<=9) cout<<arr[i-1]<<endl;
                else cout<<(i%2 ? "odd":"even")<<endl;
        }
        return 0;
}
        
        
        
        
        
        
        
