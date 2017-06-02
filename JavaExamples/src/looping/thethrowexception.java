package looping;

import java.sql.SQLDataException;

public class thethrowexception {

	public static void main(String[] args) throws SQLDataException {
		// TODO Auto-generated method stub

		int h = 21;
		if(h>20)
		{
			throw new SQLDataException("Not a valid FORMAT");
			
		}

	}

}
