/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.swing.*;
import java.io.*;
import org.mariuszgromada.math.mxparser.Expression;
/**
 *
 * @author manoj
 */
public class SymanticExpressionChecker extends javax.swing.JFrame {
String filename;
String filename1;
JFileChooser fileChooser;
 public static String k5;
 int kkk;
    /**
     * Creates new form SymanticExpressionChecker
     */
    public SymanticExpressionChecker() {
        setTitle("SEMANTIC EXPRESSION CHECKER");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        upload = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        tf2.setEditable(false);

        upload.setBackground(new java.awt.Color(0, 255, 0));
        upload.setText("upload");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(0, 153, 0));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel1.setText("            1.Input Single Expression:");

        jLabel2.setText("2.Input Multiple Expressions as file:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("SEMANTIC EXPRESSION CHECKER");

        l2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(0, 153, 0));

        l3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(153, 0, 0));

        l4.setBackground(new java.awt.Color(102, 102, 255));
        l4.setForeground(new java.awt.Color(0, 204, 51));

        l6.setForeground(new java.awt.Color(204, 0, 51));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\manoj\\Desktop\\math_symbols_m.gif")); // NOI18N

        button1.setBackground(new java.awt.Color(0, 204, 0));
        button1.setText("Reset");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(upload, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upload, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(5, 5, 5)
                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
if(evt.getSource()==upload){
        fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
          File selectedFile = fileChooser.getSelectedFile();
          filename=selectedFile.getPath();
          filename1=selectedFile.getName();
          tf2.setText(filename);
        }
}
    
// TODO add your handling code here:
    }//GEN-LAST:event_uploadActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

@SuppressWarnings("empty-statement")
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
if(evt.getSource()==submit)
{
    String newline=tf1.getText();
    String line4=null;
    String line2=tf1.getText();
    
   
    if(!tf1.getText().equals("")) {
        if(tf1.getText().indexOf(',')!=-1){
            String var_num="";
		String var_replace="";
		
		int m;
		//String line2 = "(12+a1)*b2>3,a1=1,b2=5";
		//String newline2=new String();
		for(int i=0,j=0;i<line2.length();i++){
			if(line2.charAt(i) == ','){
				j=i+1;
				while(line2.charAt(j)!='='){
					j++;
				}
				m=j+1;
				do{
					
						m++;
					
				}while((m<line2.length())&&(line2.charAt(m)!=','));
				try{
					var_num= line2.substring(j+1,m);
				}catch(Exception e){
					System.out.println("invalid input");
				}
				System.out.println(var_num);
				try{
				var_replace = line2.substring(i+1,j);
				}catch(Exception e){
					System.out.println("invalid input");
				}
                               System.out.println(var_replace);
				line2 = line2.replaceAll(var_replace, var_num);
                                System.out.println(line4);
			}
		}
		for(int i=0;i<line2.length();i++){
			if(line2.charAt(i)==','){
				newline = line2.substring(0,i);
				break;
			}
		}
        }
        //==============================and or start
       if(newline.indexOf('&')!=-1||newline.indexOf('|')!=-1)
       {
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
                
                flag11=eval(s1);
              
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
              flag12=eval(s2);
                s=s.substring(index2+2);
                flag1=flag1||flag12;
                temp1=-1;temp2=index2;
                index2=s.indexOf('|');
            }
            while(index1<index2&&index1!=-1&&index2!=-1)
            {
                String s3=s.substring(0,index1);
                 System.out.println("loop1 s3:"+s3);
               flag13=eval(s3);
                
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
                flag14=eval(s4);
                          
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
                            flag15=eval(s);
                            flag1=flag1&&flag15;
                            System.out.println("final output:"+flag1);
                            l2.setText(Boolean.toString(flag1));
                    }
                        if(temp1==-1&&temp2!=-1)
                        {
                            
                            System.out.println("loop4 s:"+s);
                          
                            flag1=flag1||flag15;
                            System.out.println("final output:"+flag1);
                            l2.setText(Boolean.toString(flag1));
                    }
                    }
            else
            {System.out.println("final output:"+flag1);
            l2.setText(Boolean.toString(flag1));}
            
            
        } 
       }
        //=========================and or end
        else{    int op1 = newline.indexOf(">");
     
    int op2 = newline.indexOf("<");
     boolean x1=newline.matches("(.*)>=(.*)");
     boolean x2=newline.matches("(.*)<=(.*)");
     int op5 = newline.indexOf("==");
     int op6 = newline.indexOf("!=");
     System.out.println(newline);
       
     if(x1)
     {
         
   String d = newline.substring(0, op1);
   String z = newline.substring(op1+2);
   System.out.println(d);
   System.out.println(z);
   
       Expression e = new Expression(d);
       Expression f = new Expression(z);
      
double v =(double) e.calculate();
double w =(double) f.calculate();
try{
if(Double.toString(v).equals("NaN")||Double.toString(w).equals("NaN")){
    l6.setText("Expression entered is not valid");
    l2.setText("");
   //3.setText("");
}
else
    //dummy expression in order to enter in to catch block if the above if condition is false
    kkk=Integer.parseInt("a");
}catch(Exception a){
    l6.setText("");
System.out.println(v);
System.out.println(w);
if(v>=w)
{  l2.setText("true");
   //3.setText("");
   }
else
{l2.setText("false");}
     }
     }
        else if(x2)
     {
   String d = newline.substring(0, op2);
   String z = newline.substring(op2+2);
   System.out.println(d);
   System.out.println(z);
       Expression e = new Expression(d);
       Expression f = new Expression(z);
double v =(double) e.calculate();
double w =(double) f.calculate();
try{
if(Double.toString(v).equals("NaN")||Double.toString(w).equals("NaN")){
    l6.setText("Expression entered is not valid");
    l2.setText("");
    l3.setText("");
}
else
    kkk=Integer.parseInt("a");
}catch(Exception a){
 l6.setText("");
    System.out.println(v);
System.out.println(w);
if(v<=w)
{  l2.setText("true");
    }
else
    {l2.setText("false");}
     }
     }
        else if(op5!=-1)
     {
   String d = newline.substring(0, op5);
   String z = newline.substring(op5+2);
   System.out.println(d);
   System.out.println(z);
       Expression e = new Expression(d);
       Expression f = new Expression(z);
double v =(double) e.calculate();
double w =(double) f.calculate();
try{
if(Double.toString(v).equals("NaN")||Double.toString(w).equals("NaN")){
    l6.setText("Expression entered is not valid");
    l2.setText("");
    l3.setText("");
}
else
    kkk=Integer.parseInt("a");
}catch(Exception a){
 l6.setText("");
    System.out.println(v);
System.out.println(w);
if(v==w)
{  l2.setText("true");
    }
else
    {l2.setText("false");}
     }
     }
        else if(op1!=-1)
     {
   String d = newline.substring(0, op1);
   String z = newline.substring(op1+1);
   System.out.println(d);
   System.out.println(z);
       Expression e = new Expression(d);
       Expression f = new Expression(z);
double v =(double) e.calculate();
double w =(double) f.calculate();

try{
if(Double.toString(v).equals("NaN")||Double.toString(w).equals("NaN")){
    l6.setText("Expression entered is not valid");
    l2.setText("");
    l3.setText("");
}
else
    kkk=Integer.parseInt("a");

}catch(Exception a){
 l6.setText("");
    System.out.println(v);
System.out.println(w);
if(v>w)
{ l2.setText("true");
   

}
else
{l2.setText("false");}
     }
     }
      else if(op2!=-1)
     {
   String d = newline.substring(0, op2);
   String z = newline.substring(op2+1);
   System.out.println(d);
   System.out.println(z);
       Expression e = new Expression(d);
       Expression f = new Expression(z);
double v =(double) e.calculate();
double w =(double) f.calculate();
try{
if(Double.toString(v).equals("NaN")||Double.toString(w).equals("NaN")){
    l6.setText("Expression entered is not valid");
    l2.setText("");
    l3.setText("");
}
else
    kkk=Integer.parseInt("a");
}catch(Exception a){
 l6.setText("");
    System.out.println(v);
System.out.println(w);
if(v<w)
{  l2.setText("true");
    l3.setText("");}
else
    {l2.setText("false");}
     }
     }
       else if(op6!=-1)
     {
   String d = newline.substring(0, op6);
   String z = newline.substring(op6+2);
   System.out.println(d);
   System.out.println(z);
       Expression e = new Expression(d);
       Expression f = new Expression(z);
double v =(double) e.calculate();
double w =(double) f.calculate();
try{
    if(Double.toString(v).equals("NaN")||Double.toString(w).equals("NaN")){
    l6.setText("Expression entered is not valid");
    l2.setText("");
    l3.setText("");
}
else
    kkk=Integer.parseInt("a");
}catch(Exception a){
 l6.setText("");
    System.out.println(v);
System.out.println(w);
if(v!=w)
{  l2.setText("true");
    l3.setText("");}

else
    {l2.setText("false");}
     }  
    }
    
    }
    }
    
       
    if(!tf2.getText().equals(""))
    {
    
    int k=filename1.lastIndexOf(".");
    String k1=filename1.substring(0,k);
    String k2=k1+"output.txt";
    int k3=filename.lastIndexOf(filename1);
    String k4=filename.substring(0,k3);
    k5=k4+k2;
   File file =new File(k5);
   if (file.exists())
 { file.delete();}
try{
   BufferedReader br = new BufferedReader(new FileReader(filename));

    String line;
    l4.setText("output file\t"+k2+"\thas been successfully completed");
   
while ((line = br.readLine()) != null) 
{
    if(line.indexOf(',')!=-1){
		String var_num="";
		String var_replace="";
		int m;
		
		for(int i=0,j=0;i<line.length();i++){
			if(line.charAt(i) == ','){
				j=i+1;
				while(line.charAt(j)!='='){
					j++;
				}
				m=j+1;
				do{
					
						m++;
					
				}while((m<line.length())&&(line.charAt(m)!=','));
				try{
					var_num= line.substring(j+1,m);
				}catch(Exception e){
					System.out.println("invalid input");
				}
				
				try{
				var_replace = line.substring(i+1,j);
				}catch(Exception e){
					System.out.println("invalid input");
				}
				line = line.replaceAll(var_replace, var_num);
			}
		}
		for(int i=0;i<line.length();i++){
			if(line.charAt(i)==','){
				line = line.substring(0,i);
				break;
			}
		}
		}
    
    //------------------
     int op1 = line.indexOf(">");
     
     int op2 = line.indexOf("<");
     boolean x1=line.matches("(.*)>=(.*)");
     boolean x2=line.matches("(.*)<=(.*)");
     int op5 = line.indexOf("==");
     int op6 = line.indexOf("!=");
     if(x1)
     {
  String d = line.substring(0, op1);
   String z = line.substring(op1+2);
   System.out.println(d);
   System.out.println(z);
       Expression e = new Expression(d);
       Expression f = new Expression(z);
double v =(double) e.calculate();
double w =(double) f.calculate();
System.out.println(v);
System.out.println(w);
if(v>=w)
{  
    System.out.println("true");
resul1(line);
}
else
    {
    System.out.println("false");
resul2(line);
}
     }
     else if(x2)
     {
   String d = line.substring(0, op2);
   String z = line.substring(op2+2);
   System.out.println(d);
   System.out.println(z);
       Expression e = new Expression(d);
       Expression f = new Expression(z);
double v =(double) e.calculate();
double w =(double) f.calculate();
System.out.println(v);
System.out.println(w);
if(v<=w)
{  
    System.out.println("true");
resul1(line);
}
else
    {
    System.out.println("false");
resul2(line);
}
     }
     else  if(op1!=-1)
     {
  String d = line.substring(0, op1);
   String z = line.substring(op1+1);
   System.out.println(d);
   System.out.println(z);
       Expression e = new Expression(d);
       Expression f = new Expression(z);
double v =(double) e.calculate();
double w =(double) f.calculate();
System.out.println(v);
System.out.println(w);
if(v>w)
{  
    System.out.println("true");
resul1(line);
}
else
    {
resul2(line);
}
     }
       else if(op2!=-1)
     {
  String d = line.substring(0, op2);
   String z = line.substring(op2+1);
   System.out.println(d);
   System.out.println(z);
       Expression e = new Expression(d);
       Expression f = new Expression(z);
double v =(double) e.calculate();
double w =(double) f.calculate();
System.out.println(v);
System.out.println(w);
if(v<w)
{  
    System.out.println("true");
resul1(line);
}
else
    {
    System.out.println("false");
resul2(line);
}
     }
     
       else if(op5!=-1)
     {
   String d = line.substring(0, op5);
   String z = line.substring(op5+2);
   System.out.println(d);
   System.out.println(z);
       Expression e = new Expression(d);
       Expression f = new Expression(z);
double v =(double) e.calculate();
double w =(double) f.calculate();
System.out.println(v);
System.out.println(w);
if(v==w)
{  
    System.out.println("true");
resul1(line);
}
else
    {
    System.out.println("false");
resul2(line);
}
     }
       else if(op6!=-1)
     {
  String d = line.substring(0, op6);
   String z = line.substring(op6+2);
   System.out.println(d);
   System.out.println(z);
       Expression e = new Expression(d);
       Expression f = new Expression(z);
double v =(double) e.calculate();
double w =(double) f.calculate();
System.out.println(v);
System.out.println(w);
if(v!=w)
{  
    System.out.println("true");
resul1(line);
}
else{
    System.out.println("false");
resul2(line);
}
     }    
}
    }catch(Exception e){}   
    }
    
    //----------------------------------------------
    } // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
if(evt.getSource()==button1)
{
    l2.setText("");
    l3.setText("");
    l4.setText("");
    l6.setText("");
    tf1.setText("");
    tf2.setText("");
    
    }//GEN-LAST:event_button1ActionPerformed
    }
    public String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }

public static void resul1(String line)
   {
       
       try
(
FileWriter fw = new FileWriter(k5, true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
  {  
out.println(line+"\t==>true");

} catch (IOException x) {}
       
   }
    
    
    
    public static void resul2(String line)
   {
       
       try
(
FileWriter fw = new FileWriter(k5, true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
  {  
out.println(line+"\t==>false");

} catch (IOException x) {} 
   }
    
 //===========================and or function eval start
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
   // System.exit(0);
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
   // System.exit(0);
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
    //System.exit(0);
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
    //System.exit(0);
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
    
   
    //========================and or function eval end
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SymanticExpressionChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SymanticExpressionChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SymanticExpressionChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SymanticExpressionChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SymanticExpressionChecker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l6;
    private javax.swing.JButton submit;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
