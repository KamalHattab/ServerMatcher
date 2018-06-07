package utils;

import org.json.JSONObject;

public interface ZeroMqInterface<E> {

	public void publish(long id, E elemento);
	public JSONObject toJSON(E element);
}
