#include<stdio.h>
int main()
{
  //Type your code here
  int a,b,small,i,h=1,l;
  scanf("%d%d",&a,&b);
  small=a>b?b:a;
    for(i=small;i>1;i--)
    {
      if(a%i==0&&b%i==0)
        h=h*i;
    }
  l=(a*b)/h;
  printf("%d",l);
  
  
  return 0;
}