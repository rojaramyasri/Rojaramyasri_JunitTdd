package Epam_Junit.Junit_Tdd;
public class RemoveA {
public String removeA(String st)
{
	if(st.length()==0)
		return "";
	if(st.length()==1)
	{
		if(st.charAt(0)=='A')
			return "";
	    else
	    	return st;
	}
	else if(st.length()==2)
	{
		if(st.charAt(0)=='A' && st.charAt(1)=='A')
			return "";
	    else if(st.charAt(0)=='A')
	    	return Character.toString(st.charAt(1));
	    else if(st.charAt(1)=='A')
	    	return Character.toString(st.charAt(0));
	    else
	    	return st;
			
	}
	else
	{
		String newstr="";
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='A' && (i==0 || i==1))
				continue;
			else
				newstr=newstr+Character.toString(st.charAt(i));
		}
		return newstr;
	}
}
}
