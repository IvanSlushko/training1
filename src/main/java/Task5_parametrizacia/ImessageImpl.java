package Task5_parametrizacia;

import java.util.ArrayList;
import java.util.List;

public class ImessageImpl implements I<Message> {
	
	
	public List<Message> getAll() {
		
		List<Message> result = new ArrayList<Message>();
		
		for (int i = 0; i < 10; i++) {
			Message message = new Message();
			message.setMessage(String.valueOf(i));
			result.add(message);

		}
		return result;


	}

	public List<Message> getAlll() {
		// TODO Auto-generated method stub
		return null;
	}

}
