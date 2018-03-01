package info.adro.springtutorial;

import java.util.List;
import java.util.Set;

public class SomeBean {

	List <String> stringsList;
	Set<Integer> integersList;
	Long[] longArray;

	public SomeBean(List<String> stringsList, Set<Integer> integersList, Long[] longArray) {
		super();
		this.integersList = integersList;
		this.longArray = longArray;
		this.stringsList = stringsList;
	}


	public List<String> getStringsList() {
		return stringsList;
	}
	public void setStringsList(List<String> stringsList) {
		this.stringsList = stringsList;
	}
	public Set<Integer> getIntegersList() {
		return integersList;
	}
	public void setIntegersList(Set<Integer> integersList) {
		this.integersList = integersList;
	}
	public Long[] getLongArray() {
		return longArray;
	}
	public void setLongArray(Long[] longArray) {
		this.longArray = longArray;
	}
}
