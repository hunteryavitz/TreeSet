package TreeSetDemo;

import java.util.Comparator;

public class PubDateDescComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		int i = String.valueOf(((Book) o2).getYear()).compareTo(String.valueOf(((Book) o1).getYear()));
		int j = (((Book) o1).getTitle()).compareTo(((Book) o2).getTitle());
		return (i == 0) ? j : i;
	}
}