package electronics;

/**
 *
 * 
 * @author Chandrapal <chandrapal@linux.com>
 * @coauthor Subba Rao <subbaraoballipale@gmail.com>
 */

import java.io.*;

public class KMAP
{
    static int arrayCheck(int[] arr) {
        int flag=1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==1)
                flag*=0;
        }
        return flag;
    }
    public static void main(String args[]) throws IOException {
    try {
        int temp;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("4 VARIABLE K-MAP SIMPLIFICATION\n");
        System.out.println("  \\ab  00    01    11    10");
        System.out.println("cd `-------------------------");
        System.out.println("00  | m00 | m01 | m03 | m02 |");
        System.out.println("    -------------------------"); 
        System.out.println("01  | m04 | m05 | m07 | m06 |");
        System.out.println("    -------------------------"); 
        System.out.println("11  | m12 | m13 | m15 | m14 |");
        System.out.println("    -------------------------");
        System.out.println("00  | m08 | m09 | m11 | m10 |");
        System.out.println("    -------------------------"); 
        System.out.println("Enter all the minterms");
        System.out.println("1 for m1 , 2 for m2 , etc \nNOTE: To terminate enter a negative number");
        int m[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int b=0, count=0;
        boolean f=true;
        while(f)
        {
            b=Integer.parseInt(in.readLine());
            try{
               m[b]=1; 
               count+=1;
               if(count>=16)
                   f=false;
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                if(b<0)
                {
                    f=false;
                    temp = arrayCheck(m);
                    if(temp == 1)
                    {
                        System.err.println("You have not entered any minterm!");
                        System.exit(0);
                    }
                }
            }
        }
        
        System.out.println("\nThe entered K-Map is: \n");
        System.out.println("  \\ab  00    01    11    10");
        System.out.println("cd `-------------------------");
        System.out.println("00  |  "+m[0]+"  |  "+m[1]+"  |  "+m[3]+"  |  "+m[2]+"  |");
        System.out.println("    -------------------------"); 
        System.out.println("01  |  "+m[4]+"  |  "+m[5]+"  |  "+m[7]+"  |  "+m[6]+"  |");
        System.out.println("    -------------------------"); 
        System.out.println("11  |  "+m[12]+"  |  "+m[13]+"  |  "+m[15]+"  |  "+m[14]+"  |");
        System.out.println("    -------------------------");
        System.out.println("00  |  "+ m[8] +"  |  "+m[9]+"  |  "+m[11]+"  |  "+m[10]+"  |");
        System.out.println("    -------------------------"); 

        int M[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        M[31]=0;
        if((m[0]==1)&&(m[1]==1))
            M[0]=1;
        if((m[1]==1)&&(m[3]==1))
            M[1]=1;
        if((m[3]==1)&&(m[2]==1))
            M[2]=1;
        if((m[4]==1)&&(m[5]==1))
            M[3]=1;
        if((m[5]==1)&&(m[7]==1))
            M[4]=1;
        if((m[7]==1)&&(m[6]==1))
            M[5]=1;
        if((m[12]==1)&&(m[13]==1))
            M[6]=1;
        if((m[13]==1)&&(m[15]==1))
            M[7]=1;
        if((m[15]==1)&&(m[14]==1))
            M[8]=1;
        if((m[8]==1)&&(m[9]==1))
            M[9]=1;
        if((m[9]==1)&&(m[11]==1))
            M[10]=1;
        if((m[11]==1)&&(m[10]==1))
            M[11]=1;
        if((m[0]==1)&&(m[4]==1))
            M[12]=1;
        if((m[1]==1)&&(m[5]==1))
            M[13]=1;
        if((m[3]==1)&&(m[7]==1))
            M[14]=1;
        if((m[2]==1)&&(m[6]==1))
            M[15]=1;
        if((m[4]==1)&&(m[12]==1))
            M[16]=1;
        if((m[5]==1)&&(m[13]==1))
            M[17]=1;
        if((m[7]==1)&&(m[15]==1))
            M[18]=1;
        if((m[6]==1)&&(m[14]==1))
            M[19]=1;
        if((m[12]==1)&&(m[8]==1))
            M[20]=1;
        if((m[13]==1)&&(m[9]==1))
            M[21]=1;
        if((m[15]==1)&&(m[11]==1))
            M[22]=1;
        if((m[14]==1)&&(m[10]==1))
            M[23]=1;
        if((m[0]==1)&&(m[8]==1))
            M[24]=1;
        if((m[1]==1)&&(m[9]==1))
            M[25]=1;
        if((m[3]==1)&&(m[11]==1))
            M[26]=1;
        if((m[2]==1)&&(m[10]==1))
            M[27]=1;
        if((m[0]==1)&&(m[2]==1))
            M[28]=1;
        if((m[4]==1)&&(m[6]==1))
            M[29]=1;
        if((m[12]==1)&&(m[14]==1))
            M[30]=1;
        if((m[8]==1)&&(m[10]==1))
            M[31]=1; 

        int M4[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            M4[22]=0;
        if((M[0]==1)&&(M[3]==1))
            M4[0]=1;
        if((M[1]==1)&&(M[4]==1))
            M4[1]=1; 
        if((M[2]==1)&&(M[5]==1))
            M4[2]=1;
        if((M[3]==1)&&(M[6]==1))
            M4[3]=1;
        if((M[4]==1)&&(M[7]==1))
            M4[4]=1;
        if((M[5]==1)&&(M[8]==1))
            M4[5]=1;
        if((M[6]==1)&&(M[9]==1))
            M4[6]=1;
        if((M[7]==1)&&(M[10]==1))
            M4[7]=1;
        if((M[8]==1)&&(M[11]==1))
            M4[8]=1;
        if((M[0]==1)&&(M[9]==1))
            M4[9]=1;
        if((M[1]==1)&&(M[10]==1))
            M4[10]=1;
        if((M[2]==1)&&(M[11]==1))
            M4[11]=1;
        if((M[12]==1)&&(M[15]==1))
            M4[12]=1;
        if((M[16]==1)&&(M[19]==1))
            M4[13]=1;
        if((M[20]==1)&&(M[23]==1))
            M4[14]=1;
        if((M[0]==1)&&(M[2]==1))
            M4[15]=1;
        if((M[3]==1)&&(M[5]==1))
            M4[16]=1;
        if((M[6]==1)&&(M[8]==1))
            M4[17]=1;
        if((M[9]==1)&&(M[11]==1))
            M4[18]=1;
        if((M[12]==1)&&(M[20]==1))
            M4[19]=1;
        if((M[13]==1)&&(M[21]==1))
            M4[20]=1;
        if((M[14]==1)&&(M[22]==1))
            M4[21]=1;
        if((M[15]==1)&&(M[23]==1))
            M4[22]=1;

        int M8[] = {0,0,0,0,0,0,0,0};
        M8[7]=0;
        if((M4[19]==1)&&(M4[20]==1))
            M8[0]=1;
        if((M4[20]==1)&&(M4[21]==1))
            M8[1]=1;
        if((M4[21]==1)&&(M4[22]==1))
            M8[2]=1;
        if((M4[15]==1)&&(M4[16]==1))
            M8[3]=1;
        if((M4[16]==1)&&(M4[17]==1))
            M8[4]=1;
        if((M4[17]==1)&&(M4[18]==1))
            M8[5]=1;
        if((M4[15]==1)&&(M4[18]==1))
            M8[6]=1;
        if((M4[19]==1)&&(M4[22]==1))
            M8[7]=1;
        int M16=0;
        if((M8[0]==1)&&(M8[2]==1))
            M16=1;
        String simp="";
        if (M16==1)
        {
            System.out.println("\nThe reduced equation is : 1"); 
            System.exit(0);
        }

        for(int i=0;i<=31;i++)
        {
            if(m[i]==1)
                break;
            else
            {
                if(i==31)
                {
                    System.out.println("\nThe reduced equation is : 0");
                    System.exit(0);
                }
            }
        }

        if (M8[0]==1)
        {
            simp = simp + "a\' + ";
        } 
        if (M8[1]==1)
        {
            simp = simp + "b + ";
        }
        if (M8[2]==1)
        {
            simp = simp + "a + ";
        }
        if (M8[3]==1)
        {
            simp = simp + "c\' + ";
        }
        if (M8[4]==1)
        {
            simp = simp + "d + ";
        }
        if (M8[5]==1)
        {
            simp = simp + "c + ";
        }
        if (M8[6]==1)
        {
            simp = simp + "d\' + ";
        }
        if (M8[7]==1)
        {
            simp = simp + "b\' + ";
        }
        if (M4[0]==1)
        {
            if((M4[2]==0)&&(M4[6]==0))
                simp = simp + "a\'c\' + ";
        }
        if (M4[1]==1)
        {
            if((M4[7]==0)&&(M4[12]==0))
                simp = simp + "bc\' + ";
        }
        if (M4[2]==1)
        {
            if((M4[0]==0)&&(M4[8]==0))
                simp = simp + "ac\' + ";
        }
        if (M4[3]==1)
        {
            if((M4[5]==0)&&(M4[9]==0)) 
                simp = simp + "a\'d + ";
        }
        if (M4[4]==1)
        {
            if((M4[10]==0)&&(M4[13]==0))
                simp = simp + "bd + ";
        }
        if (M4[5]==1)
        {
            if((M4[3]==0)&&(M4[11]==0))
                simp = simp + "a\'d + ";
        }
        if (M4[6]==1)
        {
            if((M4[0]==0)&&(M4[8]==0))
                simp = simp + "a\'c + ";
        }
        if (M4[7]==1)
        {
            if((M4[1]==0)&&(M4[14]==0))
                simp = simp + "bc + ";
        }
        if (M4[8]==1)
        {
            if((M4[2]==0)&&(M4[6]==0))
                simp = simp + "ac + " ;
        }
        if (M4[9]==1)
        {
            if((M4[11]==0)&&(M4[3]==0))
                simp = simp + "a\'d\' + ";
        }
        if (M4[10]==1)
        {
            if((M4[4]==0)&&(M4[12]==0))
                simp = simp + "bd\' + ";
        }
        if (M4[11]==1)
        {
            if((M4[9]==0)&&(M4[5]==0))
                simp = simp + "ad\' + ";
        }
        if (M4[12]==1)
        {
            if((M4[14]==0)&&(M4[1]==0))
                simp = simp + "b\'c\' + ";
        }
        if (M4[13]==1)
        {
            if((M4[4]==0)&&((M[12]==0)||(M4[14]==0)))
                simp = simp + "b\'d + ";
        }
        if (M4[14]==1)
        {
            if((M4[12]==0)&&(M4[7]==0))
                simp = simp + "b\'d\' + ";
        }
        if (M[0]==1)
        {
            if((M[2]==0)&&(M[3]==0)&&(M[9]==0))
                simp = simp + "a\'c\'d\' + ";
        }
        if (M[1]==1)
        {
            if((M[4]==0)&&(M[10]==0)&&((M[0]==0)||(M[1]==0)))
                simp = simp + "bc\'d\' + ";
        } 
        if (M[2]==1)
        {
            if((M[0]==0)&&(M[5]==0)&&(M[11]==0))
                simp = simp + "ac\'d\' + ";
        }
        if (M[3]==1)
        {
            if((M[0]==0)&&(M[6]==0)&&(M[5]==0))
                simp = simp + "a\'c\'d + ";
        }
        if (M[4]==1)
        {
            if((M[1]==0)&&(M[7]==0)&&((M[3]==0)||(M[5]==0)))
                simp = simp + "b\'c\'d + ";
        }
        if (M[5]==1)
        {
            if((M[3]==0)&&(M[2]==0)&&(M[8]==0))
                simp = simp + "ac\'d + ";
        }
        if (M[6]==1)
        {
            if((M[3]==0)&&(M[8]==0)&&(M[9]==0))
                simp = simp + "a\'cd + ";
        }
        if (M[7]==1)
        {
            if((M[4]==0)&&(M[10]==0)&&((M[6]==0)||(M[8]==0)))
                simp = simp + "bcd + ";
        }
        if (M[8]==1)
        {
            if((M[6]==0)&&(M[5]==0)&&(M[11]==0))
                simp = simp + "acd + ";
        }
        if (M[9]==1)
        {
            if((M[11]==0)&&(M[6]==0)&&(M[0]==0))
                simp = simp + "a\'cd\' + ";
        }
        if (M[10]==1)
        {
            if((M[7]==0)&&(M[1]==0)&&((M[9]==0)||(M[11]==0)))
                simp = simp + "bcd\' + ";
        }
        if (M[11]==1)
        {
            if((M[9]==0)&&(M[8]==0)&&(M[2]==0))
                simp = simp + "acd\' + ";
        }
        if (M[12]==1)
        {
            if((M[13]==0)&&(M[15]==0)&&(M[20]==0))
                simp = simp + "a\'b\'c\' + ";
        }
        if (M[13]==1)
        {
            if((M[12]==0)&&(M[14]==0)&&(M[17]==0))
                simp = simp + "a\'bc\' + ";
        }
        if (M[14]==1)
        {
            if((M[13]==0)&&(M[15]==0)&&(M[18]==0))
                simp = simp + "abc\' + ";
        }
        if (M[15]==1)
        {
            if((M[14]==0)&&(M[12]==0)&&(M[19]==0))
                simp = simp + "ab\'c\' + ";
        }
        if (M[16]==1)
        {
            if((M[17]==0)&&(M[19]==0)&&((M[12]==0)||(M[20]==0)))
                simp = simp + "a\'b\'d + ";
        }
        if (M[17]==1)
        {
            if((M[16]==0)&&(M[18]==0)&&((M[13]==0)||(M[21]==0)))
                simp = simp + "a\'bd + ";
        }
        if (M[18]==1)
        {
            if((M[17]==0)&&(M[19]==0)&&((M[14]==0)||(M[22]==0)))
                simp = simp + "abd + ";
        } 
        if (M[19]==1)
        {
            if((M[18]==0)&&(M[16]==0)&&((M[15]==0)||(M[23]==0)))
                simp = simp + "ab\'d + ";
        }
        if (M[20]==1)
        {
            if((M[21]==0)&&(M[23]==0)&&(M[12]==0))
                simp = simp + "a\'b\'c + ";
        }
        if (M[21]==1)
        {
            if((M[20]==0)&&(M[22]==0)&&(M[13]==0))
                simp = simp + "a\'bc + ";
        }
        if (M[22]==1)
        {
            if((M[21]==0)&&(M[23]==0)&&(M[14]==0))
                simp = simp + "abc + ";
        }
        if (M[23]==1)
        {
            if((M[22]==0)&&(M[20]==0)&&(M[15]==0))
                simp = simp + "ab\'c + ";
        }
        if (M[24]==1)
        {
            if((M[25]==0)&&(M[27]==0)&&(M[16]==0))
                simp = simp + "a\'b\'d\' + ";
        }
        if (M[25]==1)
        {
            if((M[24]==0)&&(M[26]==0)&&(M[17]==0))
                simp = simp + "a\'bd\' + ";
        }
        if (M[26]==1)
        {
            if((M[25]==0)&&(M[27]==0)&&(M[18]==0))
                simp = simp + "abd\' + ";
        }
        if (M[27]==1)
        {
            if((M[26]==0)&&(M[24]==0)&&(M[19]==0))
                simp = simp + "ab\'d\' + ";
        }
        if (M[28]==1)
        {
            if((M[29]==0)&&(M[31]==0)&&(M[1]==0))
                simp = simp + "b\'c\'d\' + ";
        }
        if (M[29]==1)
        {
            if((M[30]==0)&&(M[28]==0)&&(M[4]==0))
                simp = simp + "b\'c\'d + ";
        }
        if (M[30]==1)
        {
            if((M[29]==0)&&(M[31]==0)&&(M[7]==0))
                simp = simp + "b\'cd + ";
        }
        if (M[31]==1)
        {
            if((M[30]==0)&&(M[28]==0)&&(M[10]==0))
                simp = simp + "b\'cd\' + ";
        }
        if (m[0]==1)
        {
            if((m[1]==0)&&(m[2]==0)&&(m[4]==0)&&(m[8]==0))
                simp = simp + "a\'b\'c\'d\' + ";
        }
        if (m[1]==1)
        {
            if((m[0]==0)&&(m[3]==0)&&(m[5]==0)&&(m[9]==0))
                simp = simp + "a\'bc\'d\' + ";
        }
        if (m[3]==1)
        {
            if((m[1]==0)&&(m[2]==0)&&(m[7]==0)&&(m[11]==0))
                simp = simp + "abc\'d\' + ";
        }
        if (m[2]==1)
        {
            if((m[3]==0)&&(m[0]==0)&&(m[6]==0)&&(m[10]==0))
                simp = simp + "ab\'c\'d\' + ";
        }
        if (m[4]==1)
        {
            if((m[0]==0)&&(m[5]==0)&&(m[6]==0)&&(m[12]==0))
                simp = simp + "a\'b\'c\'d + ";
        }
        if (m[5]==1)
        {
            if((m[4]==0)&&(m[7]==0)&&(m[1]==0)&&(m[13]==0))
                simp = simp + "a\'bc\'d + ";
        }
        if (m[7]==1)
        {
            if((m[5]==0)&&(m[6]==0)&&(m[3]==0)&&(m[15]==0))
                simp = simp + "abc\'d + ";
        }
        if (m[6]==1)
        {
            if((m[7]==0)&&(m[4]==0)&&(m[2]==0)&&(m[14]==0))
                simp = simp + "ab\'c\'d + ";
        }
        if (m[12]==1)
        {
            if((m[4]==0)&&(m[13]==0)&&(m[14]==0)&&(m[8]==0))
                simp = simp + "a\'b\'cd + ";
        }
        if (m[13]==1)
        {
            if((m[12]==0)&&(m[15]==0)&&(m[5]==0)&&(m[9]==0))
                simp = simp + "a\'bcd + ";
        }
        if (m[15]==1)
        {
            if((m[13]==0)&&(m[14]==0)&&(m[7]==0)&&(m[11]==0))
                simp = simp + "abcd + ";
        }
        if (m[14]==1)
        {
            if((m[15]==0)&&(m[12]==0)&&(m[6]==0)&&(m[10]==0))
                simp = simp + "ab\'cd + ";
        }
        if (m[8]==1)
        {
            if((m[9]==0)&&(m[10]==0)&&(m[0]==0)&&(m[12]==0))
                simp = simp + "a\'b\'cd\' + ";
        }
        if (m[9]==1)
        {
            if((m[8]==0)&&(m[11]==0)&&(m[13]==0)&&(m[1]==0))
                simp = simp + "a\'bcd\' + ";
        }
        if (m[11]==1)
        {
            if((m[9]==0)&&(m[10]==0)&&(m[15]==0)&&(m[3]==0))
                simp = simp + "abcd\' + ";
        }
        if (m[10]==1)
        {
            if((m[11]==0)&&(m[8]==0)&&(m[2]==0)&&(m[14]==0))
                simp = simp + "ab\'cd\' + ";
        }
        simp = simp.substring(0, simp.length()-3);
        System.out.println("\nThe reduced equation is : "+simp); 
    }
    catch(NumberFormatException a)
    {
        System.err.println("Enter a number and try again !!");
    }
    catch(IOException e)
    {
        System.err.println("Error occurred !!");
    }
}
}
