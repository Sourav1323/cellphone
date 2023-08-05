#include<iostream>
using namespace std;
int main(){
    int a,b,c,d,max,smax,tmax;
    cout<<"enter 4 values"<<endl;
    cin>>a>>b>>c>>d;
    if(a>b){
        max=a;
        smax=b;
    }
    else{
        max=b;
        smax=a;
    }
    if(c>max){
        tmax=smax;
        smax=max;
        max=c;
    }
    else if(c>smax){
        tmax=smax;
        smax=c;
    }
    else{
        tmax=c;
    }
    if(d>max){
        tmax=smax;
        smax=max;
        max=d;
    }
    else if(d>smax){
        tmax=smax;
        smax=d;
    }
    else if(d>tmax){
        tmax=d;
    }
    cout<<"The maximum element is "<<max<<endl<<smax<<endl<<tmax;
}