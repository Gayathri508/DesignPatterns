package BehavioralPattern;

import java.util.ArrayList;
import java.util.List;

public class NotifyViewers implements Channel{


		private List<Viewer> observers;
		private String message;
		private boolean changed;
		private final Object MUTEX= new Object();
		
		public NotifyViewers(){
			this.observers=new ArrayList<>();
		}
		public void Subscribe(Viewer obj) {
			if(obj == null) throw new NullPointerException("Null Observer");
			synchronized (MUTEX) {
			if(!observers.contains(obj)) observers.add(obj);
			}
		}

		public void unsubscribe(Viewer obj) {
			synchronized (MUTEX) {
			observers.remove(obj);
			}
		}

		@Override
		public void notifyviewers() {
			List<Viewer> observersLocal = null;
			//synchronization is used to make sure any observer registered after message is received is not notified
			synchronized (MUTEX) {
				if (!changed)
					return;
				observersLocal = new ArrayList<>(this.observers);
				this.changed=false;
			}
			for (Viewer obj : observersLocal) {
				obj.update();
			}

		}

		@Override
		public Object getUpdate(Viewer obj) {
			return this.message;
		}
		
		//method to post message to the topic
		public void postMessage(String msg){
			System.out.println("A Message has Posted by the creator:"+msg);
			System.out.println("Notifying my subscribers");
			this.message=msg;
			this.changed=true;
			notifyviewers();
		}

	}


