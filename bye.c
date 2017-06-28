int main(void) {
	// your code goes here
	int a[100],b[100],i,j,n,k=0,r,sum[100],m[100];
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	  b[i]=a[i];
	}
	for(i=0;i<n;i++)
	{ 
	while(a[i]>0)
	{
		r=a[i]%2;
		sum[k++]=r;
		a[i]=a[i]/2;
	
	if(sum[k]==1)
	{
		count++;
	}
	b[i]=count;
	k=0;count=0;
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(b[i]>b[j])
			{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			temp1=b[i];
			b[i]=b[j];
			b[j]=temp1;
		}
			else if(b[i]==b[i+1])
			{
				if(a[i>a[j])
				{
					tem=a[i];
					a[i]=a[j];
					a[j]=tem;
				}
			}
		}
	}
	for(i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
	return 0;
}
