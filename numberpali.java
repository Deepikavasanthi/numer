 int n1,n2,rev=0;
        System.out.println("enter the number ");
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       while(n!=0)
        {           
             n2=n%10;
             rev=rev*10+n2;
             n1=n/10;
             n=n1;                      
            System.out.println("the reverse no is"+rev);
        }
         if(n.equals(rev))
         {
             System.out.println("palindrome");
         }
         else{
             System.out.println("not a palindrome");
         }
    }}
                                