package BehavioralPattern;

public class ChannelSubscribers implements Viewer {
	
	public String name;
	public Channel topic;
	
	public ChannelSubscribers(String nm){
		this.name=nm;
	}
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+": No new message");
		}else
		System.out.println(name+": Displaying message::"+msg);
	}

	public void setSubject(Channel sub) {
		this.topic=sub;
	}

}
