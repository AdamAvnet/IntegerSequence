import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{

	int currentIndex;
	int[] data;

	public ArraySequence(int[] other){
		int[] data = new int[other.length];
		for(Integer i: other){
			data[i] = other[i];
		}
		reset();
	}

	public void reset(){
		currentIndex = 0;
	}

	public int length(){
		return data.length;
	}

	public boolean hasNext(){
		if(currentIndex < length())
			return true;
		else
			return false;
	}

	public int next(){
		int oldvalue = data[currentIndex];
		currentIndex += 1;
		if(currentIndex > length())
			throw new NoSuchElementException("The end of the sequence has been reached.");
		return oldvalue;
	}
}