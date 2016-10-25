package Task5_parametrizacia;

public class Main {

	public static void main(String[] args) {

		ImessageImpl imessage = new ImessageImpl();

		for (Message message : imessage.getAlll()) {
			System.out.println(message.getMessage());

		}

	}

}
