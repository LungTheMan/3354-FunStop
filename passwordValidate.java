
public class passwordValidate 
{
	
	public static boolean validatePassword(String password) 
	{
		
		if (password.length() > 36)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}

}
