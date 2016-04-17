public class Bidder extends Observer
 {
private int bidderId ,budget;
	
	public Bidder(Player p,int bidderId,int budget)
	{
		player = p;
		this.bidderId = bidderId;
		this.budget = budget;
		player.attach(this);
	}
	
	@Override
	public void updateBidding()
	{
		int A[] = player.getBidderAndPrice();
		if(bidderId == A[0])
		budget = budget - 10;
		System.out.println(bidderId+" : "+java.util.Arrays.toString(A));
	}
	
	@Override
    public void updateFinalDeal()
	{
		int A[] = player.getBidderAndPrice();
		if(bidderId == A[0])
			budget = budget - A[1] ;
			A[1] = budget;
			int temp = A[0];
			A[0] = A[1];
			A[1] = temp;
		System.out.println(bidderId+" : "+java.util.Arrays.toString(A));
	}

}
