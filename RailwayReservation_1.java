
import java.io.*;

public class RailwayReservation_1
{
  InputStreamReader isr=new InputStreamReader (System.in);
  BufferedReader br=new BufferedReader (isr);
  int pno[]=new int[275];
  int pno1[]=new int[275];
  int pno2[]=new int[275];
  String name2[]=new String[275];
  String name[]=new String[275];
  String name1[]=new String[275];
  String phno[]=new String[275];
  String phno1[]=new String[275];
  String phno2[]=new String[275];
  int age[]=new int[275];
  int age1[]=new int[275];
  int age2[]=new int[275];
  int cl[]=new int[275];
  int cl1[]=new int[275];
  int cl2[]=new int[275];
  int pcount=0;
  int pnum=1;
  int pnum1=1;
  int pnum2=1;
  int max1=75;
  int max2=125;
  int max3=175;
  int max21=75;
  int max22=125;
  int max23=175;
  int max12=75;
  int max13=125;
  int max14=175;
  
  int index;String x; 
  int trno=0;
  public void doMenu() throws Exception
  {
    int cho=0;
    do
    {
        
      System.out.println("\f");
      trno=doHeading();
      System.out.println("1.Book ticket");
      System.out.println("2.Cancel ticket");
      System.out.println("3.Search passenger");
      System.out.println("4.Reservation chart");
      System.out.println("5.Display unbooked tickets");
      System.out.println("6.Exit");
      System.out.println("Please enter your choice");
      cho=Integer.parseInt(br.readLine()); 
       System.out.print('\u000C');
      /*
        while(cho!=1&&cho!=2&&cho!=3&&cho!=4&&cho!=5&&cho!=6)
        {
            try
            {
               
            }
        
            catch(NumberFormatException qwrqr)
            {
                System.out.println("Wrong Input");
            }
        }
    */
      
      switch(cho)
      {
        case 1: doBook(trno); break;
        case 2: doCancel(trno); break;
        case 3: doSearch(trno); break;
        case 4: doDispList(trno); break;
        case 5: doDispUnbooked(trno); break;
        case 6: doExit(); break;
        default : System.out.println("Invalid choice");
      }
      br.read();
    }
    while(cho!=6);
   
  }
  
  
  
  
  
  private int doHeading( )throws Exception
  {
    System.out.println("#########################################################");
    System.out.println("****** Railway Reservation *******");
    System.out.println("#########################################################");
   
    System.out.println("Select Train Serial No.:");
    System.out.println("1.1240 Nasik-Mumbai");
    System.out.println("2.1340 Nasik-Pune");
    System.out.println("3.1440 Nasik-Delhi");
    trno=Integer.parseInt(br.readLine()); 
    /*while(trno!=1&&trno!=2&&trno!=3)
    {
        try
        {
               
         }
        
    catch(NumberFormatException qwrqr)
    {
        System.out.println("Wrong Input");
     }
    }
     */
     return trno;
   
  }
  
  
  private void doBook(int trno)throws Exception
  {
if(trno==1)
{
    System.out.println("Please enter the class of ticket");
    System.out.println("1. AC\t 2. First\t 3. Sleeper\t");
    int c=Integer.parseInt(br.readLine());
    System.out.println("Please enter no. of tickets");
    int t=Integer.parseInt(br.readLine());
    System.out.print('\u000C');
    int ticketAvailable=0;
    if(c==1 && max1>=t)
    {
      ticketAvailable=1;
    }
    else if(c==2 && max2>=t)
    {
      ticketAvailable=1;
    }
    else if(c==3 && max3>=t)
    {
      ticketAvailable=1;
}
if(ticketAvailable==1)
{
for(int i=0;i<t;i++)
{
pno[pcount]=pnum;
System.out.println("Please enter your name");
name[pcount]=br.readLine();
System.out.println("Please enter your age");
age[pcount]=Integer.parseInt(br.readLine());
cl[pcount]=c;
System.out.println("Please enter your phno");
    phno[pcount]=br.readLine();
    System.out.print('\u000C');
    pcount++;
pnum++;
}//for

if(c==1)
{
max1-=t;
System.out.println("Please pay Rs."+t*2500);
}
if(c==2)
{
max2-=t;
System.out.println("Please pay Rs."+t*2200);
}
if(c==3)
{
max3-=t;
System.out.println("Please pay Rs."+t*2000);
}
}
for(int i=0;i<pcount;i++)
{
System.out.println("-------------------------------------------------------------------- TICKET-------------------------------------------------------------------");
System.out.println(" Train Name ::::::::1240 Nashik Mumbai");
System.out.println("Name        :"+name[i]);   
System.out.println("Age         :"+age[i]);
System.out.println("Seat No     :"+pno[i]);
System.out.println("Class NO    :"+cl[i]);
}
System.out.println(" Please Use 'ENTER' To Go Back To To Menu");
System.out.println("------------------------------------ Thank You Visit Again --------------------------------------");
}
 



else if(trno==2)
{
System.out.println("Please enter the class of ticket");
    System.out.println("1. AC\t 2. First\t 3. Sleeper\t");
    int c=Integer.parseInt(br.readLine());
    System.out.println("Please enter no. of tickets");
    int t=Integer.parseInt(br.readLine());
    System.out.print('\u000C');
    int ticketAvailable=0;
    if(c==1 && max21>=t)
    {
      ticketAvailable=1;
    }
    else if(c==2 && max22>=t)
    {
      ticketAvailable=1;
    }
    else if(c==3 && max23>=t)
    {
      ticketAvailable=1;
}
if(ticketAvailable==1)
{
    
    
for(int i=0;i<t;i++)
{
pno1[pcount]=pnum1;
System.out.println("Please enter your name");
name1[pcount]=br.readLine();
System.out.println("Please enter your age");
age1[pcount]=Integer.parseInt(br.readLine());
cl1[pcount]=c;
System.out.println("Please enter your phno"); 
phno1[pcount]=br.readLine();
System.out.print('\u000C');
pcount++;
pnum1++;
}//for

if(c==1)
{
max21-=t;
System.out.println("Please pay Rs."+t*1500);
}
if(c==2)
{
max22-=t;
System.out.println("Please pay Rs."+t*1200);
}
if(c==3)
{
max23-=t;
System.out.println("Please pay Rs."+t*1000);
}
}
for(int i=0;i<pcount;i++)
{
System.out.println("-------------------------------------------------------------------- TICKET-------------------------------------------------------------------");
System.out.println(" Train Name ::::::::1240 Nashik Mumbai");
System.out.println("Name        :"+name1[i]);   
System.out.println("Age         :"+age1[i]);
System.out.println("Seat No     :"+pno1[i]);
System.out.println("Class NO    :"+cl1[i]);
}
System.out.println(" Please Use 'ENTER' To Go Back To To Menu");
System.out.println("------------------------------------ Thank You Visit Again --------------------------------------");
  }
  
  
  
  
  else if(trno==3)
{
System.out.println("Please enter the class of ticket");
    System.out.println("1. AC\t 2. First\t 3. Sleeper\t");
    int c=Integer.parseInt(br.readLine());
    System.out.println("Please enter no. of tickets");
    int t=Integer.parseInt(br.readLine());
    System.out.print('\u000C');
    int ticketAvailable=0;
    if(c==1 && max12>=t)
    {
      ticketAvailable=1;
    }
    else if(c==2 && max13>=t)
    {
      ticketAvailable=1;
    }
    else if(c==3 && max14>=t)
    {
      ticketAvailable=1;
}
if(ticketAvailable==1)
{
    
    
for(int i=0;i<t;i++)
{
pno2[pcount]=pnum2;
System.out.println("Please enter your name");
name2[pcount]=br.readLine();
System.out.println("Please enter your age");
age2[pcount]=Integer.parseInt(br.readLine());
cl2[pcount]=c;
System.out.println("Please enter your phno"); 
phno2[pcount]=br.readLine();
System.out.print('\u000C');
pcount++;
pnum2++;
}//for

if(c==1)
{
max12-=t;
System.out.println("Please pay Rs."+t*3000);
}
if(c==2)
{
max13-=t;
System.out.println("Please pay Rs."+t*2400);
}
if(c==3)
{
max14-=t;
System.out.println("Please pay Rs."+t*2000);
}
}
for(int i=0;i<pcount;i++)
{
System.out.println("-------------------------------------------------------------------- TICKET-------------------------------------------------------------------");
System.out.println(" Train Name ::::::::1240 Nashik Mumbai");
    System.out.println("Name        : "+name2[i]);   
    System.out.println("Age         : "+age2[i]);
    System.out.println("Seat No     :"+pno2[i]);
    System.out.println("Class NO    :"+cl2[i]);
}
System.out.println("------------------------------------ Thank You Visit Again --------------------------------------");
System.out.println(" Please Use 'ENTER' To Go Back To To Menu");
  } 

}



  
  
  private void doCancel(int trno)throws Exception
{
    int t_pno[]=new int[275];
    String t_name[]=new String[275];
    String t_phno[]=new String[275];
    int t_age[]=new int[275];
    int t_cl[]=new int[275];
    int t_pcount=0;
    int passengerFound=0;
    if(trno==1)
    {
                System.out.println("Please enter your passenger no.");
                int p=Integer.parseInt(br.readLine());
                
               
                for(int i=0;i<pcount;i++)
                {
                    if(pno[i]!=p)
                    {//transfer 
                        t_pno[t_pcount]=pno[i];
                        t_name[t_pcount]=name[i];
                        t_phno[t_pcount]=phno[i];
                        t_age[t_pcount]=age[i];
                        t_cl[t_pcount]=cl[i];
                        t_pcount++;
                    }
                    else
                    {
                        passengerFound=1;
                        if(cl[i]==1)
                        {
                            max1++;
                            System.out.println("Please collect refund of Rs."+1800);
                        }
                        if(cl[i]==2)
                        {
                            max2++;
                            System.out.println("Please collect refund of Rs."+1500);
                        }
                        if(cl[i]==3)
                            {
                                max3++;
                                System.out.println("Please collect refund of Rs."+1000);
                            }//if
                        }//else
                    }
                if(passengerFound==1)   
                    {
                        pno=t_pno;
                        name=t_name;
                        age=t_age;  
                        cl=t_cl;
                        phno=t_phno;
                        pcount=t_pcount;
                        System.out.println("ticket successfully cancelled");
                    }
                    //System.out.println(" Please Use 'ENTER' To Go Back To To Menu");
                    //System.out.print('\u000C');



                }

        else if(trno==2)
        {
            System.out.println("Please enter your passenger no.");
            int p=Integer.parseInt(br.readLine());
            
            for(int i=0;i<pcount;i++)
            {
                if(pno1[i]!=p)
                {//transfer
                    t_pno[t_pcount]=pno1[i];
                    t_name[t_pcount]=name1[i];
                    t_phno[t_pcount]=phno1[i];
                    t_age[t_pcount]=age1[i];
t_cl[t_pcount]=cl1[i];
t_pcount++;
}
else
{
passengerFound=1;
if(cl1[i]==1)
{
max21++;
System.out.println("Please collect refund of Rs."+800);
}
else if(cl1[i]==2)
{
max22++;
System.out.println("Please collect refund of Rs."+500);
} 
else if(cl1[i]==3)
{
max23++;
System.out.println("Please collect refund of Rs."+100);
}//else
}//if
}


if(passengerFound==1)
{
pno1=t_pno;
name1=t_name;
age=t_age;
cl1=t_cl;
phno1=t_phno;
pcount=t_pcount;
System.out.println("ticket successfully cancelled");
}
//System.out.println(" Please Use 'ENTER' To Go Back To To Menu");
//System.out.print('\u000C');
}




else if(trno==3)
{
    System.out.println("Please enter your passenger no.");
int p=Integer.parseInt(br.readLine());
for(int i=0;i<pcount;i++)
{
if(pno2[i]!=p)
{//transfer
t_pno[t_pcount]=pno2[i];
t_name[t_pcount]=name2[i];
t_phno[t_pcount]=phno2[i];
t_age[t_pcount]=age2[i];
t_cl[t_pcount]=cl2[i];
t_pcount++;
}
else
{
passengerFound=1;
if(cl2[i]==1)
{
max12++;
System.out.println("Please collect refund of Rs."+100);
}
else if(cl2[i]==2)
{
max13++;
System.out.println("Please collect refund of Rs."+1500);
} 
else if(cl2[i]==3)
{
max14++;
System.out.println("Please collect refund of Rs."+400);
}//else
}//if
}

if(passengerFound==1)
{
pno2=t_pno;
name2=t_name;
age2=t_age;
cl2=t_cl;
phno2=t_phno;
pcount=t_pcount;
System.out.println("ticket successfully cancelled");
}
System.out.println(" Please Use 'ENTER' To Go Back To To Menu");
//System.out.print('\u000C');

}


if(passengerFound==0)
{

System.out.println(" No Passenger Found");
}
System.out.println(" Please Use 'ENTER' To Go Back To To Menu");
}









private  void doDispList(int trno)throws Exception
{
    if (trno==1)
    {
System.out.println("Passenger list in AC class");
System.out.println("seat no  \t name \t\t age \t phno");
for(int i=0;i<pcount;i++)
{
if(cl[i]==1)
{
System.out.println(pno[i]+   "\t"+name[i]+"\t\t"+age[i]+"\t"+phno[i]);
}
}
System.out.println("Passenger list in First class");
System.out.println("seat no \t name \t\t age \t phno");
for(int i=0;i<pcount;i++)
{
if(cl[i]==2)
{
System.out.println(pno[i]+"\t"+name[i]+"\t\t"+age[i]+"\t"+phno[i]);
}
}
System.out.println("Passenger list in Sleeper class");
System.out.println("seat no \t name \t\t age \t phno");
for(int i=0;i<pcount;i++)
{
if(cl[i]==3)
{
System.out.println(pno[i]+"\t"+name[i]+"\t\t"+age[i]+"\t"+phno[i]);
}
}
System.out.println(" Please Use 'ENTER' To Go Back To  Menu");

}



else if(trno==2)
{
    System.out.println("Passenger list in AC class");
System.out.println("seat no \t name \t\t age \t phno");
for(int i=0;i<pcount;i++)
{
if(cl1[i]==1)
{
System.out.println(pno1[i]+"\t"+name1[i]+"\t\t"+age1[i]+"\t"+phno1[i]);
}
}
System.out.println("Passenger list in First class");
System.out.println("seat no \t name \t\t age \t phno");
for(int i=0;i<pcount;i++)
{
if(cl1[i]==2)
{
System.out.println(pno1[i]+"\t"+name1[i]+"\t\t"+age1[i]+"\t"+phno1[i]);
}
}
System.out.println("Passenger list in Sleeper class");
System.out.println("seat no \t name \t\t age \t phno");
for(int i=0;i<pcount;i++)
{
if(cl1[i]==3)
{
System.out.println(pno1[i]+"\t"+name1[i]+"\t\t"+age1[i]+"\t"+phno1[i]);
}
}
System.out.println(" Please Use 'ENTER' To Go Back To Mainn Menu");

}



else if(trno==3)
{
    System.out.println("Passenger list in AC class");
System.out.println("seat no \t name \t\t age \t phno");
for(int i=0;i<pcount;i++)
{
if(cl2[i]==1)
{
System.out.println(pno2[i]+"\t"+name2[i]+"\t\t"+age2[i]+"\t"+phno2[i]);
}
}
System.out.println("Passenger list in First class");
System.out.println("seat no \t name \t\t age \t phno");
for(int i=0;i<pcount;i++)
{
if(cl2[i]==2)
{
System.out.println(pno2[i]+"\t"+name2[i]+"\t\t"+age2[i]+"\t"+phno2[i]);
}
}
System.out.println("Passenger list in Sleeper class");
System.out.println("seat no \t name \t\t age \t phno");
for(int i=0;i<pcount;i++)
{
if(cl2[i]==3)
{
System.out.println(pno2[i]+"\t"+name2[i]+"\t\t"+age2[i]+"\t"+phno2[i]);
}
}
System.out.println(" Please Use 'ENTER' To Go Back To Mainn Menu");

}

}








private void doSearch(int trno)throws Exception
{
    
int passengerFound=0;
{
    if(trno==1)
    {
        
System.out.println("Please enter passenger no. to search");
int p=Integer.parseInt(br.readLine());
for(int i=0;i<pcount;i++)
{

if(pno[i]==p)
{
System.out.println("Detail found");
passengerFound=1;
System.out.println("passenger no.="+pno[i]); 
System.out.println("name="+name[i]);
System.out.println("class="+cl[i]); 
System.out.println("phno="+phno[i]);
System.out.println("age="+age[i]);
}
}//for
//System.out.println(" Please Use 'ENTER' To Go Back To Mainn Menu");

}
else if(trno==2)
{
    System.out.println("Please enter passenger no. to search");
int p=Integer.parseInt(br.readLine());
for(int i=0;i<pcount;i++)
{

if(pno1[i]==p)
{
System.out.println("Detail found");
passengerFound=1;
System.out.println("passenger no.="+pno1[i]); 
System.out.println("name="+name1[i]);
System.out.println("class="+cl1[i]); 
System.out.println("phno="+phno1[i]);
System.out.println("age="+age1[i]);
}
}//for
//System.out.println(" Please Use 'ENTER' To Go Back To Mainn Menu");

}




else if(trno==3)
{
    System.out.println("Please enter passenger no. to search");
int p=Integer.parseInt(br.readLine());
for(int i=0;i<pcount;i++)
{

if(pno2[i]==p)
{
System.out.println("Detail found");
passengerFound=1;
System.out.println("passenger no.="+pno2[i]); 
System.out.println("name="+name2[i]);
System.out.println("class="+cl2[i]); 
System.out.println("phno="+phno2[i]);
System.out.println("age="+age2[i]);
}
}//for
//System.out.println(" Please Use 'ENTER' To Go Back To Mainn Menu");

}
//System.out.println(" Please Use 'ENTER' To Go Back To Mainn Menu");


}
if(passengerFound==0)
{
    System.out.println("No such passenger");
}
System.out.println(" Please Use 'ENTER' To Go Back To Mainn Menu");


}//method




private void doDispUnbooked(int trno)throws Exception
{
    if(trno==1)
    {
        
System.out.println("No. of booked tickets status");
System.out.println("AC class"+max1);
System.out.println("First class"+max2);
System.out.println("Sleeper class"+max3);
System.out.println(" Please Use 'ENTER' To Go Back To Mainn Menu");

}

else if(trno==2)
{
    System.out.println("No. of booked tickets status");
    System.out.println("AC class"+max21);
    System.out.println("First class"+max22);
    System.out.println("Sleeper class"+max23);
    System.out.println(" Please Use 'ENTER' To Go Back To Mainn Menu");

}
else if(trno==3)
{
    System.out.println("No. of booked tickets status");
    System.out.println("AC class"+max12);
    System.out.println("First class"+max13);
    System.out.println("Sleeper class"+max14);
    System.out.println(" Please Use 'ENTER' To Go Back To Mainn Menu");

}

}
 


private void doExit()
{
System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
System.out.println("Name : Rushang , Class : X ");
System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");


}
}