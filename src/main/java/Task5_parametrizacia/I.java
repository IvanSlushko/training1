package Task5_parametrizacia;

import java.util.List;

public interface I <T extends Base>{

	
	public List<T> getAlll();

	List<Message> getAll();
	
}
