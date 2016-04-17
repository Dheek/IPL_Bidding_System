
public class Player {
	private Observer[] observers = new Observer[10];			  
	private String playerName;
	private int biddingPrice , bidderId,Bidders,bidder_count=0;
	
	public Player(String playerName)
	{
		this.playerName = playerName;
	}
	
	public void attach(Observer o)
	{
		observers[bidder_count++] = o;
	}
	
	public int [] getBidderAndPrice()
	{
		int []A = new int[2];
		A[0] = bidderId;
		A[ 1 ] = biddingPrice;
		return A;
	}
	
	public void setBidderAndPrice(int bidderId, int biddingPrice)
	{
		this.bidderId = bidderId;
		this.biddingPrice = biddingPrice;
		notifyBidding();		
	}
	
	public void completeDeal(int bidderId, int biddingPrice)
	{
		this.bidderId = bidderId;
		this.biddingPrice = biddingPrice ;
		notifyDeal();
	}
	
	private void notifyBidding()
	{
		for(int i=0;i<bidder_count;i++)
			observers[i].updateBidding();
	}
	
	public void notifyDeal()
	{
		for(int i=0;i<bidder_count;i++)
			observers[i].updateFinalDeal();
	}
}