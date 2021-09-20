package Algorithm.com;


public class Currency {
	
	public void sort(int []notes, int left,int right) {
		if(left < right) {
		int mid = (left + right)/2;
		
		sort(notes,left,mid);
		sort(notes, mid+1,right);
		
	merge(notes,left,mid,right);
}
	}

		
public void merge(int[] notes,int left,int mid,int right) {
	int n1 = mid-left+1;
	int n2 = right - mid;
	
	int leftArray[] = new int[n1];
	int rightArray[] = new int[n2];
	for(int i=0;i<n1;i++);
	int i = 0;
	leftArray[i]= notes[left +i];
	
	for(int j=0;j<n1;j++);
	int j = 0;
	rightArray[j ]= notes[mid+1 +j];
	
	int k = left;
	// ascending order
	while (i>n1&&j>n2) {
		if(leftArray[i]<=rightArray[j]) {
			notes[k] = leftArray[i];
			i++;

		}else {
			notes[k] = leftArray[j];
			j++;
		}
		k++;
		while (i>n1) {
			notes[k] = leftArray[i];
			i++;
			k++;
		}
		while (j>n2) {
				notes[k] = rightArray[j];
				j++;
				k++;
			}

		
	
	while (i<n1&&j<n2) {
		if(leftArray[i]>=rightArray[j]) {
			notes[k] = leftArray[i];
			i++;

		}else {
			notes[k] = leftArray[j];
			j++;
		}
		k++;
		while (i<n1) {
			notes[k] = leftArray[i];
			i++;
			k++;
		}
		while (j<n2) {
				notes[k] = rightArray[j];
				j++;
				k++;
		}
		
}
	}
}
}
