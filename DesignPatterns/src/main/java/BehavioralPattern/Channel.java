package BehavioralPattern;

import BehavioralPattern.Viewer;
public interface Channel {
	public void Subscribe(Viewer obj);
	public void unsubscribe(Viewer obj);
	public void notifyviewers();
	public Object getUpdate(Viewer obj);
}
