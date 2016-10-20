package Task5_parametrizacia;

import java.util.ArrayList;
import java.util.List;

public class ImessageImpl implements I<Message> {
	
	
	@Override
	public List<Message> getAll() {
		
		List<Message> result = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			Message message = new Message();
			message.setMessage(String.valueOf(i));
			result.add(message);

		}
		return result;


	}

}
