import java.util.*;
import java.io.*;

public class AuctionStage
{
	public static void main(String args[]) throws NumberFormatException
	{
		try
        {
         BufferedReader in = new BufferedReader(new FileReader("input.txt"));//reading files in specified directory
         String s1,s3;
         String s[],s2[];
         s3 = in.readLine();
         Player p = new Player(s3);
        {
			s1 = in.readLine();
			int d = Integer.parseInt(s1);
			//System.out.println(d);
        	for(int i=0 ; i<d ; i++)
        	{
        		 s1 = in.readLine();
        		//System.out.println(s1);
        		s = s1.split(",");
        		int id = Integer.parseInt(s[0]);
				int price = Integer.parseInt(s[1]);
				Bidder bidder = new Bidder(p,id,price);
        		//System.out.println("id :"+id);
        		//System.out.println("price : "+price);
        		//System.out.println("\n");
        	}
			s1 = in.readLine();
			System.out.println("Bidding starts for player "+s3);
			int m = Integer.parseInt(s1);
			for (int l = 1 ; l <=m ; l++)
			{
				s1 = in.readLine();
				s2 = s1.split(",");
				int id = Integer.parseInt(s2[0]);
				int b_price = Integer.parseInt(s2[1]);
				//System.out.println("id1  "+id );
				//System.out.println("b_price  "+b_price);
				if(l==m)
				{
					System.out.println("Bid Winner");
					p.completeDeal(id, b_price);
				}
				else
				{
				    p.setBidderAndPrice(id,b_price);
					System.out.println(" ");
				}
			}
		}
		
        }
         
         catch(Exception e)
		{e.printStackTrace();}
	}
}
