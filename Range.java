import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
	
	private int start, end, current;

	public Range(int starts, int ends){
		start = starts;
		end = ends;
		if(start > end)
			throw new IllegalArgumentException("Start must be less than or equal to end.");
		reset();
	}

	public void reset(){
		current = start;
	}

	public int length(){
		return (end - start) + 1;
	}

	public boolean hasNext(){
		if(current <= end)
			return true;
		else{
			return false;
		}
		
	}

	public int next(){
		int oldvalue = current;
		if(current > end)
			throw new NoSuchElementException("The end of the sequence has been reached.");
		current += 1;
		return oldvalue;
	}

}

	