package utils;

import org.eclipse.paho.client.mqttv3.MqttMessage;

public interface MessageHandlerInterface {
	public void onMessageReceived(String topic,MqttMessage msg );

}
