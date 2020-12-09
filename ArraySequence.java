import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{

	int currentIndex;
	int[] data;

	public ArraySequence(int[] other){
		data = new int[other.length];
		for(int i = 0; i < other.length; i++){
			data[i] = other[i];
		}
		reset();
	}

	public ArraySequence(IntegerSequence otherseq){
		int count = 0;
		data = new int[otherseq.length()];
		otherseq.reset();
		while(otherseq.hasNext()){
			data[count] = otherseq.next();
			count += 1;
		}
		reset();
		otherseq.reset();
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
		int oldvalue = 0;
		if(hasNext())
			oldvalue = data[currentIndex];
		currentIndex += 1;
		if(currentIndex > length())
			throw new NoSuchElementException("The end of the sequence has been reached.");
		return oldvalue;
	}
}