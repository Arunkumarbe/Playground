#include <stdio.h>
int main()
{
  	//Your code here
  int a,b,ans=1,i;
  scanf("%d%d",&a,&b);
  if(b>=0)
  {
    for(i=1;i<=b;i++)
      ans=ans*a;
    printf("%d",ans);
  }
  else
    printf("Wrong input");
    return 0;
}