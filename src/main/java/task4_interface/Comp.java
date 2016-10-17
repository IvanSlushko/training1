package task4_interface;

class Comp implements Comparable {
	// �������� ���������� Comparator �� Comparable
	// ��, ��� ����� ��������� ��������� ����� �����������
	// ����������

	String str;
	int stoimost;

	Comp(String str, int number) {
		this.str = str;
		this.stoimost = number;
	}

	public int compareTo(Object obj) {
		Comp entry = (Comp) obj;

		int result = str.compareTo(entry.str);// �������� �������� �������
		if (result != 0) { // ��� ��������� �������
			return result;
		}

		result = stoimost - entry.stoimost;// �������� �������� �������
		if (result != 0) {
			return (int) result / Math.abs(result);
		}
		return 0;
	}

}