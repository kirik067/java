package cw;
public class Ex2 {

public static void main (String[] args) throws Exception
{
String s1 = "небо голубое";
StringBuffer s2 = new StringBuffer();
char c;
for (int i=0,pos=0;i<s1.length();i++,pos++)
{
c = s1.charAt(i);
if (c != ' ') s2.insert(pos,c);
else
{
s2.insert(0,c);
pos = -1;
}
}
s1 = s2.toString();
System.out.println(s1);
}
}

