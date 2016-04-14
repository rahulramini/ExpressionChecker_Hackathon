/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import org.mariuszgromada.math.mxparser.Expression;

/**
 *
 * @author manoj
 */
public class Demo {
    public static void main(String args[])
    {
        Demo dd=new Demo();
    String newline="(12+9>=118)&&2+13<=11||5+9>16";
        String s=newline;
        int index1=s.indexOf('&');
        int index2=s.indexOf('|');
        boolean flag1=true;
        boolean flag2=false;
        boolean flag11=false;
        boolean flag12=false;
        boolean flag13=false;
         boolean flag14=false;
         int kkk;
         boolean flag15=false;
         int temp1=-1;
         int temp2=-1;
         index1=s.indexOf('&');
        index2=s.indexOf('|');
        while(index1!=-1||index2!=-1)
        {
            while(index1!=-1&&index2==-1)
            {
                String s1=s.substring(0,index1);
                System.out.println("loop11 s1:"+s1);
                
                flag11=dd.eval(s1);
              
                s=s.substring(index1+2);
                flag1=flag1&&flag11;
                temp1=index1;temp2=-1;
                index1=s.indexOf('&');
               
            }
            //end of while loop
            while(index1==-1&&index2!=-1)
            {
                String s2=s.substring(0,index2);
                System.out.println("loop12 s2:"+s2);
              flag12=dd.eval(s2);
                s=s.substring(index2+2);
                flag1=flag1||flag12;
                temp1=-1;temp2=index2;
                index2=s.indexOf('|');
            }
            while(index1<index2&&index1!=-1&&index2!=-1)
            {
                String s3=s.substring(0,index1);
                 System.out.println("loop1 s3:"+s3);
               flag13=dd.eval(s3);
                
                flag1=flag1&&flag13;
                s=s.substring(index1+2);
                 System.out.println("loop1 s:"+s);
                 temp1=index1;temp2=index2;
                index1=s.indexOf('&');
                index2=s.indexOf('|');
                 System.out.println("loop1 i1,i2:"+index1+"..."+index2);
            }
            while(index1>index2&&index1!=-1&&index2!=-1)
            {
                String s4=s.substring(0,index2);
                 System.out.println("loop2 s4:"+s4);
                flag14=dd.eval(s4);
                          
                flag1=flag1||flag14;
                s=s.substring(index2+2);
                System.out.println("loop2 s:"+s);
                temp1=index1;temp2=index2;
                index1=s.indexOf('&');
                index2=s.indexOf('|');
                System.out.println("loop2 i1,i2:"+index1+"...."+index2);
            }
            
           
            if(!s.equals("")&&index1==-1&&index2==-1)
                    {
              
                        
                        if(temp1!=-1&&temp2==-1)
                        {
                            
                            System.out.println("loop3 s:"+s);
                            
                            flag1=flag1&&flag15;
                            System.out.println("final output:"+flag1);
                    }
                        if(temp1==-1&&temp2!=-1)
                        {
                            
                            System.out.println("loop4 s:"+s);
                          
                            
                            System.out.println("final output:"+flag1);
                    }
                    }
            else
            {System.out.println("final output:"+flag1);}
            
            
        }
       /* if(!s.equals("")&&index1==-1&&index2==-1)
        {  

        boolean fl5=dd.eval(s);
        if()
        }*/
        
    }
   public boolean  eval(String exp)
    {
        boolean xx1=false;
        String newline=exp;
        int op1 = newline.indexOf(">");
     
    int op2 = newline.indexOf("<");
     boolean x1=newline.matches("(.*)>=(.*)");
     boolean x2=newline.matches("(.*)<=(.*)");
     int op5 = newline.indexOf("==");
     int op6 = newline.indexOf("!=");
     if(newline.lastIndexOf(')')==newline.length()-1)
         {
             newline=newline.substring(1,newline.length()-1);
             op1 = newline.indexOf(">");
     
    op2 = newline.indexOf("<");
     x1=newline.matches("(.*)>=(.*)");
     x2=newline.matches("(.*)<=(.*)");
    op5 = newline.indexOf("==");
    op6 = newline.indexOf("!=");
         }
        if(x1)
     {
        
        /* if(newline.lastIndexOf(')')==newline.length()-1)
         {
             newline=newline.substring(1,newline.length()-1);
             op1 = newline.indexOf(">");
     
    op2 = newline.indexOf("<");
     x1=newline.matches("(.*)>=(.*)");
     x2=newline.matches("(.*)<=(.*)");
    op5 = newline.indexOf("==");
    op6 = newline.indexOf("!=");
             
            System.out.println("eval1:"+newline);
         }*/
         //System.out.println("eval:"+newline);
   String d = newline.substring(0, op1);
   System.out.println(d+"...........eval d");
   String z = newline.substring(op1+2);
    System.out.println(z+"....eval z");
   
       Expression e = new Expression(d);
       Expression f = new Expression(z);
      int a;
      int kkk;
double v =(double) e.calculate();
double w =(double) f.calculate();
try{
if(Double.toString(v).equals("NaN")||Double.toString(w).equals("NaN")){
    System.out.println("illegal expression");
    System.exit(0);
}
else
    kkk=Integer.parseInt("a");
}catch(Exception cc){
if(v>=w)
{  xx1=true;
return xx1;
}
else{
    xx1=false;
    return false;}
     }
}
        else if(x2)
     {
   String d = newline.substring(0, op2);
   System.out.println(d+"...........eval d");
   String z = newline.substring(op2+2);
    System.out.println(z+"....eval z");
   
       Expression e = new Expression(d);
       Expression f = new Expression(z);
      int a;
      int kkk;
double v =(double) e.calculate();
double w =(double) f.calculate();
try{
if(Double.toString(v).equals("NaN")||Double.toString(w).equals("NaN")){
    System.out.println("illegal expression");
    System.exit(0);
}
else
    kkk=Integer.parseInt("a");
}catch(Exception cc){
if(v<=w)
{  xx1=true;
return xx1;
}
else{
    xx1=false;
    return false;}
     }
}
         else if(op5!=-1)
     {
   String d = newline.substring(0, op5);
   System.out.println(d+"...........eval d");
   String z = newline.substring(op5+2);
    System.out.println(z+"....eval z");
   
       Expression e = new Expression(d);
       Expression f = new Expression(z);
      int a;
      int kkk;
double v =(double) e.calculate();
double w =(double) f.calculate();
try{
if(Double.toString(v).equals("NaN")||Double.toString(w).equals("NaN")){
    System.out.println("illegal expression");
    System.exit(0);
}
else
    kkk=Integer.parseInt("a");
}catch(Exception cc){
if(v==w)
{  xx1=true;
return xx1;
}
else{
    xx1=false;
    return false;}
     }
}
         else if(op1!=-1)
     {
   String d = newline.substring(0, op1);
   System.out.println(d+"...........eval d");
   String z = newline.substring(op1+1);
    System.out.println(z+"....eval z");
   
       Expression e = new Expression(d);
       Expression f = new Expression(z);
      int a;
      int kkk;
double v =(double) e.calculate();
double w =(double) f.calculate();
try{
if(Double.toString(v).equals("NaN")||Double.toString(w).equals("NaN")){
    System.out.println("illegal expression");
    System.exit(0);
}
else
    kkk=Integer.parseInt("a");
}catch(Exception cc){
if(v<=w)
{  xx1=true;
return xx1;
}
else{
    xx1=false;
    return false;}
     }
}
         else if(op2!=-1)
     {
   String d = newline.substring(0, op2);
   System.out.println(d+"...........eval d");
   String z = newline.substring(op2+1);
    System.out.println(z+"....eval z");
   
       Expression e = new Expression(d);
       Expression f = new Expression(z);
      int a;
      int kkk;
double v =(double) e.calculate();
double w =(double) f.calculate();
try{
if(Double.toString(v).equals("NaN")||Double.toString(w).equals("NaN")){
    System.out.println("illegal expression");
    System.exit(0);
}
else
    kkk=Integer.parseInt("a");
}catch(Exception cc){
if(v<w)
{  xx1=true;
return xx1;
}
else{
    xx1=false;
    return false;}
     }
}
         else if(op6!=-1)
     {
   String d = newline.substring(0, op6);
   System.out.println(d+"...........eval d");
   String z = newline.substring(op1+2);
    System.out.println(z+"....eval z");
   
       Expression e = new Expression(d);
       Expression f = new Expression(z);
      int a;
      int kkk;
double v =(double) e.calculate();
double w =(double) f.calculate();
try{
if(Double.toString(v).equals("NaN")||Double.toString(w).equals("NaN")){
    System.out.println("illegal expression");
    System.exit(0);
}
else
    kkk=Integer.parseInt("a");
}catch(Exception cc){
if(v!=w)
{  xx1=true;
return xx1;
}
else{
    xx1=false;
    return false;}
     }
}
        return xx1;   
    }
}
    
    

