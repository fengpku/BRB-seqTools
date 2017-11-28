package model;

import htsjdk.tribble.index.interval.Interval;

public class IntervalLabelled extends Interval
{
	public String gene;
	
	public IntervalLabelled(int start, int end, String gene) 
	{
		super(start, end);
		this.gene = gene;
	}
	
	@Override
	public String toString() {
		return super.toString() + " : " + gene;
	}
}
