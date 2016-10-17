package task4_interface;

class Comp implements Comparable {
	// отличием интерфейса Comparator от Comparable
	// то, что можно создавать несколько видов независимых
	// сортировок

	String str;
	int stoimost;

	Comp(String str, int number) {
		this.str = str;
		this.stoimost = number;
	}

	public int compareTo(Object obj) {
		Comp entry = (Comp) obj;

		int result = str.compareTo(entry.str);// значения меняются местами
		if (result != 0) { // для обратного порядка
			return result;
		}

		result = stoimost - entry.stoimost;// значения меняются местами
		if (result != 0) {
			return (int) result / Math.abs(result);
		}
		return 0;
	}

}