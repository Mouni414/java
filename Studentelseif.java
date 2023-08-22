class Student
{
 public static void main(String args[])
 {
  String name="Chinna";
  int rno=3;
  char section='A';
  int m1=98,m2=78,m3=87,m4=76,m5=65;
  int total=m1+m2+m3+m4+m5;
  double per=total/500.0*100;
  int scholorship=0,admission=0,fee=100000;
  String status;
  if(per>60 && per<70)
  {
  status="second";
  scholorship=10000;
  }
  else if(per>70 && per<80)
  { 
  status="first";
  scholorship=20000;
  } 
  else if(per>80 && per<100)
  { 
  status="Excellent"; 
  scholorship=25000;
  } 
  else
  {
  status="Fail";
  admission=25000;
  }
  fee=fee+admission-scholorship;
  System.out.println("name:"+name);
  System.out.println("rno:"+rno);
  System.out.println("total:"+total);
  System.out.println("per:"+per);
  System.out.println("fee:"+fee);
  System.out.println("status:"+status);
 }
}