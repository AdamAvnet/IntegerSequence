import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
	
	private int start, end, current;

	public Range(int starts, int ends){
		start = starts;
		end = ends;
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
			throw new NoSuchElementException("The end of the sequence has been reached.");
		}
	}

	public int next(){
		int oldvalue = current;
		current += 1;
		return oldvalue;
	}

}

	