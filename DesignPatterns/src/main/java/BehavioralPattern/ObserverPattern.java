package BehavioralPattern;
import BehavioralPattern.Viewer;
import BehavioralPattern.ChannelSubscribers;
import BehavioralPattern.Channel;
public class ObserverPattern {
	public static void main(String[] args) {
		NotifyViewers topic = new NotifyViewers();
		Viewer obj1 = new ChannelSubscribers("Subscriber1");
		Viewer obj2 = new ChannelSubscribers("Subscriber2");
		topic.Subscribe(obj1);
		topic.Subscribe(obj2);
		obj1.setSubject(topic);
		obj2.setSubject(topic);
		obj1.update();
		topic.postMessage("A New Video has been uploaded in my channel :)");
	}

}
