package 纸牌三角;

 
public class B纸牌三角形
{
 
	static int count;
	public static void main(String[] args)
	{
		String string="123456789";
		f(string.toCharArray(),0);
		/*这里其实是count/3/2,除以3是排除了旋转，除以2是排除了镜像*/
		System.out.println(count/3/2);
	}
	private static void f(char[] charArray, int i)
	{
		if (i==charArray.length)
		{
			String string=new String(charArray);
			if (check(string))
			{
				count++;
				System.out.println(string);
			}
		}
		
		for (int j = i; j < charArray.length; j++)
		{
			char temp=charArray[j];
			charArray[j]=charArray[i];
			charArray[i]=temp;

			f(charArray, i+1);

			temp=charArray[j];
			charArray[j]=charArray[i];
			charArray[i]=temp;
		}
	}
	private static boolean check(String string)
	{
		int a=getCount(string.substring(0, 4));
		int b=getCount(string.substring(3, 7));
		int c=getCount(string.substring(6, 9)+string.charAt(0));
		if (a==b&&b==c)
		{
			return true;
		}
		return false;
	}
	private static int getCount(String substring)
	{
		int coun=0;
		for (int i = 0; i < substring.length(); i++)
		{
			coun+=Integer.parseInt(substring.charAt(i)+"");
		}
		return coun;
	}

}